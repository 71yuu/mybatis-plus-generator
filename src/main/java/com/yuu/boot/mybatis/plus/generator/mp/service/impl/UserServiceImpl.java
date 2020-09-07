package com.yuu.boot.mybatis.plus.generator.mp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuu.boot.mybatis.plus.generator.mp.domain.User;
import com.yuu.boot.mybatis.plus.generator.mp.mapper.UserMapper;
import com.yuu.boot.mybatis.plus.generator.mp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Yuu
 * @since 2020-09-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public boolean create(User user) {
		return super.save(user);
	}

	@Override
	public boolean remove(Long id) {
		return super.removeById(id);
	}

	@Override
	public boolean update(User user) {
		return super.updateById(user);
	}

	@Override
	public User get(Long id) {
		return super.getById(id);
	}

	@Override
	public IPage<User> page(int current, int size, User user) {
		Page<User> page = new Page<>(current, size);
		LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();

		// TODO 查询
		// TODO 排序

		return super.page(page, wrapper);
	}

}
