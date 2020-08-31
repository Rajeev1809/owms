package com.cg.owms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wallet_user_tbl")
public class WalletUser {

 

    @Id
    @Column(name = "user_id")
    private int userId;
    @Column(name = "username", length = 25)
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "phoneno")
    private String phoneNo;
    @Column(name = "role", length = 20)
    private String role;

 

    public WalletUser() {

 

    }

 

    public int getUserId() {
        return userId;
    }

 

    public void setUserId(int userId) {
        this.userId = userId;
    }

 

    public String getUserName() {
        return userName;
    }

 

    public void setUserName(String userName) {
        this.userName = userName;
    }

 

    public String getPassword() {
        return password;
    }

 

    public void setPassword(String password) {
        this.password = password;
    }

 

    public String getPhoneNo() {
        return phoneNo;
    }

 

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

 

    public String getRole() {
        return role;
    }

 

    public void setRole(String role) {
        this.role = role;
    }

 

    
}
