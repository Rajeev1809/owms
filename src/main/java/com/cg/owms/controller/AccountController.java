package com.cg.owms.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.owms.entity.WalletAccount;

import com.cg.owms.exception.AccountException;
import com.cg.owms.service.AccountService;






@RestController
@CrossOrigin("*")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("account")
	public ResponseEntity<WalletAccount> addAccount(@RequestBody WalletAccount account) throws AccountException
	{
		WalletAccount p = accountService.createAccount(account);
		ResponseEntity<WalletAccount> re = new ResponseEntity(p,HttpStatus.OK);
		return re;
	}
	@GetMapping("account")
	public ResponseEntity<List<WalletAccount>> findAllAccounts() throws AccountException
	{
		List<WalletAccount> list=accountService.listAllAccount();
		ResponseEntity<List<WalletAccount>> re = new ResponseEntity<List<WalletAccount>>(list,HttpStatus.OK);
		return re;
	}
	@DeleteMapping("account/{aid}")
	public ResponseEntity<WalletAccount> deleteAccountById(@PathVariable("aid") int accountId) throws AccountException
	{		
		WalletAccount account = accountService.deleteAccountById(accountId);
		ResponseEntity<WalletAccount> re = new ResponseEntity(account,HttpStatus.OK);
		return re;
	}
	@PutMapping("account")
	public ResponseEntity<WalletAccount> updateAccount(@RequestBody WalletAccount account) throws AccountException
	{
		WalletAccount u = accountService.updateAccount(account);
		ResponseEntity<WalletAccount> re = new ResponseEntity(u,HttpStatus.OK);
		return re;
	}
	@GetMapping("account/{aid}")
	public ResponseEntity<WalletAccount> findAccountById(@PathVariable("aid")int accountId) throws AccountException
	{
		WalletAccount account = null;
		account = accountService.findAccountById(accountId);
		ResponseEntity<WalletAccount> re = new ResponseEntity(account,HttpStatus.OK);
		return re;
	}
}
