package com.doncat.pf.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.doncat.pf.model.Account;
import com.mysql.jdbc.ResultSetMetaData;

public class AccountDao {
	public boolean addAccount(Account acc){
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		
		String sql_addAccount="insert into personal_finance.account (id,userid,accountType,amount,RecordType,CurrencyType) values ('"+acc.getId()+"','"+acc.getUserid()+"','"+acc.getAccountType()+"',"+acc.getAmount()+",'"+acc.getRecordType()+"','"+acc.getCurrencyType()+"');";
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
	
	public ArrayList<Account> queryUserAccount(String userid){
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		ArrayList<Account> returnAccountList = new ArrayList<Account>();
		
		try {
			String sql_queryAccount="SELECT * FROM personal_finance.account where userid='"+userid+"';";
			ResultSet rs_queryAccount = stmt.executeQuery(sql_queryAccount);
			ResultSetMetaData md = (ResultSetMetaData) rs_queryAccount.getMetaData();//获得结果集结构信息，元数据
			int columnCount = md.getColumnCount();//获得列数
			while (rs_queryAccount.next()){
				Account a = new Account();
				a.setId(rs_queryAccount.getString(1));
				a.setUserid("1488104129633");
				a.setAccountType(rs_queryAccount.getString(3));
				a.setAmount(rs_queryAccount.getBigDecimal(4));
				a.setCurrencyType(rs_queryAccount.getString(5));
				a.setRecordType(rs_queryAccount.getString(6));
				returnAccountList.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnAccountList;
	}
	
}
