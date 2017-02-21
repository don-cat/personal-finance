package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EnumIncomeType;

public class SetRecordServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String accountType=request.getParameter("accountType");
		String amountStr=request.getParameter("amount");
		String RecordType=request.getParameter("RecordType");
		String CurrencyType=request.getParameter("CurrencyType");
		
		//将前端传来的中文值转换为英文或数字代号
		int IORE = 0;//设置收支的默认值为支。支为0，收为1
		if(accountType=="收"){
			
			IORE=1;
		}
		
		BigDecimal amount = new BigDecimal(amountStr);
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}

}
