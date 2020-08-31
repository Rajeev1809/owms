package com.cg.owms;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.owms.dao.AccountDao;
import com.cg.owms.entity.WalletAccount;
import com.cg.owms.exception.AccountException;

@SpringBootTest
class OnlineWalletMgmtSystemApplicationTests {
@Autowired
AccountDao dao;
	@Test
	void testAccountById() throws AccountException{
		WalletAccount account=dao.findAccountById(2000);
		assertNotNull(account);
	}
	@Test
	void testAccountByDiffId() throws AccountException {
		WalletAccount account=dao.findAccountById(10054);
		assertNull(account);
	}
	
	@Test
	
	void testdeleteAccountByDiffId() throws AccountException {
		WalletAccount account=dao.deleteAccountById(10054);
		assertNull(account);
}
	@Test
	void testList() throws AccountException
	{
		List<WalletAccount> account=dao.listAllAccount();
		assertNotNull(account);
	}
}


