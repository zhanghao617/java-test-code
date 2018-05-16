package com.haoyukeji.water.service;
import com.haoyukeji.water.entity.TMinfo;
import com.haoyukeji.water.entity.TUinfo;

/**
 * @author 张浩
 */
public interface LoginService {

	//用户登录
	public boolean login(TUinfo tuinfo);

	//用户注册
	public  void register(TUinfo tuinfo);

	//用户注册，插入用户注册信息
	public void register(TMinfo tminfo);
}
