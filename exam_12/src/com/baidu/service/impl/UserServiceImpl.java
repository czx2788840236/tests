/**
 * 
 */
package com.baidu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.baidu.bean.User;
import com.baidu.bean.Zhong;
import com.baidu.mapper.UserMapper;
import com.baidu.service.UserService;

/**
 * @author  ������
 *
 * ע������ 2018��7��18��
 *
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
//	����
	@Resource
	private UserMapper userMapper ;
	
	@Override
	public User queryUserByNameAndPwd(User user) {
		// TODO Auto-generated method stub
		return userMapper.queryUserByNameAndPwd(user);
	}

	@Override
	public User queryUserByUserId(int userId) {
		// TODO Auto-generated method stub
		return userMapper.queryUserByUserId(userId);
	}

	@Override
	public boolean updateZhongJian(Zhong zhong) {
		// TODO Auto-generated method stub
		return userMapper.updateZhongJian(zhong);
	}

	@Override
	public boolean updateZhongJia(Zhong zhong) {
		// TODO Auto-generated method stub
		return userMapper.updateZhongJia(zhong);
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

	@Override
	public boolean deleteGoods(Zhong zhong) {
		// TODO Auto-generated method stub
		return userMapper.deleteGoods(zhong);
	}

}
