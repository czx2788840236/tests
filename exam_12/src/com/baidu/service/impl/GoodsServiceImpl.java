/**
 * 
 */
package com.baidu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baidu.bean.Goods;
import com.baidu.bean.Zhong;
import com.baidu.mapper.GoodsMapper;
import com.baidu.service.GoodsService;

/**
 * @author  ������
 *
 * ע������ 2018��7��18��
 *
 *
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
//	����
	@Resource
	private GoodsMapper goodsMapper ;
	
	@Override
	public List<Goods> queryAllGoods(Goods goods) {
		// TODO Auto-generated method stub
		System.out.println(goods + "==================");
		return goodsMapper.queryAllGoods(goods);
	}



	@Override
	public boolean deleteZhong(Zhong zhong) {
		// TODO Auto-generated method stub
		return goodsMapper.deleteZhong(zhong);
	}



	@Override
	public boolean insertZhong(int[] goodsIds, int userId) {
		boolean fleg = false ;
		for (int i : goodsIds) {
			Zhong zhong = new Zhong(userId, i, 1);
			goodsMapper.insertZhong(zhong);
			fleg =true ;
		}
		return fleg;
	}

}
