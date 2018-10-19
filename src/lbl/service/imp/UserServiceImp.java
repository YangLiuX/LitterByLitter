package lbl.service.imp;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lbl.mapper.UserMapper;
import lbl.service.IUserService;

@Service
public class UserServiceImp implements IUserService{
	
	@Resource
	private UserMapper userMapper;


	@Override
	public int addUser(String wechatid) {
		return userMapper.addUser(wechatid);
	}

}
