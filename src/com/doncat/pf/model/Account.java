package com.doncat.pf.model;

import java.math.BigDecimal;

/**
 * 账目对象，对应一条记录。许多条账目即组成账本（AccountBill)
 * @author don-cat
 *
 */
public class Account {
	private String id;
	private String userid;
	private String accountType;//收or支
	private BigDecimal amount;//金额
	private String RecordType;//消费or收入的类别
	private String CurrencyType;//币种
	
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
