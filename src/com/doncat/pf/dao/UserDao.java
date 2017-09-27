package com.doncat.pf.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserDao {
	public boolean SignUp_dao(String username,String passwd,String email){
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		int flag=0;//0为失败，1为成功
		
		String sql_ifexist="select * from personal_finance.user where name='"+username+"'";
		try {
			ResultSet rs_ifexist = stmt.executeQuery(sql_ifexist);
			if(rs_ifexist.next()){
				flag=1;
			}else{
				Date currentTime = new Date();
				long userid = currentTime.getTime();
				SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String create_time = dt.format(currentTime);
				String sql_register="insert into personal_finance.user (id,name,email,password,create_time) values ("+userid+",'"+username+"','"+email+"','"+passwd+"','"+ create_time +"');";
				flag=stmt.executeUpdate(sql_register);
			}
		} catch (SQLException e) {
			flag = 0;
			e.printStackTrace();
		}
		if (flag==1){
			return true;//注册成功
		}else {
			return false;//注册失败
		}
	}
}
