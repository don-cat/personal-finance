package model;

public enum EnumIncomeType {
	/*
	 * 支出类型首位为2，收入类型首位为1
	 */
	SALARY("工资",201),
	REDPACKAGE("红包",202),
	PARTTIMEJOB("兼职",203),
	INVEST("投资收益",202),
	INTERTAINMENT("娱乐",204),
	STUDY("学习",205),
	SPORT("运动",206);
	
	private String dailyType;
	private int code;
	
	private EnumIncomeType(String dailyType,int code){
		this.dailyType = dailyType;
		this.code = code;
	}
	
	
	public String getDailyType(int code) {
		for (EnumExpenseType type:EnumExpenseType.values()){
			if(type.getCode()==code){
				return dailyType;
			}
		}
		return null;
	}

	public void setDailyType(String dailyType) {
		this.dailyType = dailyType;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void getAllType(){
		EnumExpenseType[] et = EnumExpenseType.values();
	}
}
