package com.doncat.pf.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.doncat.pf.dao.AccountDao;
import com.doncat.pf.model.Account;

/**
 * ��ѯ������û� ָ��ʱ����ڵ������˵���¼
 * @author mamay
 *
 */
public class QueryAccountService {
	public ArrayList<Account> QueryAccount(String userid){
		AccountDao queryAccoDao = new AccountDao();
		ArrayList<Account> accountList= queryAccoDao.queryUserAccount(userid);
		
		return(accountList);
	}
}
