package com.util;

import javax.servlet.http.Cookie;

public class CookiesUtil {
	
	public static Cookie getCookie(Cookie[] cookies, String key) {
		Cookie cookieselect = null;
		for (Cookie cookie : cookies) {
			if(cookie.getName()==key) {
				cookieselect = cookie;
				String value = cookie.getValue();
				String[] split = value.split("#");
				System.out.println(split);
			}
		}
		return cookieselect;
	}
}
