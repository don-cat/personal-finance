package com.doncat.pf.enums;

import java.util.HashMap;
import java.util.Map;

public enum EnumIncomeType {
	/*
	 * 支出类型首位为0，收入类型首位为1
	 */
	SALARY("工资","100"),
	REDPACKAGE("红包","101"),
	PARTTIMEJOB("兼职","102"),
	INVEST("投资收益","103");
	
	private String dailyType;
	private String code;
	
	private EnumIncomeType(String dailyType,String code){
		this.dailyType = dailyType;
		this.code = code;
	}
	
	
	public static String getDailyType(String code) {
		for (EnumExpenseType type:EnumExpenseType.values()){
			if(type.getCode()==code){
				return type.getDailyType();
			}
		}
		return null;
	}
	
	public static String getDailyTypeCode(String name) {
		for (EnumExpenseType type:EnumExpenseType.values()){
			if(type.getDailyType()==name){
				return type.getCode();
			}
		}
		return null;
	}

	public static Map<String,String> getAllType2Map(){
		EnumExpenseType[] et = EnumExpenseType.values();
		return null;
	}

	public void setDailyType(String dailyType) {
		this.dailyType = dailyType;
	}
	
	public String getDailyType() {
		return dailyType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static Map<String,String> getAllMap(){
		EnumIncomeType[] et = EnumIncomeType.values();
		Map<String,String> map = new HashMap<String,String>();
		for (EnumIncomeType e : et) {
			map.put(e.getCode(), e.getDailyType());
		}
		return map;
	}
}
