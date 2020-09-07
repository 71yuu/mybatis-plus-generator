package com.yuu.boot.mybatis.plus.generator.mp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yuu.boot.mybatis.plus.generator.commons.response.ResponseResult;
import com.yuu.boot.mybatis.plus.generator.mp.domain.User;
import com.yuu.boot.mybatis.plus.generator.mp.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Yuu
 * @since 2020-09-07
 */
@RestController
@RequestMapping("/mp/user")
public class UserController {

	@Resource
	private IUserService userService;

	/**
	 * 新增
	 * @param user {@link User}
	 * @return {@link ResponseResult}
	 */
	@PostMapping("create")
	public ResponseResult create(@RequestBody User user) {

		// 业务逻辑
		boolean created = userService.create(user);
		if (created) {
			return ResponseResult.success("创建成功");
		}

		return null;
	}

	/**
	 * 删除
	 * @param userId {@code Long}
	 * @return {@link ResponseResult}
	 */
	@DeleteMapping("remove/{userId}")
	public ResponseResult remove(@PathVariable Long userId) {
		// 业务逻辑
		boolean deleted = userService.remove(userId);
		if (deleted) {
			return ResponseResult.success("删除成功");
		}

		return null;
	}

	/**
	 * 修改
	 * @param user {@link User}
	 * @return {@link ResponseResult}
	 */
	@PutMapping("update")
	public ResponseResult update(@RequestBody User user) {
		// 业务逻辑
		boolean updated = userService.update(user);
		if (updated) {
			return ResponseResult.success("编辑成功");
		}

		return null;
	}

	/**
	 * 获取
	 * @param userId {@code Long}
	 * @return {@link ResponseResult}
	 */
	@GetMapping("get/{userId}")
	public ResponseResult get(@PathVariable Long userId) {
		User user = userService.get(userId);
		return ResponseResult.success(user);
	}

	/**
	 * 分页
	 * @param current {@code int} 页码
	 * @param size {@code int} 笔数
	 * @return {@link ResponseResult}
	 */
	@GetMapping("page")
	public ResponseResult page(@RequestParam int current, @RequestParam int size, @ModelAttribute User user) {
		IPage<User> page = userService.page(current, size, user);
		return ResponseResult.success(page);
	}

}
