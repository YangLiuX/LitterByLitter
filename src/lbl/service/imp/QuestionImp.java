package lbl.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import lbl.entry.Question;
import lbl.mapper.QuestionMapper;
import lbl.service.IQuestionService;


@Service
public class QuestionImp implements IQuestionService {
	
	Logger logger = Logger.getLogger(QuestionImp.class);
	
	@Resource
	private QuestionMapper questionMapper;

	@Override
	public int addQuestion(Question q) {
		return questionMapper.addQuestion(q);
	}

	@Override
	public List<Question> query() {
		return questionMapper.query();
	}

	@Override
	public List<Question> queryById(int id) {
		return questionMapper.queryById(id);
	}

	@Override
	public int nextQuestion(String id) {
		return questionMapper.nextQuestion(id);
	}

}
