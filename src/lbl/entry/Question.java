package lbl.entry;

public class Question {
	
	
	private int id;
	private String title;
	private String A;
	private String B;
	private String C;
	private String D;
	private String answer;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getD() {
		return D;
	}
	public void setD(String d) {
		D = d;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
	
	@Override
	public String toString() {
		return "{id:" + id + ", "+"title"+":" + title + ","+"A"+":" + A + ", "+"B"+":" + B + ", "+"C"+":" + C + ", "+"D"+":" + D
				+ ", "+"answer"+":" + answer + "}";
	}
	

}
