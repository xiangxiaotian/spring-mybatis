package org.study.spring_mybatis.usermag.aspectjs;

import java.lang.reflect.Method;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.study.spring_mybatis.utils.SessionUtils;

@Component
@Aspect
public class SqlSessionAspectJ {
	SqlSession session=null;
	@Before(value="execution(* org.study.spring_mybatis.usermag.dao.impl.User*.*(..))")
	public void before(JoinPoint jp){
		Object obj=jp.getTarget();
		Class<?> cls=obj.getClass();
		try {
			session=SessionUtils.getSession();
			Method mth=cls.getMethod("getSession",SqlSession.class);
			mth.invoke(obj,session);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("前置通知");
	}
	@AfterReturning(returning="obj",pointcut="execution(* org.study.spring_mybatis.usermag.dao.impl.User*.*(..))")
	public void afterReturn(JoinPoint jp){
		session.commit();
		session.close();
		System.out.println("后置返回通知");
	}
	@AfterThrowing(value="execution(* org.study.spring_mybatis.usermag.dao.impl.User*.*(..))")
	public void afterThrowing(JoinPoint jp){
		session.rollback();
		System.out.println("异常通知");
	}
}
