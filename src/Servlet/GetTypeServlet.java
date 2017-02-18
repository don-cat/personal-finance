package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.GetAllEnumType;

public class GetTypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String[] item = (String[])request.getParameterValues("item[]");
		String returnJson = null;
		String returnJson_RecordType = null;
		String returnJson_CurrencyType = null;
		
		GetAllEnumType getet = new GetAllEnumType();
		ArrayList<String> et=null;
		
		for(int i=0;i<item.length;i++){
			switch(item[i]){
			case "RecordType":
				ArrayList<String> et1 = getet.GetExpenseType();
				for(int j=0;j<et1.size();j++){
					returnJson_RecordType=returnJson_RecordType+","+et1.get(j);
				}
				break;
			case "CurrencyType":
				ArrayList<String> et2 = getet.GetCurrencyType();
				for(int j=0;j<et2.size();j++){
					returnJson_CurrencyType=returnJson_CurrencyType+","+et2.get(j);
				}
				break;
			}
		}
		
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		returnJson = "{\"RecordType\":\""+returnJson_RecordType+"\""+","+"\"CurrencyType\":\""+returnJson_CurrencyType+"\"}";
		System.out.println(returnJson);
		out.write(returnJson);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}
}
