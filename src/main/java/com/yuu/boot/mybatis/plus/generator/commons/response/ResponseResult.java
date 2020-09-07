package com.yuu.boot.mybatis.plus.generator.commons.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: ResponseResult
 * @Auther: Yuu
 * @Date: 2020/9/7 21:00
 * @Description: 通用的数据响应结果
 */
@Data
public class ResponseResult implements Serializable {

	private static final long serialVersionUID = 5907202414434691737L;

	/**
	 * 返回失败状态码
	 */
	private static final Integer SUCCESS_CODE = 200;

	/**
	 * 返回失败状态码
	 */
	private static final Integer FAIL_CODE = 500;

	/**
	 * 请求成功默认消息
	 */
	private static final String SUCCESS_MESSAGE = "请求成功";

	/**
	 * 请求失败默认消息
	 */
	private static final String FAIL_MESSAGE = "请求失败";

	/**
	 * 状态码
	 */
	private Integer code;

	/**
	 * 消息
	 */
	private String message;

	/**
	 * 需要返回的数据对象
	 */
	private Object data;

	/**
	 * 构造函数
	 * @param code
	 * @param message
	 * @param data
	 */
	private ResponseResult(Integer code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * 返回成功，默认 200，消息：请求成功
	 * @return
	 */
	public static ResponseResult success() {
		return new ResponseResult(SUCCESS_CODE, SUCCESS_MESSAGE, null);
	}

	/**
	 * 返回成功，自定义消息
	 * @param message
	 * @return
	 */
	public static ResponseResult success(String message) {
		return new ResponseResult(SUCCESS_CODE, message, null);
	}

	/**
	 * 返回成功，自定义数据
	 * @param data
	 * @return
	 */
	public static ResponseResult success(Object data) {
		return new ResponseResult(SUCCESS_CODE, SUCCESS_MESSAGE, data);
	}

	/**
	 * 返回成功，自定义消息，自定义数据
	 * @param message
	 * @param data
	 * @return
	 */
	public static ResponseResult success(String message, Object data) {
		return new ResponseResult(SUCCESS_CODE, message, data);
	}

	/**
	 * 返回失败，默认 500，消息：请求失败
	 * @return
	 */
	public static ResponseResult fail() {
		return new ResponseResult(FAIL_CODE, FAIL_MESSAGE, null);
	}

	/**
	 * 返回失败，自定义消息
	 * @param message
	 * @return
	 */
	public static ResponseResult fail(String message) {
		return new ResponseResult(FAIL_CODE, message, null);
	}

}
