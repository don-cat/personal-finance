package com.doncat.pf.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doncat.pf.dao.GetConnection;
import com.doncat.pf.dao.Register;

public class RegisterServlet extends HttpServlet{
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
		
		Register regist = new Register();
		if(regist.Registe_dao(username, passwd, email)){
			response.sendRedirect("/personal-finance/index.jsp?username="+username);
		}
	}
}
