package lbl.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lbl.entry.Question;
import lbl.service.IQuestionService;


@Controller
@RequestMapping("question")
public class QuestionController {
	
	@Resource
	private IQuestionService questionService;
	
	@RequestMapping("queryQuestionById")
	@ResponseBody
	public List<Question> queryQuestionById(int id){
		List<Question> singleQuestion = questionService.queryById(id);
		return singleQuestion;
	}
	
	/**
	 * 查询所有近代史题目 并返回json类型
	 * @return
	 */
	@RequestMapping("queryQuestion")
	@ResponseBody
	public List<Question> queryQuestion(){
		List<Question> allQuestion = questionService.query();
		return allQuestion;
	}
	
	@RequestMapping("nextQuestion")
	@ResponseBody
	public int questionMapper(String id){
		int i = questionService.nextQuestion(id);
		return i;
	}

}
