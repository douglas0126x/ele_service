package com.ele.common.utils.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 文件上传方法
 * @author yaoxj
 * @time 2017年6月24日下午4:41:53
 */
public class CommonUpload {
	
	String str = "";
	/**
	 * test
	 * @throws Exception
	 */
	public static void get() throws Exception{
		String ss="";
		File f_text = new File("F:/pu_piao.txt");
		FileInputStream fis = new FileInputStream(f_text);
		byte[] b_text = new byte[(int) f_text.length()];
		File file = new File(ResourceUtil.getUpload_path()+"test.JPG");
		FileOutputStream out = new FileOutputStream(file);
		while(fis.read(b_text)!=-1){
			ss = new String(b_text);			
		}
		byte[] picBytes = Base64Encoding.decryptBASE64(ss);	
		out.write(picBytes);
		out.flush();
		out.close();
	}
	
	/**
	 * main
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		get();
		System.out.println(1);
	}
	
	/**
	 * upload file by byte array
	 * @param b  保存的二进制数组
	 * @param fileName 文件保存路径+文件名
	 * @throws Exception
	 */
	public static boolean upload(byte[] b,String fileName){
		
		File file = new File(fileName);
		try {
			FileOutputStream out = new FileOutputStream(file);
			out.write(b);
			
			out.flush();
			out.close();
			return true;
		}  catch (IOException e) {
//			e.printStackTrace();
			return false;
		}
		
		
	}
}
