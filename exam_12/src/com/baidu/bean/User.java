/**
 * 
 */
package com.baidu.bean;

import java.util.List;

/**
 * @author  程振兴
 *
 * 注册日期 2018年7月18日
 *
 *
 */
public class User {
	
	private Integer userId ;
	private String userName ;
	private String userPwd ;
	private double userMoney ;
	private List<Goods> goodss ;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userMoney=" + userMoney
				+ ", goodss=" + goodss + "]";
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userPwd
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * @return the userMoney
	 */
	public double getUserMoney() {
		return userMoney;
	}
	/**
	 * @param userMoney the userMoney to set
	 */
	public void setUserMoney(double userMoney) {
		this.userMoney = userMoney;
	}
	/**
	 * @return the goodss
	 */
	public List<Goods> getGoodss() {
		return goodss;
	}
	/**
	 * @param goodss the goodss to set
	 */
	public void setGoodss(List<Goods> goodss) {
		this.goodss = goodss;
	}
	/**
	 * @param userId
	 * @param userName
	 * @param userPwd
	 * @param userMoney
	 * @param goodss
	 */
	public User(Integer userId, String userName, String userPwd, double userMoney, List<Goods> goodss) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userMoney = userMoney;
		this.goodss = goodss;
	}
	
}
