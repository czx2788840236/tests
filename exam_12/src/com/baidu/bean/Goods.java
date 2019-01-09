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
public class Goods {
	
	private Integer goodsId ;
	private String  goodsCode ;
	private String 	goodsName ;
	private String  goodsLogoCn ;
	private String goodsLogoEn ;
	private double goodsPrice ;
	private  Integer  goodsSales ;
	private  Integer  goodsStock ;
	private  Integer  goodsNum ;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsCode=" + goodsCode + ", goodsName=" + goodsName + ", goodsLogoCn="
				+ goodsLogoCn + ", goodsLogoEn=" + goodsLogoEn + ", goodsPrice=" + goodsPrice + ", goodsSales="
				+ goodsSales + ", goodsStock=" + goodsStock + ", goodsNum=" + goodsNum + "]";
	}
	/**
	 * 
	 */
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the goodsCode
	 */
	public String getGoodsCode() {
		return goodsCode;
	}
	/**
	 * @param goodsCode the goodsCode to set
	 */
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * @return the goodsLogoCn
	 */
	public String getGoodsLogoCn() {
		return goodsLogoCn;
	}
	/**
	 * @param goodsLogoCn the goodsLogoCn to set
	 */
	public void setGoodsLogoCn(String goodsLogoCn) {
		this.goodsLogoCn = goodsLogoCn;
	}
	/**
	 * @return the goodsLogoEn
	 */
	public String getGoodsLogoEn() {
		return goodsLogoEn;
	}
	/**
	 * @param goodsLogoEn the goodsLogoEn to set
	 */
	public void setGoodsLogoEn(String goodsLogoEn) {
		this.goodsLogoEn = goodsLogoEn;
	}
	/**
	 * @return the goodsPrice
	 */
	public double getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/**
	 * @return the goodsSales
	 */
	public Integer getGoodsSales() {
		return goodsSales;
	}
	/**
	 * @param goodsSales the goodsSales to set
	 */
	public void setGoodsSales(Integer goodsSales) {
		this.goodsSales = goodsSales;
	}
	/**
	 * @return the goodsStock
	 */
	public Integer getGoodsStock() {
		return goodsStock;
	}
	/**
	 * @param goodsStock the goodsStock to set
	 */
	public void setGoodsStock(Integer goodsStock) {
		this.goodsStock = goodsStock;
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
	 * @param goodsId
	 * @param goodsCode
	 * @param goodsName
	 * @param goodsLogoCn
	 * @param goodsLogoEn
	 * @param goodsPrice
	 * @param goodsSales
	 * @param goodsStock
	 * @param goodsNum
	 */
	public Goods(Integer goodsId, String goodsCode, String goodsName, String goodsLogoCn, String goodsLogoEn,
			double goodsPrice, Integer goodsSales, Integer goodsStock, Integer goodsNum) {
		super();
		this.goodsId = goodsId;
		this.goodsCode = goodsCode;
		this.goodsName = goodsName;
		this.goodsLogoCn = goodsLogoCn;
		this.goodsLogoEn = goodsLogoEn;
		this.goodsPrice = goodsPrice;
		this.goodsSales = goodsSales;
		this.goodsStock = goodsStock;
		this.goodsNum = goodsNum;
	}
	
	
	
	
}
