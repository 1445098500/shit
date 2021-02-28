package com.pp.proxy.cglib;

import com.pp.proxy.jdk.Target;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        TargetImpl target = new TargetImpl();

        Advice advice = new Advice();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(TargetImpl.class);

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();
                Object invoke = method.invoke(target, objects);
                advice.after();
                return invoke;
            }
        });

        TargetImpl proxy = (TargetImpl) enhancer.create();
        proxy.save();
    }


}
