package com.doncat.pf.service;

import java.math.BigDecimal;
import java.util.Date;

import com.doncat.pf.dao.AccountDao;

public class AccountService {
	public boolean AddAccount(String userid,String accountType,BigDecimal amount,String RecordType,String CurrencyType){
		AccountDao addAccoDao = new AccountDao();
		Date currentTime = new Date();
		long id = currentTime.getTime();
		return(addAccoDao.addAccount(id,userid, accountType, amount, RecordType, CurrencyType));
	}
}
