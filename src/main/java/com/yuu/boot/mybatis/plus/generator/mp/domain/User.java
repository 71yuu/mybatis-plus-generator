package com.yuu.boot.mybatis.plus.generator.mp.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author Yuu
 * @since 2020-09-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mp_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	private Integer id;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 性别 0 男 1 女
	 */
	private Boolean sex;

}
