package model;
/*
 * √ø‘¬’Àµ•
 */

import model.EnumExpenseType.dailyET;

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

	
	
	public static void main(String[] args) {
		System.out.println(dailyET.CLOTHING);
	}
}
