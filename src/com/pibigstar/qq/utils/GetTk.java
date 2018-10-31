package com.pibigstar.qq.utils;

/**
 * �õ�g_tk
 * @author pibigstar
 *
 */
public class GetTk {

	public static String getTk(String skey) {
		int hash = 5381;  
		for(int i = 0, len = skey.length(); i < len; ++i){  
			hash += (hash << 5) + (int)(char)skey.charAt(i);  
		}  
		return (hash & 0x7fffffff)+"";  
	}  

}
