/**
 * 
 */
package com.baidu.service;

import java.util.List;

import com.baidu.bean.Goods;
import com.baidu.bean.Zhong;

/**
 * @author  ������
 *
 * ע������ 2018��7��18��
 *
 *
 */
public interface GoodsService {
	
	
//	��ѯ ���е���Ʒ
	public List<Goods>  queryAllGoods(Goods goods);
	
//	����м�������
	public boolean insertZhong(int[] goodsIds,int userId);
	
//	ɾ���м��
	public boolean deleteZhong(Zhong zhong);
}
