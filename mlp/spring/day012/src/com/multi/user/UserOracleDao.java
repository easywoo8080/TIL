package com.multi.user;

import com.multi.frame.Dao;

public class UserOracleDao implements Dao<UserDao>{

    @Override
    public void insert(UserDao v) {
        // TODO Auto-generated method stub
        System.out.println("Inserted Oracle : " + v);
    }
    
}
