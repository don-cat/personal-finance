package com.doncat.pf.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * ֧������ö�١�ET����ExpenseType
 * @author mamay
 *
 */
public enum EnumExpenseType {
	
		/*
		 * ֧��������λΪ0������������λΪ1
		 */
		CLOTHING("����","000"),
		FOOD("����","001"),
		TRANSPORT("��ͨ","002"),
		LIVING("ס��","003"),
		INTERTAINMENT("����","004"),
		STUDY("ѧϰ","005"),
		SPORT("�˶�","006");
		
		private String dailyType;
		private String code;
		
		private EnumExpenseType(String dailyType,String code){
			this.dailyType = dailyType;
			this.code = code;
		}
		
		
		public static String getDailyTypeName(String code) {
			for (EnumExpenseType type:EnumExpenseType.values()){//ö���������values�ǰ�ö�ٱ���һ�飬���һ������
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
