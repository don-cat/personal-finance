package com.doncat.pf.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Statement;

import com.doncat.pf.model.Account;

public class AccountDao {
	public boolean addAccount(Account acc){
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		
		String sql_addAccount="insert into personal_finance.account (id,userid,accountType,amount,RecordType,CurrencyType) values ('"+acc.getId()+"','"+acc.getUserid()+"','"+acc.getAccountType()+"',"+acc.getAmount()+",'"+acc.getRecordType()+"','"+acc.getCurrencyType()+"');";
		System.out.println(sql_addAccount);
		try {
			int rs_addasset = stmt.executeUpdate(sql_addAccount);
			if (rs_addasset==1){
				return true;
			}else return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
//	public 
}
