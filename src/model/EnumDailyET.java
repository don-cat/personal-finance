package model;

public enum EnumDailyET{
/*
 * 日常生活账本默认支出类型
 */
	CNY("人民币",1),FRF("法国法郎",2),HKD("港元",3),CHF("瑞士法郎",4),USD("美元",5),CAD("加拿大元",6),GBP("英镑",7),JPY("日元",8),EUR("欧元",9),AUD("澳大利亚元",10);
		
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
