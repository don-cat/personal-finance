package model;

public enum EnumIncomeType {
	/*
	 * ֧��������λΪ2������������λΪ1
	 */
	SALARY("����",201),
	REDPACKAGE("���",202),
	PARTTIMEJOB("��ְ",203),
	INVEST("Ͷ������",202),
	INTERTAINMENT("����",204),
	STUDY("ѧϰ",205),
	SPORT("�˶�",206);
	
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
