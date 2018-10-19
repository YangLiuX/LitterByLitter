package lbl.entry;

import java.util.Date;

public class Sign {
	
	private String userId;//用户的微信唯一id
	private Date signDate;//签到日期 年 月 日
	private Date signTime;//签到时间 时 分 秒
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getSignDate() {
		return signDate;
	}
	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}
	public Date getSignTime() {
		return signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}
	
	

}
