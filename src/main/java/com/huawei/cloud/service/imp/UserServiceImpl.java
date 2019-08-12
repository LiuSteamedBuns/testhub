package com.huawei.cloud.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huawei.cloud.bean.User;
import com.huawei.cloud.dao.UserMapper;
import com.huawei.cloud.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	 private UserMapper userMapper;
	
	public User checkedLogin(String username) {
		return userMapper.findByUsername(username);
		}
}






