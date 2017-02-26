package com.doncat.pf.util;

import net.sf.json.JSONObject;

public class JsonUtil {

	/**
	 * ¶ÔÏó×ª×Ö·û´®
	 * @param respJson
	 * @return
	 */
	public static String obj2Str(Object respJson) {
        try {
        	JSONObject jsonObject = JSONObject.fromObject(respJson);
//			JSONArray jsonArray = JSONArray.fromObject(respJson);
			return jsonObject.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
	}
}
