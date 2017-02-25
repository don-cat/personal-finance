package com.doncat.pf.service;

import java.util.ArrayList;

import com.doncat.pf.enums.EnumCurrency;
import com.doncat.pf.enums.EnumExpenseType;
import com.doncat.pf.enums.EnumIncomeType;

public class GetAllEnumType {
	public ArrayList<String> GetExpenseType(){
		ArrayList<String> expenseType = new ArrayList<String>();
		EnumExpenseType[] et = EnumExpenseType.values();
		for (int i = 0;i<et.length;i++){
			expenseType.add(et[i].getDailyType());
		}
		return expenseType;
	}
	
	public ArrayList<String> GetIncomeType(){
		ArrayList <String> incomeType = new ArrayList<String>();
		EnumIncomeType[] it = EnumIncomeType.values();
		for (int i =0;i<it.length;i++){
			incomeType.add(it[i].getDailyType());
		}
		return incomeType;
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