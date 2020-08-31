package com.cg.owms.service;

import com.cg.owms.exception.LoginException;

public interface LoginService {
	public String validate(String userName, String userPass) throws LoginException;
}
