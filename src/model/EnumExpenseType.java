package model;
/**
 * ֧������ö�١�ET����ExpenseType
 * @author mamay
 *
 */
public enum EnumExpenseType {
	
		/*
		 * ֧��������λΪ2������������λΪ1
		 */
		CLOTHING("����",201),
		FOOD("����",202),
		TRANSPORT("��ͨ",203),
		LIVING("ס��",202),
		INTERTAINMENT("����",204),
		STUDY("ѧϰ",205),
		SPORT("�˶�",206);
		
		private String dailyType;
		private int code;
		
		private EnumExpenseType(String dailyType,int code){
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
		
		public String getDailyType() {
			return dailyType;
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
