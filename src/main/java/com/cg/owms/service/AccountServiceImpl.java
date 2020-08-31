package com.cg.owms.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.owms.dao.AccountDao;
import com.cg.owms.entity.WalletAccount;

import com.cg.owms.exception.AccountException;




@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	 AccountDao accountDao;
	@Override
	public WalletAccount createAccount(WalletAccount account) throws AccountException {
                accountDao.createAccount(account);
		
		return account;
		
	}
	@Override
	public List<WalletAccount> listAllAccount() throws AccountException {
		List<WalletAccount> list=accountDao.listAllAccount();
		if(list.isEmpty())
		{
			throw new AccountException("empty Record");
		}
		return list;
	}
	@Override
	public WalletAccount deleteAccountById(int accountId) throws AccountException {
		WalletAccount account  = accountDao.deleteAccountById(accountId);
		
		if(account == null)
		{
			throw new AccountException(accountId+" ID Not Found");	
		}
		return account;
	}
	@Override
	public WalletAccount updateAccount(WalletAccount account) throws AccountException {
		if(accountDao.findAccountById(account.getAccountId())!=null)
		{
			accountDao.updateAccount(account);
		}
		else
		{
			throw new AccountException(account.getAccountId()+" ID Not Found");
		}
		return account;
	}
	@Override
	public WalletAccount findAccountById(int accountId) throws AccountException {
		WalletAccount account  = accountDao.findAccountById(accountId);
		
		if(account == null)
		{
			throw new AccountException(accountId+" ID Not Found");	
		}
		return account;
	}
	
	

}
