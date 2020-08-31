package com.cg.owms.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.owms.entity.WalletAccount;
import com.cg.owms.exception.AccountException;


@Repository
@Transactional
public class AccountDaoImpl implements AccountDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public WalletAccount createAccount(WalletAccount account) throws AccountException {
		entityManager.persist(account);
		return account;
	}

	@Override
	public List<WalletAccount> listAllAccount() throws AccountException {
		String qry ="Select p From WalletAccount p";
		TypedQuery<WalletAccount> query = entityManager.createQuery(qry,WalletAccount.class);
		List<WalletAccount> list = query.getResultList();
		return list;
	}

	@Override
	public WalletAccount deleteAccountById(int accountId) throws AccountException {
		WalletAccount account = entityManager.find(WalletAccount.class, accountId);
		if(account != null) 
		{
			entityManager.remove(account);
		}
		return account;
	}

	@Override
	public WalletAccount updateAccount(WalletAccount account) throws AccountException {
		entityManager.merge(account);
		return account;
	}

	@Override
	public WalletAccount findAccountById(int accountId) throws AccountException {
		WalletAccount account = entityManager.find(WalletAccount.class, accountId);
		return account;
	}
	

}
