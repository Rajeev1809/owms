package com.cg.owms.dao;

import com.cg.owms.entity.Login;
import com.cg.owms.exception.LoginException;

public interface LoginDao {
	public Login validate(String userName, String userPass) throws LoginException;
}
