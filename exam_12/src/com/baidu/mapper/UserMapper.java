/**
 * 
 */
package com.baidu.mapper;

import com.baidu.bean.User; 
import com.baidu.bean.Zhong;

/**
 * @author  ������
 *
 * ע������ 2018��7��18��
 * 
 * 
 */
public interface UserMapper {
	
//	���� �û����� �� �����ѯ
	public User queryUserByNameAndPwd(User user);
//	��ȡ ���� �û���Ϣ
	public User queryUserByUserId(int userId);
//	-
	public boolean  updateZhongJian(Zhong zhong);
//	+
	public boolean  updateZhongJia(Zhong zhong);
//	��� ����
	public boolean insertUser(User user);
//	ɾ��
	public boolean deleteGoods(Zhong zhong);
	
}
