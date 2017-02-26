package com.doncat.pf.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDao {
	public boolean addAccount(long id,String userid,String accountType,BigDecimal amount,String RecordType,String CurrencyType){
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		
		String sql_addAccount="insert into personal_finance.account (id,userid,accountType,amount,RecordType,CurrencyType) values ('"+id+"','"+userid+"','"+accountType+"',"+amount.toString()+",'"+RecordType+"','"+CurrencyType+"');";
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
}
