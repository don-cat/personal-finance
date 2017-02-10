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
//		CLOTHING,FOOD,TRANSPORT,LIVING,INTERTAINMENT,STUDY,HEALTH
		CLOTHING("服饰",201),
		FOOD("三餐",202),
		TRANSPORT("交通",202),
		LIVING("住宿",202),
		INTERTAINMENT("娱乐",202),
		STUDY("学习",202),
		SPORT("运动",202);
		
		private String dailyType;
		private int code;
		
		private EnumExpenseType(String dailyType,int code){
			this.dailyType = dailyType;
			this.code = code;
		}
	
		/*
		 * 旅游账本默认支出类型
		 */
//		TRANSPORT,ACCOMMODATION,ADMISSIONTICKET,FOOD,PASSBOOK
	
}
