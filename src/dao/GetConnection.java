package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetConnection {
	public Statement connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//调用Class.forName()方法加载驱动程序
			System.out.println("成功加载MYSQL驱动");
		} catch (ClassNotFoundException e) {
			System.out.println("找不到MYSQL驱动！");
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/mysql";//JDBC的URL
		//调用DriverManager对象的getConnection()方法，获得一个Connection对象
		Connection conn;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection(url, "root", "123456");
			//创建一个Statement对象
            stmt = conn.createStatement(); //创建Statement对象
            System.out.print("成功连接到数据库！");
//          stmt.close();//看明白没，你还没等用这个stmt呢就你给人家close了妈呀 照抄害死人 那你试试 成功了 我们就睡觉  
//          conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stmt;
	}
	
	public static void main(String[] args) {
		GetConnection conn = new GetConnection();
		conn.connect();
	}
}
