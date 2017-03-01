package com.doncat.pf.service;

import java.util.ArrayList;

import com.doncat.pf.dao.AccountDao;
import com.doncat.pf.model.Account;
/**
 * 获取某用户的全部记账记录，返回list
 * @author don-cat
 *
 */
public class ShowAccountBillService {
	public ArrayList<Account> showAccountBill(String userid){
		AccountDao ad = new AccountDao();
		return ad.queryUserAccount(userid);
	}
}
