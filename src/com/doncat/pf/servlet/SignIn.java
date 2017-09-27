package com.doncat.pf.servlet;

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

import com.doncat.pf.dao.GetConnection;

public class SignIn extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String username=request.getParameter("username");
		String passwd=request.getParameter("passwd");
		
		GetConnection conn = new GetConnection();
		Statement stmt = conn.connect();
		
		boolean flag=false;
		
		if(username != "" && passwd != ""){
			HttpSession session = request.getSession();//ȡsession
			session.setAttribute("username", username);//�Ž�ȥֵ�����Ա����¼���û���
			String paramValue = (String) session.getAttribute("paramName");//�Ժ����õ��û���������ֱ��ͨ��sessionȡ��
//			response.sendRedirect("/personal-finance/index-sign.jsp?username="+username+"&passwd="+passwd);
			
			String sql_ifexist = "select * from personal_finance.user where name = '"+username+"' limit 1"; 
			System.out.println(sql_ifexist);
			try {
				ResultSet rs_ifexist = stmt.executeQuery(sql_ifexist);
				while(rs_ifexist.next()){
					flag = true;
					System.out.println("flag is true");
				}
				if (flag==true){
					String sql_checkpasswd = "select userpasswd from personal_finance.user where name = '"+username+"';"; 
					ResultSet rs_checkpasswd = stmt.executeQuery(sql_checkpasswd);
					while(rs_checkpasswd.next()){
						System.out.println(rs_checkpasswd.getString("password")+passwd);
						if(rs_checkpasswd.getString("password").equals(passwd)){
							System.out.println("��½�ɹ���");
							try{
								response.sendRedirect("/personal-finance/navigation.jsp?username="+username);
							}catch (Exception e){
								System.out.println(e);
							}
						}else{
							System.out.println("��½ʧ�ܣ���������");
						}
					}
				}else{
					try{
						response.sendRedirect("/personal-finance/SignInFailed.jsp?username="+username+"&repCode=1");
					}catch (Exception e){
						System.out.println(e);
					}
					System.out.println("��½ʧ�ܣ����û���δע��");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("����д�û���������");
			response.sendRedirect("/personal-finance/index.jsp");
		}
	}
}
