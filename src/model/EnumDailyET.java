package model;

public enum EnumDailyET{
/*
 * �ճ������˱�Ĭ��֧������
 */
	CNY("�����",1),FRF("��������",2),HKD("��Ԫ",3),CHF("��ʿ����",4),USD("��Ԫ",5),CAD("���ô�Ԫ",6),GBP("Ӣ��",7),JPY("��Ԫ",8),EUR("ŷԪ",9),AUD("�Ĵ�����Ԫ",10);
		
	private String name;
	private int index;
		
	private EnumDailyET(String name,int index){
		this.name=name;
		this.index=index;
	}
	
	public String getName(int index){
		for(EnumDailyET et:EnumDailyET.values()){
			if(et.getIndex()==index){
				return et.name;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
