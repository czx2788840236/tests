/**
 * 
 */
package com.baidu.bean;

/**
 * @author  程振兴
 *
 * 注册日期 2018年7月18日
 *
 *
 */
public class Zhong {
	
	private Integer  userId ;
	private Integer  goodsId ;
	private Integer  goodsNum ;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Zhong [userId=" + userId + ", goodsId=" + goodsId + ", goodsNum=" + goodsNum + "]";
	}
	/**
	 * 
	 */
	public Zhong() {
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
	 * @return the goodsId
	 */
	public Integer getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * @return the goodsNum
	 */
	public Integer getGoodsNum() {
		return goodsNum;
	}
	/**
	 * @param goodsNum the goodsNum to set
	 */
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	/**
	 * @param userId
	 * @param goodsId
	 * @param goodsNum
	 */
	public Zhong(Integer userId, Integer goodsId, Integer goodsNum) {
		super();
		this.userId = userId;
		this.goodsId = goodsId;
		this.goodsNum = goodsNum;
	}
	
}
