package com.aaa.spring.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName: Advice
 * @Author: LF
 * @Date: 2019/10/31
 *
 */
@Component
@Aspect
public class LogAdvice {
    /**
     * 前置
     * @param joinPoint
     */
    @Before("execution(* com.aaa.spring.service.impl.*.save*(..))")
    public void log(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(new Date()+"前置执行了"+methodName+"操作");
    }

    /**
     * 后置
     * @param joinPoint
     */
    @AfterReturning("execution(* com.aaa.spring.service.impl.*.save*(..))")
    public void before(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println(new Date()+"后置执行了"+methodName+"操作");
    }

}
