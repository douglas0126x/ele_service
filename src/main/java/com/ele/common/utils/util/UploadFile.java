package com.ele.common.utils.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.base.Strings;

public class UploadFile {
	
	/**
	 * 主要采用org.apache.commons.fileupload 方法
	 * @param request 请求
	 * @param savePath 文件保存路径，如果为Null，默认是classes路径
	 * @return
	 */
	public static Boolean uploads(HttpServletRequest request,String savePath){ 
		
        URL resource = UploadFile.class.getResource("/");
        if(savePath == null ||savePath.trim().length()==0){
        	savePath =resource.getFile();
        }
        //得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
        File file = new File(savePath);
        if(!file.exists()&&!file.isDirectory()){
            System.out.println("目录或文件不存在！");
            file.mkdir();
        }
        //消息提示
        try {
            //使用Apache文件上传组件处理文件上传步骤：
            //1、创建一个DiskFileItemFactory工厂
            DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
            //2、创建一个文件上传解析器
            ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
            //解决上传文件名的中文乱码
            fileUpload.setHeaderEncoding("UTF-8");
            //3、判断提交上来的数据是否是上传表单的数据
            if(!fileUpload.isMultipartContent(request)){
                //按照传统方式获取数据
//                return ;
            	System.out.println("表单数据，传统方式获取！");
            }
            //4、使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
            List<FileItem> list = fileUpload.parseRequest(request);
            for (FileItem item : list) {
                //如果fileitem中封装的是普通输入项的数据
                if(item.isFormField()){
                    String name = item.getFieldName();
                    //解决普通输入项的数据的中文乱码问题
                    String value = item.getString("UTF-8");
                    String value1 = new String(name.getBytes("iso8859-1"),"UTF-8");
                    System.out.println(name+"="+value);
//                    System.out.println(name+"= "+value1);
                }else{
                    //如果fileitem中封装的是上传文件，得到上传的文件名称，
                    String fileName = item.getName();
                    System.out.println(fileName);
                    if(fileName==null||fileName.trim().equals("")){
                        continue;
                    }
                    //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
                    //处理获取到的上传文件的文件名的路径部分，只保留文件名部分
                    fileName = fileName.substring(fileName.lastIndexOf(File.separator)+1);
                    //获取item中的上传文件的输入流
                    InputStream is = item.getInputStream();
                    //创建一个文件输出流
                    FileOutputStream fos = new FileOutputStream(savePath+File.separator+fileName);
                    //创建一个缓冲区
                    byte buffer[] = new byte[1024];
                    //判断输入流中的数据是否已经读完的标识
                    int length = 0;
                    //循环将输入流读入到缓冲区当中，(len=in.read(buffer))>0就表示in里面还有数据
                    while((length = is.read(buffer))>0){
                        //使用FileOutputStream输出流将缓冲区的数据写入到指定的目录(savePath + "\\" + filename)当中
                        fos.write(buffer, 0, length);
                    }
                    //关闭输入流
                    is.close();
                    //关闭输出流
                    fos.close();
                    //删除处理文件上传时生成的临时文件
                    item.delete();
                }
                
            }
            
            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("上传失败");
            return false;
        }
	}
	
	/**
	 * springmvc 方式保存文件
	 * @param file 上传文件
	 * @param filePath 如果为空则默认保存在config.properties 文件中 upload_path 路径
	 * @return
	 */
	public static Boolean upload(MultipartFile file, String filePath) {

		if (!file.isEmpty()) {

			if (Strings.isNullOrEmpty(filePath)) {
				filePath = ResourceUtil.getUpload_path();
			}

			File path = new File(filePath + file.getOriginalFilename());
			if (!path.exists()) {
				path.mkdirs();
			}
			// 转存文件
			try {
				file.transferTo(path);
				return true;
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;

	}
}
