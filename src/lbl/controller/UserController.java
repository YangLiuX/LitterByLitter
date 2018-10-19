package lbl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lbl.service.IUserService;

@Controller
public class UserController {
	
	@Resource
	private IUserService userService;
	
	
	/**
	 * 用户登录小程序 获取到唯一的weChatId 存入数据库
	 * @param wechatid
	 * @return
	 */
	@RequestMapping("addUser")
	@ResponseBody
	public int addUser(String wechatid){
		int i = userService.addUser(wechatid);
		return i;
	}

}
