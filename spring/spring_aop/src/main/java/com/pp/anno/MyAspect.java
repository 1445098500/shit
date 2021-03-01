package com.pp.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component("myAspect")
@Aspect
public class MyAspect {

    //@Before("execution(* *..*.*(..))")
    public void before(){
        System.out.println("before.....");
    }

    public void afterRunning(){
        System.out.println("after running...");
    }

    //@Around("execution(* *..*.*(..))")
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before....");
        Object proceed = pjp.proceed();
        System.out.println("after.....");
        return proceed;
    }

    public void afterThrowing(){
        System.out.println("throwing....");
    }

    //@After("execution(* *..*.*(..))")
    @After("MyAspect.pointcut()")
    public void after(){
        System.out.println("after.....");
    }

    @Pointcut("execution(* *..*.*(..))")
    public void pointcut(){}
}
