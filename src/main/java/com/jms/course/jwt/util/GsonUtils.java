package com.jms.course.jwt.util;

import com.google.gson.Gson;

public class GsonUtils {
	
	public static String serializae(Object src) {
		Gson gson = new Gson();
		return gson.toJson(src);
	}
	
	public static <D> D toObject(String json, Class<D> dClass) {
		Gson gson = new Gson();
		return gson.fromJson(json, dClass);
	}
	
	public static <D> D toObject(Object src, Class<D> dClass) {
		Gson gson = new Gson();
		String srcJson = gson.toJson(src);
		return gson.fromJson(srcJson, dClass);
	}

}
