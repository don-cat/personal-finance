package dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddAssets {
	public void AddAssets(String userid,Boolean iore,String type,BigDecimal amount){
		int IORE = 0;//������֧��Ĭ��ֵΪ֧��֧Ϊ0����Ϊ1
		if(iore){
			IORE=1;
		}
		
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		
		String sql_addasset="insert into personal_finance.amount (userid,iore,type,amount) values ("+userid+",'"+IORE+"','"+type+"','"+amount+"');";
		try {
			ResultSet rs_addasset = stmt.executeQuery(sql_addasset);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	};//iore:�ջ�֧
}
