package model;

public enum EnumIncomeType {
	/*
	 * 支出类型首位为0，收入类型首位为1
	 */
	SALARY("工资","100"),
	REDPACKAGE("红包","101"),
	PARTTIMEJOB("兼职","102"),
	INVEST("投资收益","103"),
	INTERTAINMENT("娱乐","104"),
	STUDY("学习","105"),
	SPORT("运动","106");
	
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
	
	public String getDailyTypeCode(String name) {
		for (EnumExpenseType type:EnumExpenseType.values()){
			if(type.getDailyType()==name){
				return type.getCode();
			}
		}
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

	public void getAllType(){
		EnumExpenseType[] et = EnumExpenseType.values();
	}
}
