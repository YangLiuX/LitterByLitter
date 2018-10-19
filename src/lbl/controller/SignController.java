package lbl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lbl.entry.Credit;
import lbl.service.ICreditService;
import lbl.service.ISignService;

@Controller
@RequestMapping("sign")
public class SignController {
	
	@Resource
	private ISignService signService;
	@Resource
	private ICreditService creditService;

	
	/**
	 * 用户点击签到 调用insertSign接口 将签到信息存入数据库 应该同时记录积分信息
	 * @param sign
	 * @return
	 */
	@RequestMapping("insertSign")
	@ResponseBody
	public int insertSign(String id){
		int i = signService.insertSign(id);
		Credit credit = new Credit();
		credit.setid(id);
		credit.setOperate("签到");
		credit.setReward(5);//签到得5积分（益米粒）
		int s = creditService.insertCredit(credit);
		return i+s;
	}
	
	
}
