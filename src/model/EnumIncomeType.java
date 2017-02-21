package model;

public enum EnumIncomeType {
	/*
	 * 支出类型首位为0，收入类型首位为1
	 */
	SALARY("工资","201"),
	REDPACKAGE("红包","202"),
	PARTTIMEJOB("兼职","203"),
	INVEST("投资收益","202"),
	INTERTAINMENT("娱乐","204"),
	STUDY("学习","205"),
	SPORT("运动","206");
	
	private String dailyType;
	private String code;
	
	private EnumIncomeType(String dailyType,String code){
		this.dailyType = dailyType;
		this.code = code;
	}
	
	
	public String getDailyType(String code) {
		for (EnumExpenseType type:EnumExpenseType.values()){
			if(type.getCode()==code){
				return dailyType;
			}
		}
		return null;
	}
	
	public String getDailyTypeCode(String name) {
		for (EnumExpenseType type:EnumExpenseType.values()){
			if(type.getDailyType()==name){
				return code;
			}
		}
		return null;
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

	public void getAllType(){
		EnumExpenseType[] et = EnumExpenseType.values();
	}
}
