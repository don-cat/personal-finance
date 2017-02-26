package com.doncat.pf.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 支出类型枚举。ET代表ExpenseType
 * @author mamay
 *
 */
public enum EnumExpenseType {
	
		/*
		 * 支出类型首位为0，收入类型首位为1
		 */
		CLOTHING("服饰","000"),
		FOOD("三餐","001"),
		TRANSPORT("交通","002"),
		LIVING("住宿","003"),
		INTERTAINMENT("娱乐","004"),
		STUDY("学习","005"),
		SPORT("运动","006");
		
		private String dailyType;
		private String code;
		
		private EnumExpenseType(String dailyType,String code){
			this.dailyType = dailyType;
			this.code = code;
		}
		
		
		public static String getDailyTypeName(String code) {
			for (EnumExpenseType type:EnumExpenseType.values()){//枚举类型里的values是把枚举遍历一遍，组成一个数组
				if(type.getCode()==code){
					return type.dailyType;
				}
			}
			return null;
		}
		
		public static String getDailyTypeCode(String name) {
			for (EnumExpenseType type:EnumExpenseType.values()){
				if(type.getDailyType()==name){
					return type.code;
				}
			}
			return null;
		}
		
		public String getDailyType() {
			return dailyType;
		}

		public void setDailyType(String dailyType) {
			this.dailyType = dailyType;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public static Map<String,String> getAllMap(){
			EnumExpenseType[] et = EnumExpenseType.values();
			Map<String,String> map = new HashMap<String,String>();
			for (EnumExpenseType e : et) {
				map.put(e.getCode(), e.getDailyType());
			}
			return map;
		}
	
}
