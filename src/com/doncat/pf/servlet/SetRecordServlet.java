package com.doncat.pf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doncat.pf.enums.EnumIncomeType;
import com.doncat.pf.service.AccountService;
/**
 * 接收到提交记账记录的请求后，添加数据到数据库，并跳转到记账展示页面
 * @author don-cat
 *
 */
public class SetRecordServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String accountType=request.getParameter("accountType");
		String amountStr=request.getParameter("amount");
		String RecordType=request.getParameter("RecordType");
		String CurrencyType=request.getParameter("CurrencyType");
		
		BigDecimal amount = new BigDecimal(amountStr);
		
		AccountService addAcco = new AccountService();
		if(addAcco.AddAccount("1488104129633",accountType,amount,RecordType,CurrencyType)){
			response.sendRedirect("/personal-finance/AccountBook.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}

}
