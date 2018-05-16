package com.haoyukeji.water.service;

/**
 * 创建接口，实现面向对象的编程思想
 * @author 段段
 *
 */
import java.util.List;

import com.haoyukeji.water.entity.TMinfo;
import com.haoyukeji.water.entity.TUinfo;
import com.haoyukeji.water.entity.TWinfo;

public interface AdminService {

	// 水电费信息维护
	List<TWinfo> showWaterInfo();

	// 用户信息维护
	List<TUinfo> showUserInfo();
	
	// 删除用户信息
	TUinfo findUser(Integer username);
	void deleteUser(TUinfo t);

	//更新用户信息
	List<TUinfo> findUserId(Integer username);
	void updateUser(TUinfo tuinfo);

	// 用户水电费查看
	List<TMinfo> showInfomation();

	//更新水电费信息
	List<TWinfo> findwater();

	void updateWater(TWinfo twinfo);

//	// 搜索用户信息
//	public List<TMinfo> search(Integer username);

	//更新用户水电费信息
	TMinfo findInfo(Integer integer);

	void updateInfo(TMinfo u);

}
