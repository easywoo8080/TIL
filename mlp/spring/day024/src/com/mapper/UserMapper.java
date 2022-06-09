package com.mapper;

import java.util.List;

import com.vo.UserVO;

public interface UserMapper {
//	usermapper.xml의 id가 여기에선은 펑션의 name이 된다.
	public void insert(UserVO obj) throws Exception	;
	public void delete(String obj);
	public void update(UserVO obj);
	
	public UserVO select(String obj);
	public List<UserVO> selectall();
	
}
