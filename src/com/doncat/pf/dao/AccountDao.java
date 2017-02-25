package com.doncat.pf.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDao {
	public void addAccount(String userid,String accountType,BigDecimal amount,String RecordType,String CurrencyType){
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		
		String sql_addAccount="insert into personal_finance.account (userid,accountType,amount,RecordType,CurrencyType) values ('"+userid+"','"+accountType+"',"+amount.toString()+",'"+RecordType+"','"+CurrencyType+"');";
		try {
			int rs_addasset = stmt.executeUpdate(sql_addAccount);
			if (rs_addasset==1){
				System.out.println("添加成功！"	);
			}else System.out.println("添加失败！");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
