package com.doncat.pf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doncat.pf.enums.EnumExpenseType;
import com.doncat.pf.enums.EnumIncomeType;
import com.doncat.pf.model.Account;
import com.doncat.pf.model.ResponseJson;
import com.doncat.pf.service.ShowAccountBillService;
/**
 * 获取一位用户的全部账务信息，包括所有收支记录，形成账单(AccountBook)
 * @author don-cat
 *
 */
public class GetAccountBookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		ResponseJson respJson = new ResponseJson();
		
		String userid = request.getParameter("userid");
		
		ShowAccountBillService sabs = new ShowAccountBillService();
		ArrayList<Account> accountBook = sabs.showAccountBill(userid);
		
		
		respJson = respJson.add("EnumIncomeType",EnumIncomeType.getAllMap()).add("EnumExpenseType",EnumExpenseType.getAllMap());
		
//		{
//		    "name": "BeJson",
//		    "account": [
//		        {
//		            "userid": "Google",
//		            "type": "http://www.google.com"
//		        },
//		        {
//		            "userid": "Baidu",
//		            "type": "http://www.baidu.com"
//		        },
//		    ]
//		}
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}

}
