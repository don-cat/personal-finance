package com.doncat.pf.service;

import com.doncat.pf.dao.UserDao;

public class SignUpService {
	public boolean registe(String username, String passwd, String email){
		UserDao rd = new UserDao();
		return rd.SignUp_dao(username, passwd, email);
	}
}
