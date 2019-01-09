/**
 * 
 */
package com.baidu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.bean.Goods;
import com.baidu.service.GoodsService;

/**
 * @author  ������
 *
 * ע������ 2018��7��18��
 *
 *
 */
@Controller
public class GoodsController {
	
//	���� Service
	@Resource
	private GoodsService goodsService ;
	
	@RequestMapping("/list")
	public String toList(Goods goods,HttpServletRequest request) {
		List<Goods> queryAllGoods = goodsService.queryAllGoods(goods);
		request.setAttribute("list", queryAllGoods);
		return "list";
	}
	
//	�����ﳵ���� �������
	@RequestMapping("/insertGoods")
	@ResponseBody
	public boolean insertGoods(String str,int userId) {
		System.out.println(str + userId);
		/*
		 * ����Ҫ���� ���� ��ӵ��м�� ��������id
		 * Ȼ�� �������  -- һ��Ĭ�ϼ���Ϊ1 
		*/
		String[] split = str.split(",");
		int[] arr  = new int[split.length];
		
		for (int i = 0; i < split.length; i++) {
			arr[i] = Integer.parseInt(split[i]);
		}
		boolean insertZhong = goodsService.insertZhong(arr, userId);
		return insertZhong;
	}
	
	

	
	
	
	
}
