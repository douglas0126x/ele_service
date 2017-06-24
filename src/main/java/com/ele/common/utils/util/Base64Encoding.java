package com.ele.common.utils.util;

import org.apache.commons.codec.binary.Base64;

/**
 * 对url加密的加密解密算法，这样的加密结果只有数字和字母
 * 
 * @author Administrator
 */
public class Base64Encoding {

	/**
	 * BASE64加密
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String encryptBASE64(byte[] key) throws Exception {
		return new String(Base64.encodeBase64URLSafe(key));
	}

	/**
	 * BASE64解密
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] decryptBASE64(String key) throws Exception {
		return Base64.decodeBase64(key.getBytes());
	}
}