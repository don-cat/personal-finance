package com.doncat.pf.enums;

import java.util.HashMap;
import java.util.Map;

public enum EnumCurrency{
/*
 * ����
 */
	CNY("�����","000"),
	FRF("��������","001"),
	HKD("��Ԫ","002"),
	AUD("�Ĵ�����Ԫ","003"),
	CHF("��ʿ����","004"),
	USD("��Ԫ","005"),
	CAD("���ô�Ԫ","006"),
	GBP("Ӣ��","007"),
	JPY("��Ԫ","008"),
	EUR("ŷԪ","009");
	
		
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
