package model;
/**
 * 支出类型枚举。ET代表ExpenseType
 * @author mamay
 *
 */
public enum EnumExpenseType {
	
		/*
		 * 支出类型首位为0，收入类型首位为1
		 */
		CLOTHING("服饰","001"),
		FOOD("三餐","002"),
		TRANSPORT("交通","003"),
		LIVING("住宿","002"),
		INTERTAINMENT("娱乐","004"),
		STUDY("学习","005"),
		SPORT("运动","006");
		
		private String dailyType;
		private String code;
		
		private EnumExpenseType(String dailyType,String code){
			this.dailyType = dailyType;
			this.code = code;
		}
		
		
		public String getDailyTypeName(String code) {
			for (EnumExpenseType type:EnumExpenseType.values()){//枚举类型里的values是把枚举遍历一遍，组成一个数组
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
