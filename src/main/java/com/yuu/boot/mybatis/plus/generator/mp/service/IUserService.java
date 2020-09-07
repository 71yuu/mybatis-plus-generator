package com.yuu.boot.mybatis.plus.generator.mp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yuu.boot.mybatis.plus.generator.mp.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Yuu
 * @since 2020-09-07
 */
public interface IUserService extends IService<User> {

	/**
	 * 新增
	 * @param user {@link User}
	 * @return {@code boolean}
	 */
	boolean create(User user);

	/**
	 * 删除
	 * @param id {@code Long}
	 * @return {@code boolean}
	 */
	boolean remove(Long id);

	/**
	 * 编辑
	 * @param user {@link User}
	 * @return {@code boolean}
	 */
	boolean update(User user);

	/**
	 * 获取
	 * @param id {@code Long}
	 * @return {@link User}
	 */
	User get(Long id);

	/**
	 * 分页
	 * @param current {@code int} 页码
	 * @param size {@code int} 笔数
	 * @param user {@link User}
	 * @return {@code IPage<User>}
	 */
	IPage<User> page(int current, int size, User user);

}
