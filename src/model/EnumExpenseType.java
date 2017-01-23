package model;
/**
 * 支出类型枚举。ET代表ExpenseType
 * @author mamay
 *
 */
public class EnumExpenseType {
	public enum dailyET{
		/*
		 * 日常生活账本默认支出类型
		 */
		CLOTHING,FOOD,TRANSPORT,LIVING,INTERTAINMENT,STUDY,HEALTH
	}
	
	public enum travelET{
		/*
		 * 旅游账本默认支出类型
		 */
		TRANSPORT,ACCOMMODATION,ADMISSIONTICKET,FOOD,PASSBOOK
	}
	
}
