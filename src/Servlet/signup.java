package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.GetConnection;

public class signup extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String username=request.getParameter("username");
		String passwd=request.getParameter("pass");
		
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		
		boolean flag=false;
		
		if(username != "" && passwd != ""){
			HttpSession session = request.getSession();//ȡsession
			session.setAttribute("username", username);//�Ž�ȥֵ�����Ա����¼���û���
			String paramValue = (String) session.getAttribute("paramName");//�Ժ����õ��û���������ֱ��ͨ��sessionȡ��
//			response.sendRedirect("/personal-finance/index-sign.jsp?username="+username+"&passwd="+passwd);
			
			String sql_ifexist = "select * from personal_finance.user where username = "+username+" limit 1;"; 
			try {
				ResultSet rs_ifexist = stmt.executeQuery(sql_ifexist);
				while(rs_ifexist.next()){
					flag = true;
				}
				if (flag=true){
					String sql_checkpasswd = "select userpasswd from personal_finance.user where username = "+username+";"; 
					ResultSet rs_checkpasswd = stmt.executeQuery(sql_checkpasswd);
					while(rs_checkpasswd.next()){
						System.out.println(rs_checkpasswd.getString("userpasswd")+passwd);
						if(rs_checkpasswd.getString("userpasswd").equals(passwd)){
							System.out.println("��½�ɹ���");
							response.sendRedirect("/personal-finance/index-sign.jsp?username="+username+"&passwd="+passwd);
						}else{
							System.out.println("��½ʧ�ܣ���������");
						}
					}
				}else{
					System.out.println("��½ʧ�ܣ����û���δע��");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
//			PrintWriter out = response.getWriter();
//			out.println("����д�û���������");
			System.out.println("����д�û���������");
			response.sendRedirect("/personal-finance/index.jsp");
		}
	}
}
