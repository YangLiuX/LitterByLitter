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
	 * �û���¼С���� ��ȡ��Ψһ��weChatId �������ݿ�
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
