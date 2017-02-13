package service;

import java.util.ArrayList;

import model.EnumCurrency;
import model.EnumExpenseType;
import Servlet.GetTypeServlet;

public class GetAllEnumType {
	public ArrayList<String> GetExpenseType(){
		ArrayList<String> expenseType = new ArrayList<String>();
		EnumExpenseType[] et = EnumExpenseType.values();
		for (int i = 0;i<et.length;i++){
			expenseType.add(et[i].getDailyType());
		}
		return expenseType;
	}
	
	public ArrayList<String> GetCurrencyType(){
		ArrayList<String> currencyType = new ArrayList<String>();
		EnumCurrency[] et = EnumCurrency.values();
		for (int i = 0;i<et.length;i++){
			currencyType.add(et[i].getName());
		}
		return currencyType;
	}
}