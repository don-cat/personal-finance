package model;

public enum EnumCurrency{
/*
 * ����
 */
	CNY("�����",0),
	FRF("��������",1),
	HKD("��Ԫ",2),
	AUD("�Ĵ�����Ԫ",3),
	CHF("��ʿ����",4),
	USD("��Ԫ",5),
	CAD("���ô�Ԫ",6),
	GBP("Ӣ��",7),
	JPY("��Ԫ",8),
	EUR("ŷԪ",9);
	
		
	private String name;
	private int index;
		
	private EnumCurrency(String name,int index){
		this.name=name;
		this.index=index;
	}
	
	public String getName(int index){
		for(EnumCurrency et:EnumCurrency.values()){
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
