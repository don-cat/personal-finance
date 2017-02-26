package com.doncat.pf.service;

import com.doncat.pf.dao.UserDao;

public class RegisterService {
	public boolean registe(String username, String passwd, String email){
		UserDao rd = new UserDao();
		return rd.Registe_dao(username, passwd, email);
	}
}
