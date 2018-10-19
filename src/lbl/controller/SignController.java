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
	 * �û����ǩ�� ����insertSign�ӿ� ��ǩ����Ϣ�������ݿ� Ӧ��ͬʱ��¼������Ϣ
	 * @param sign
	 * @return
	 */
	@RequestMapping("insertSign")
	@ResponseBody
	public int insertSign(String id){
		int i = signService.insertSign(id);
		Credit credit = new Credit();
		credit.setid(id);
		credit.setOperate("ǩ��");
		credit.setReward(5);//ǩ����5���֣���������
		int s = creditService.insertCredit(credit);
		return i+s;
	}
	
	
}
