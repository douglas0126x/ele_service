package com.ele.common.upload.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.ele.common.utils.util.ResourceUtil;
import com.ele.common.utils.util.UploadFile;

/**
 * upload c of mvc 
 * @author yaoxj
 * @time 2017年5月20日上午11:31:18
 */

@Controller
@RequestMapping("/upload")
public class UploadController {
	
	@RequestMapping("/spring")
	public String tradition(HttpServletRequest request){
		return "upload_spring";
	}
	
	@RequestMapping("/springmvc")
	public String demo(HttpServletRequest request){
		return "upload_springmvc";
	}
	
	/**
	 * 文件上传方法，要求：spring mvc 无multipartResolver
	 * @param request
	 * @return
	 */
	@RequestMapping("/file_spring")
	public String upload_spring(HttpServletRequest request){
		String upload_path = ResourceUtil.getUpload_path();
		if(UploadFile.uploads(request,upload_path)){
			return "login";
		}
		return "upload_spring";
	}
	
	/**
	 * 文件上传方法，要求：spring mvc 配置 multipartResolver
	 * @param file1
	 * @param file2
	 * @param description1
	 * @param description2
	 * @return
	 */
	@RequestMapping("/file_springmvc")
	public String upload_springmvc(MultipartFile first_f,MultipartFile second_f,String desp_1,String desp_2){
		
		String upload_path = ResourceUtil.getUpload_path();
		
		if(null != first_f && first_f.getSize() >0 &&  UploadFile.upload(first_f, upload_path) && (second_f == null || second_f.getSize() == 0  ) ){
			return "login";
		}else if( second_f != null  &&  UploadFile.upload(second_f, upload_path) && (first_f == null ||  first_f.getSize() == 0 )){
			return "login";
		}else if(null != first_f && first_f.getSize() >0 && second_f != null && second_f.getSize() >0 && UploadFile.upload(first_f, upload_path) && UploadFile.upload(second_f, upload_path)){
			return "login";
		}
		
		return "upload_springmvc";
	}
	
	
}
