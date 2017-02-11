package service;

import java.util.ArrayList;

import model.EnumExpenseType;
import Servlet.GetTypeServlet;

public class GetExpenseType {
	public ArrayList<String> expenseType(){
		ArrayList<String> expenseType = new ArrayList<String>();
		EnumExpenseType[] et = EnumExpenseType.values();
		for (int i = 0;i<et.length;i++){
			expenseType.add(et[i].getDailyType());
		}
		return expenseType;
	}
}
