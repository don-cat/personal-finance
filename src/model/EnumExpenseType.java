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
//		CLOTHING,FOOD,TRANSPORT,LIVING,INTERTAINMENT,STUDY,HEALTH
		CLOTHING("����",201),
		FOOD("����",202),
		TRANSPORT("��ͨ",202),
		LIVING("ס��",202),
		INTERTAINMENT("����",202),
		STUDY("ѧϰ",202),
		SPORT("�˶�",202);
		
		private String dailyType;
		private int code;
		
		private EnumExpenseType(String dailyType,int code){
			this.dailyType = dailyType;
			this.code = code;
		}
	
		/*
		 * �����˱�Ĭ��֧������
		 */
//		TRANSPORT,ACCOMMODATION,ADMISSIONTICKET,FOOD,PASSBOOK
	
}
