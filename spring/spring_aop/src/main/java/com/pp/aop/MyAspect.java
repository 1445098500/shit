package com.pp.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before() {
        System.out.println("before.....");
    }

    public void afterRunning() {
        System.out.println("after running...");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before....");
        Object proceed = pjp.proceed();
        System.out.println("after.....");
        return proceed;
    }

    public void afterThrowing() {
        System.out.println("throwing....");
    }

    public void after() {
        System.out.println("after.....");
    }
}
