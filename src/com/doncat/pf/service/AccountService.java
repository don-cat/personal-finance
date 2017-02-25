package com.doncat.pf.service;

import java.math.BigDecimal;

import com.doncat.pf.dao.AccountDao;

public class AccountService {
	public void AddAccount(int accoType,BigDecimal amount,String RecordType,String CurrencyType){
		AccountDao addAccoDao = new AccountDao();
//		addAccoDao.addAccount(userid, accoType, amount, RecordType, CurrencyType);;
	}
}
