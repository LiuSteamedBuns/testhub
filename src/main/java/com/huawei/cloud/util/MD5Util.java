package com.huawei.cloud.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MD5Util {

	private static final char[] HEX = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	/**
	 * 使用MD5算法加密
	 * @param content 待加密的字符串（明文）
	 * @return 加密之后的字符串（密文）
	 */
	public static String md5(String content)
	{
		try {
			//1.返回实现指定摘要算法的 MessageDigest 对象
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			
			//2.获取待加密字符串（明文）的字节数组
			byte[] input = content.getBytes();
			
			//3.使用指定的 byte 数组更新摘要
			messageDigest.update(input);
			
			//4.加密：完成哈希计算
			byte[] bytes = messageDigest.digest();//获取长度为16的字节数组
 		
			//5.遍历将每个字节拆成两个十六进制数字
			char[] result = new char[bytes.length * 2];
			int k = 0;
			for (int i = 0; i < bytes.length; i++) {
				//一个字节
				byte b = bytes[i];
				
				int left4 = b >>> 4 & 0xF;//左边四位
				int right4 = b & 0xF;     //右边四位
				
				result[k++] = HEX[left4];
				result[k++] = HEX[right4];
			}
			return new String(result);
 		
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
}
