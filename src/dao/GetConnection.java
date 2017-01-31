package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetConnection {
	public Statement connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//����Class.forName()����������������
			System.out.println("�ɹ�����MYSQL����");
		} catch (ClassNotFoundException e) {
			System.out.println("�Ҳ���MYSQL������");
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/mysql";//JDBC��URL
		//����DriverManager�����getConnection()���������һ��Connection����
		Connection conn;
		Statement stmt = null;
		
		try {
			conn = DriverManager.getConnection(url, "root", "123456");
			//����һ��Statement����
            stmt = conn.createStatement(); //����Statement����
            System.out.print("�ɹ����ӵ����ݿ⣡");
//          stmt.close();//������û���㻹û�������stmt�ؾ�����˼�close����ѽ �ճ������� �������� �ɹ��� ���Ǿ�˯��  
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
