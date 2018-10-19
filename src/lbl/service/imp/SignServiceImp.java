package lbl.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lbl.mapper.CreditMapper;
import lbl.mapper.SignMapper;
import lbl.service.ISignService;

@Service
public class SignServiceImp implements ISignService {
	
	@Resource
	private SignMapper signMapper;
	@Resource
	private CreditMapper creditMapper;

	@Override
	public int insertSign(String id) {
		int i = signMapper.insertSign(id);
		return i;
	}

	
}
