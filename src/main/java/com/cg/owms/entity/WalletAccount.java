package com.cg.owms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

 

 

@Entity
@Table(name = "wallet_account_tbl")

 

public class WalletAccount {
    
    @Id
    @Column(name = "account_id")
    @SequenceGenerator(name="mygen",sequenceName="account_sequence",allocationSize=1)
	@GeneratedValue(generator="mygen",strategy=GenerationType.SEQUENCE)
    private int accountId;
    @Column(name = "balance")
    private int balance;
    @Column(name = "status")
    private String status;
    
    @ManyToOne
    @JoinColumn(name="user_id" , referencedColumnName = "user_id")
    public WalletUser user;
   
    public WalletAccount() {
        
    }
   
    public int getAccountId() {
        return accountId;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
   
    public int getBalance() {
        return balance;
    }
   
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public WalletUser getUser() {
        return user;
    }
    
    public void setUser(WalletUser user) {
        this.user = user;
    }
    
    
    
    
}