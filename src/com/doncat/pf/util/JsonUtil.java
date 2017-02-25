package com.doncat.pf.util;

import net.sf.json.JSONArray;

public class JsonUtil {

	/**
	 * ¶ÔÏó×ª×Ö·û´®
	 * @param respJson
	 * @return
	 */
	public static String obj2Str(Object respJson) {
        try {
			JSONArray jsonArray = JSONArray.fromObject(respJson);
			return jsonArray.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
	}

}
