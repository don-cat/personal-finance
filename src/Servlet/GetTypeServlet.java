package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.GetExpenseType;

public class GetTypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		GetExpenseType getet = new GetExpenseType();
		ArrayList et = getet.expenseType();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String returnJson = null;
		for(int i = 0;i<et.size();i++){
			returnJson = returnJson+","+et.get(i);
		}
		out.write("{ \"type\": "+returnJson+"\"}");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}

}
