package com.wenxuan.learn.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 通知（增强的类）
 * @author Administrator
 *
 */
@Component("logger")
@Aspect//表明当前类是一个切面类
public class Logger {

	/**
	 * 期望：在业务代码执行之前执行此方法
	 */
	@Before("execution(* com.wenxuan.learn.service.impl.*.*(..))")
	public void pringLog() {
		System.out.println("pringLog开始记录日志...");
	}
}
