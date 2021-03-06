package com.cg.owms.service;

import java.util.List;

import com.cg.owms.entity.WalletAccount;

import com.cg.owms.exception.AccountException;


public interface AccountService {
	public WalletAccount createAccount(WalletAccount account) throws AccountException;
	public WalletAccount deleteAccountById(int accountId) throws AccountException;
	public WalletAccount updateAccount(WalletAccount account) throws AccountException;
	public WalletAccount findAccountById(int accountId) throws AccountException;
	public List<WalletAccount> listAllAccount() throws AccountException;
}
