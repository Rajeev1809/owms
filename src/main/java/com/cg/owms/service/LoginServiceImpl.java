package com.cg.owms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.owms.dao.LoginDao;
import com.cg.owms.entity.Login;
import com.cg.owms.exception.LoginException;



@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;
	
	@Override
	public String validate(String userName, String userPass) throws LoginException {
		
		Login login = loginDao.validate(userName, userPass);
		
		if(login == null)
		{
			throw new LoginException("Login Failed");
		}
		return login.getUserRole();
	}
}