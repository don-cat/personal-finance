package com.doncat.pf.service;

import java.math.BigDecimal;
import java.util.Date;

import com.doncat.pf.dao.AccountDao;
import com.doncat.pf.model.Account;

public class AddAccountService {
	public boolean AddAccount(String userid,String accountType,BigDecimal amount,String RecordType,String CurrencyType){
		AccountDao addAccoDao = new AccountDao();
		Date currentTime = new Date();
		Long time = currentTime.getTime();
		//装载账目对象
		Account acco = new Account();
		acco.setAccountType(accountType);
		acco.setAmount(amount);
		acco.setCurrencyType(CurrencyType);
		acco.setRecordType(RecordType);
		acco.setUserid(userid);
		acco.setId(time.toString());
		
		return(addAccoDao.addAccount(acco));
	}
}
