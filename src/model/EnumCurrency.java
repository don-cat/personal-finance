package model;

public enum EnumCurrency{
/*
 * 币种
 */
	CNY("人民币",0),
	FRF("法国法郎",1),
	HKD("港元",2),
	AUD("澳大利亚元",3),
	CHF("瑞士法郎",4),
	USD("美元",5),
	CAD("加拿大元",6),
	GBP("英镑",7),
	JPY("日元",8),
	EUR("欧元",9);
	
		
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
