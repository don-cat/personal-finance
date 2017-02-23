package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AccountService;
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
		String CurrencyType=request.getParameter("CurrencyType");//前台传来的币种类型值直接与Enum里的值对应，因此不需要处理。
		int accoType=0;
		
		System.out.println(RecordType);
		
		//将前端传来的收支类型转换为完整代号（对应Enum里的值）
		if(accountType.equals("1")){
			RecordType="10"+RecordType;
			accoType=Integer.parseInt(accountType);
		}else if(accountType.equals("0")){
			RecordType="00"+RecordType;
			accoType=Integer.parseInt(accountType);
		}
		
		BigDecimal amount = new BigDecimal(amountStr);
		
		AccountService addAcco = new AccountService(accoType,amount,RecordType,CurrencyType);
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}

}
