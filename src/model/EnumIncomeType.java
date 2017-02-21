package model;

public enum EnumIncomeType {
	/*
	 * ֧��������λΪ0������������λΪ1
	 */
	SALARY("����","201"),
	REDPACKAGE("���","202"),
	PARTTIMEJOB("��ְ","203"),
	INVEST("Ͷ������","202"),
	INTERTAINMENT("����","204"),
	STUDY("ѧϰ","205"),
	SPORT("�˶�","206");
	
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
