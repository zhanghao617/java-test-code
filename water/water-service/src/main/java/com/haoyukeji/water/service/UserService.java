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

public interface UserService {
	
	//水电费信息公示
	public List<TWinfo> showWaterInfo();

	//更改用户密码
	public TUinfo find(Integer username);
	public void update(TUinfo t);

	//用户水电费信息查询
	public List<TMinfo> showInfomation(int i);

	//获取电费表单
	public TMinfo getId(int parseInt);

	//用户水电缴费
	public void updateTM(TMinfo m);

	public TWinfo showWaterPrice();

	
	
	

	


	
	
}
