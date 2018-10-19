package lbl.entry;

public class User {
	
	private String wechatid;//用户登录前台得到的唯一id
	private int wordprocess;//背单词进度
	private int questionprocess;//刷题进度
	private int credit;//益米粒数量
	private int signumber;//签到次数
	
	
	public String getWechatid() {
		return wechatid;
	}
	public void setWechatid(String wechatid) {
		this.wechatid = wechatid;
	}
	public int getWordprocess() {
		return wordprocess;
	}
	public void setWordprocess(int wordprocess) {
		this.wordprocess = wordprocess;
	}
	public int getQuestionprocess() {
		return questionprocess;
	}
	public void setQuestionprocess(int questionprocess) {
		this.questionprocess = questionprocess;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getSignumber() {
		return signumber;
	}
	public void setSignumber(int signumber) {
		this.signumber = signumber;
	}
	
	
	

}
