package com.doncat.pf.model;

import java.math.BigDecimal;

/**
 * ��Ŀ���󣬶�Ӧһ����¼���������Ŀ������˱���AccountBill)
 * @author don-cat
 *
 */
public class Account {
	private String id;
	private String userid;
	private String accountType;//��or֧
	private BigDecimal amount;//���
	private String RecordType;//����or��������
	private String CurrencyType;//����
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getRecordType() {
		return RecordType;
	}
	public void setRecordType(String recordType) {
		RecordType = recordType;
	}
	public String getCurrencyType() {
		return CurrencyType;
	}
	public void setCurrencyType(String currencyType) {
		CurrencyType = currencyType;
	}
	public String getUserid() {
		return userid;
	}
}
