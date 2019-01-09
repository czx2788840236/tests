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
 * @author  程振兴
 *
 * 注册日期 2018年7月18日
 *
 *
 */
@Controller
public class GoodsController {
	
//	链接 Service
	@Resource
	private GoodsService goodsService ;
	
	@RequestMapping("/list")
	public String toList(Goods goods,HttpServletRequest request) {
		List<Goods> queryAllGoods = goodsService.queryAllGoods(goods);
		request.setAttribute("list", queryAllGoods);
		return "list";
	}
	
//	往购物车里面 添加数据
	@RequestMapping("/insertGoods")
	@ResponseBody
	public boolean insertGoods(String str,int userId) {
		System.out.println(str + userId);
		/*
		 * 这里要做的 就是 添加到中间表 根据两个id
		 * 然后 还得添加  -- 一个默认件数为1 
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
