package model;

public enum EnumIncomeType {
	/*
	 * ֧��������λΪ0������������λΪ1
	 */
	SALARY("����","100"),
	REDPACKAGE("���","101"),
	PARTTIMEJOB("��ְ","102"),
	INVEST("Ͷ������","103"),
	INTERTAINMENT("����","104"),
	STUDY("ѧϰ","105"),
	SPORT("�˶�","106");
	
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
