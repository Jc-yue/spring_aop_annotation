package com.wenxuan.learn.service;

/**
 * 客户业务层接口
 * @author Administrator
 *
 */
public interface CustomerService {
	
	/**
	 * 保存客户
	 */
	void saveCustomer();
	
	/**
	 * 修改客户
	 * @param id
	 */
	void updateCustomer(Long id);
}

