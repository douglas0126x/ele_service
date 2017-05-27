package com.ele.common.utils.util;


import java.util.ResourceBundle;

/**
 * 类路径下：config资源获取
 * @author yaoxj
 *
 */
public class ResourceUtil {
	private static final ResourceBundle bundle = ResourceBundle.getBundle("config");

	/**
	 * 二维码系统地址
	 * @return
	 */
	public static final String getQRCodeSystemURL() {
		return bundle.getString("QRCode_system_URL");
	}
	
	/**
	 * 文件上传路径
	 * @return
	 */
	public static final String getUpload_path() {
		return bundle.getString("upload_path");
	}
}