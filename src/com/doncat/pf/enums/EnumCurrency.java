package com.doncat.pf.enums;

import java.util.HashMap;
import java.util.Map;

public enum EnumCurrency{
/*
 * 币种
 */
	CNY("人民币","000"),
	FRF("法国法郎","001"),
	HKD("港元","002"),
	AUD("澳大利亚元","003"),
	CHF("瑞士法郎","004"),
	USD("美元","005"),
	CAD("加拿大元","006"),
	GBP("英镑","007"),
	JPY("日元","008"),
	EUR("欧元","009");
	
		
	private String name;
	private String code;
		
	private EnumCurrency(String name,String code){
		this.name=name;
		this.code=code;
	}
	
	public String getName(String code){
		for(EnumCurrency et:EnumCurrency.values()){
			if(et.getcode()==code){
				return et.name;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcode() {
		return code;
	}

	public void setcode(String code) {
		this.code = code;
	}
	
	public static Map<String,String> getAllMap(){
		Map<String,String> currencyMap= new HashMap<String,String>();
		for(EnumCurrency et:EnumCurrency.values()){
			currencyMap.put(et.code, et.name);
		}
		return currencyMap;
	}
}
