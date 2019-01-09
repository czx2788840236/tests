/**
 * 
 */
package com.baidu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.bean.User;
import com.baidu.bean.Zhong;
import com.baidu.service.UserService;

/**
 * @author  程振兴
 *
 * 注册日期 2018年7月18日
 *
 *
 */
@Controller
public class UserController {
	
	
//	链接 用户
	@Resource
	private UserService userService ;
	
	
//	去登陆验证
	@RequestMapping("/toLogin")
	@ResponseBody
	public boolean toLogin(User user,HttpSession session) {
		boolean fleg = false ;
		User queryUserByNameAndPwd = userService.queryUserByNameAndPwd(user);
		session.setAttribute("user", queryUserByNameAndPwd);
		if(queryUserByNameAndPwd != null) {
			fleg = true ;
		}
		System.out.println(user + "============");
		return fleg;
	}
	
//	去查询 出来 这个用户的信息 然后 进行显示
	/*
	 * 这里 要做的 就是 用 用户id 去查询出 信息然后显示
	*/
	@RequestMapping("/lookUser")
	public String lookUser(int userId,HttpServletRequest request) {
		User queryUserByUserId = userService.queryUserByUserId(userId);
		request.setAttribute("user", queryUserByUserId);
		return "lookUser";
	}
	
	@RequestMapping("/toUpdateZhongjia")
	public String  toUpdateZhongjia(Zhong zhong) {
		System.out.println(zhong + "==========");
		userService.updateZhongJia(zhong);
		return "redirect:lookUser?userId="+zhong.getUserId();
	}
	@RequestMapping("/toUpdateZhongjian")
	public String  toUpdateZhongjian(Zhong zhong) {
		System.out.println(zhong + "==========");
		userService.updateZhongJian(zhong);
		return "redirect:lookUser?userId="+zhong.getUserId();
	}
	
	@RequestMapping("/zhuche")
	public String zhuche() {
		return "zhuche";
	}
	
	@RequestMapping("/insertUser")
	@ResponseBody
	public boolean insertUser(User user) {
		System.out.println(user + " ==========");
		boolean insertUser = userService.insertUser(user);
		return insertUser;
	}
	
//	删除 进行
	@RequestMapping("/deleteGoods")
	public String deleteGoods(Zhong zhong) {
		userService.deleteGoods(zhong);
		return "redirect:lookUser?userId="+zhong.getUserId();
	}
	
	
	

}
