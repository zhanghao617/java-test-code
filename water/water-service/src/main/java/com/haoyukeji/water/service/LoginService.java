package com.haoyukeji.water.service;

import com.haoyukeji.water.entity.Account;

/**
 * @author 张浩
 */
public interface LoginService {

/*	//用户登录
	boolean login(TUinfo tuinfo);

	//用户注册
	void register(TUinfo tuinfo);

	//用户注册，插入用户注册信息
	void register(TMinfo tminfo);*/

    /**
     * 验证是否存在该账号
     * @param phone
     * @return
     */
    Account findByPhone(String phone);

    /**
     * 添加新账号
     * @param account
     */
    void saveNewAccount(Account account);
}
