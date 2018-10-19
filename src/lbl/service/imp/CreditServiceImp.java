package lbl.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lbl.entry.Credit;
import lbl.mapper.CreditMapper;
import lbl.service.ICreditService;
@Service
public class CreditServiceImp implements ICreditService {
	
	@Resource
	private CreditMapper creditmapper;

	@Override
	public int insertCredit(Credit credit) {
		
		return creditmapper.insertCredit(credit);//积分表记录一条数据
		
	}

}
