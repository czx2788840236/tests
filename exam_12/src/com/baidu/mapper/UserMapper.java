/**
 * 
 */
package com.baidu.mapper;

import com.baidu.bean.User; 
import com.baidu.bean.Zhong;

/**
 * @author  程振兴
 *
 * 注册日期 2018年7月18日
 * 
 * 
 */
public interface UserMapper {
	
//	根据 用户名字 和 密码查询
	public User queryUserByNameAndPwd(User user);
//	获取 所有 用户信息
	public User queryUserByUserId(int userId);
//	-
	public boolean  updateZhongJian(Zhong zhong);
//	+
	public boolean  updateZhongJia(Zhong zhong);
//	添加 永辉
	public boolean insertUser(User user);
//	删除
	public boolean deleteGoods(Zhong zhong);
	
}
