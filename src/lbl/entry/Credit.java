package lbl.entry;

import java.util.Date;
//������־��
public class Credit {
	
	private String id;//�û�Ψһ��΢��id
	private Date operatetime;//�õ����ֲ���ʱ��
	private int reward;//���ֵĻ��������
	private String operate;//�õ����ֵĲ��� �磺���⣬ǩ��...
	
	
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public Date getOperatetime() {
		return operatetime;
	}
	public void setOperatetime(Date operatetime) {
		this.operatetime = operatetime;
	}
	public int getReward() {
		return reward;
	}
	public void setReward(int reward) {
		this.reward = reward;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
	
	

}
