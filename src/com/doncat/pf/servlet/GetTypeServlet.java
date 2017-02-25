package com.doncat.pf.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doncat.pf.enums.EnumCurrency;
import com.doncat.pf.enums.EnumExpenseType;
import com.doncat.pf.enums.EnumIncomeType;
import com.doncat.pf.model.ResponseJson;
import com.doncat.pf.service.GetAllEnumType;
import com.doncat.pf.util.JsonUtil;

public class GetTypeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		String[] item = (String[]) request.getParameterValues("item[]");
		String returnJson = null;
		
		for (int i = 0; i < item.length; i++) {
			switch (item[i]) {
			case "RecordType":
				ResponseJson respJson = new ResponseJson().add("EnumIncomeType",EnumIncomeType.getAllType()).add("EnumExpenseType",EnumExpenseType.getAllType());
				returnJson = JsonUtil.obj2Str(respJson);
				break;
			case "CurrencyType":
				EnumCurrency[] cuvalues = EnumCurrency.values();
//				for(int j =0;j<cuvalues.length;j++){
//					cuvalues[j].
//				}
//				for (int j = 0; j < et3.size(); j++) {
//					if (returnJson_CurrencyType == null) {
//						returnJson_CurrencyType = et3.get(j);
//					} else {
//						returnJson_CurrencyType = returnJson_CurrencyType + "," + et3.get(j);
//					}
//				}
				break;
			}
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("returnJson:"+returnJson);
//		returnJson = "{\"RecordType\":\"" + "" + "\"" + "," + "\"CurrencyType\":\"" + returnJson_CurrencyType + "\"}";
		out.write(returnJson);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
