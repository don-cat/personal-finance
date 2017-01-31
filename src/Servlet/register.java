package Servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.GetConnection;

public class register extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String username=request.getParameter("username");
		String passwd=request.getParameter("pass");
		String email=request.getParameter("email");
		
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		
		if(username!=null && passwd!=null && email!=null){
			String sql_ifexist="select * from personal_finance.user where username='"+username+"'";
			System.out.println(sql_ifexist);
			try {
				ResultSet rs_ifexist = stmt.executeQuery(sql_ifexist);
				if(rs_ifexist.next()){
					System.out.println("¸ÃÕËºÅÒÑ×¢²á£¬ÇëµÇÂ½");
				}else{
					String sql_register="insert into personal_finance.user (userid,username,useremail,userpasswd) values (2,'"+username+"','"+email+"','"+passwd+"');";
					System.out.println(sql_register);
					int re_register=stmt.executeUpdate(sql_register);
					if (re_register==1){
						System.out.println("×¢²á³É¹¦£¡"	);
					}else System.out.println("×¢²áÊ§°Ü£¡");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
