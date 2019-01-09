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
 * @author  ������
 *
 * ע������ 2018��7��18��
 *
 *
 */
@Controller
public class UserController {
	
	
//	���� �û�
	@Resource
	private UserService userService ;
	
	
//	ȥ��½��֤
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
	
//	ȥ��ѯ ���� ����û�����Ϣ Ȼ�� ������ʾ
	/*
	 * ���� Ҫ���� ���� �� �û�id ȥ��ѯ�� ��ϢȻ����ʾ
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
	
//	ɾ�� ����
	@RequestMapping("/deleteGoods")
	public String deleteGoods(Zhong zhong) {
		userService.deleteGoods(zhong);
		return "redirect:lookUser?userId="+zhong.getUserId();
	}
	
	
	

}
