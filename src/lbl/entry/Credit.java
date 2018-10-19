package lbl.entry;

import java.util.Date;
//积分日志类
public class Credit {
	
	private String id;//用户唯一的微信id
	private Date operatetime;//得到积分操作时间
	private int reward;//积分的获得与消耗
	private String operate;//得到积分的操作 如：背题，签到...
	
	
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
