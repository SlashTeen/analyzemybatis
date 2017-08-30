package me.mybatis.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dell on 2017/8/20.
 */
public class ServiceMapperProxy implements InvocationHandler {

    private Object target;

    public ServiceMapperProxy(){

    }

    public ServiceMapperProxy(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        System.out.println("代理类开始");
        if (target!=null){
            result = method.invoke(target, args);//target
        }else {
            System.out.println("target 是空;没有被增强的类!");
        }
        System.out.println("代理类结束");
        return result;
    }

}
