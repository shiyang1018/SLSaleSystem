package org.slsale.service.user;

import org.slsale.pojo.User;

public interface UserService {
	//获得登录用户
		public User getLoginUser(User user)throws Exception;
		//登录用户是否存在
		public int loginCodeIsExit(User user)throws Exception;

		public int modifyUser(User user)throws Exception;














}
