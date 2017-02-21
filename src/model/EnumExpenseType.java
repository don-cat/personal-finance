package model;
/**
 * ֧������ö�١�ET����ExpenseType
 * @author mamay
 *
 */
public enum EnumExpenseType {
	
		/*
		 * ֧��������λΪ0������������λΪ1
		 */
		CLOTHING("����","001"),
		FOOD("����","002"),
		TRANSPORT("��ͨ","003"),
		LIVING("ס��","002"),
		INTERTAINMENT("����","004"),
		STUDY("ѧϰ","005"),
		SPORT("�˶�","006");
		
		private String dailyType;
		private String code;
		
		private EnumExpenseType(String dailyType,String code){
			this.dailyType = dailyType;
			this.code = code;
		}
		
		
		public String getDailyTypeName(String code) {
			for (EnumExpenseType type:EnumExpenseType.values()){//ö���������values�ǰ�ö�ٱ���һ�飬���һ������
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
		
		public String getDailyType() {
			return dailyType;
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
