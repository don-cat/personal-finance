package com.doncat.pf.model;
/*
 * ÿ���˵�
 */

import com.doncat.pf.enums.EnumExpenseType;

public class MonthBill {
	private String abName;	
	private String type;
	public String getAbName() {
		return abName;
	}
	public void setAbName(String abName) {
		this.abName = abName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
