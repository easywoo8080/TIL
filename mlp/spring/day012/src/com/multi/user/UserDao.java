package com.multi.user;

import com.multi.frame.Dao;
import com.multi.vo.UserVO;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao implements Dao<UserVO>
{

    @Override
    public void insert(UserVO v) {
        // TODO Auto-generated method stub
        System.out.println("INsert : " + v);
    }
    
}
