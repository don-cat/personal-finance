package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Register {
	public boolean Registe_dao(String username,String passwd,String email){
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		int re_register=0;
		
		String sql_ifexist="select * from personal_finance.user where username='"+username+"'";
		try {
			ResultSet rs_ifexist = stmt.executeQuery(sql_ifexist);
			if(rs_ifexist.next()){
				re_register=0;
			}else{
				Date currentTime = new Date();
				long userid = currentTime.getTime();
				String sql_register="insert into personal_finance.user (userid,username,useremail,userpasswd) values ("+userid+",'"+username+"','"+email+"','"+passwd+"');";
				re_register=stmt.executeUpdate(sql_register);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		if (re_register==1){
			return true;//×¢²á³É¹¦
		}else {
			return false;//×¢²áÊ§°Ü
		}
	}
}
