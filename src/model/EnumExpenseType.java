package model;
/**
 * 支出类型枚举。ET代表ExpenseType
 * @author mamay
 *
 */
public enum EnumExpenseType {
	
		/*
		 * 支出类型首位为2，收入类型首位为1
		 */
		CLOTHING("服饰",201),
		FOOD("三餐",202),
		TRANSPORT("交通",203),
		LIVING("住宿",202),
		INTERTAINMENT("娱乐",204),
		STUDY("学习",205),
		SPORT("运动",206);
		
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
