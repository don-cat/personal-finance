package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class commit extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String username=request.getParameter("username");
		String passwd=request.getParameter("pass");
		System.out.println(username+passwd);
		if(username != "" && passwd != ""){
			HttpSession session = request.getSession();//取session
			session.setAttribute("username", username);//放进去值，可以保存登录的用户名
			String paramValue = (String) session.getAttribute("paramName");//以后想用到用户名，可以直接通过session取到  哪里表现是存的用户名了
			response.sendRedirect("/personal-finance/index-sign.jsp?username="+username+"&passwd="+passwd);
		}else{
			PrintWriter out = response.getWriter();
			out.println("请填写用户名及密码");
			response.sendRedirect("/personal-finance/index.jsp");
		}
	}
}
