package com.doncat.pf.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doncat.pf.service.ShowAccountBillService;
/**
 * ��ȡһλ�û���ȫ��������Ϣ������������֧��¼���γ��˵�(AccountBook)
 * @author don-cat
 *
 */
public class GetAccountBook extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String userid = request.getParameter("userid");
		
		ShowAccountBillService sabs = new ShowAccountBillService();
		sabs.showAccountBill(userid);
		
//		response.sendRedirect("/personal-finance/AccountBook.jsp");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}

}
