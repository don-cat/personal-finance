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
		
		String item=request.getParameter("item");
		
		GetAllEnumType getet = new GetAllEnumType();
		ArrayList<String> et=null;
		
		switch(item){
		case "RecordType":
			ArrayList<String> et1 = getet.GetExpenseType();
			et=et1;
			break;
		case "CurrencyType":
			ArrayList<String> et2 = getet.GetCurrencyType();
			et=et2;
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String returnJson = et.get(0);
		for(int i = 1;i<et.size();i++){
			returnJson = returnJson+","+et.get(i);
			System.out.println(returnJson);
		}
		out.write("{ \"type\": \""+returnJson+"\"}");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}

}
