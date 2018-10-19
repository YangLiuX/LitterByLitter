package lbl.service;

import java.util.List;

import lbl.entry.Question;


public interface IQuestionService {
	
public int addQuestion(Question q); 
	
	public List<Question> query();
	
	public List<Question> queryById(int id); 
	
	public int nextQuestion(String id);


}
