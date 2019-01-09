/**
 * 
 */
package com.baidu.service;

import java.util.List;

import com.baidu.bean.Goods;
import com.baidu.bean.Zhong;

/**
 * @author  程振兴
 *
 * 注册日期 2018年7月18日
 *
 *
 */
public interface GoodsService {
	
	
//	查询 所有的商品
	public List<Goods>  queryAllGoods(Goods goods);
	
//	添加中间表的数据
	public boolean insertZhong(int[] goodsIds,int userId);
	
//	删除中间表
	public boolean deleteZhong(Zhong zhong);
}
