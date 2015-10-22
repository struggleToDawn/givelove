package org.geilove.service.impl;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.geilove.dao.UserMapper;
import org.geilove.pojo.User;
import org.geilove.service.RegisterLoginService;

@Service("registerloginservice")
public class RegisterLoginServiceImpl implements RegisterLoginService {
	
 
    @Resource
	private UserMapper  userMapper;
	
	@Override
	public User userLogin(String userEmail){
		
		User user=userMapper.selectByUserEmail(userEmail);
		return user;
	}
	
	@Override
	public int userRegister(User record){
		
		int tag=userMapper.insert(record);
		System.out.println(tag); //确定下返回值
		return tag; 
	}
	
	
}



















