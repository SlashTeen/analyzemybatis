package me.mybatis.service;

import me.mybatis.mapper.ServiceMapper;

/**
 * Created by dell on 2017/8/20.
 */
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public void sayHello(String name) {
        System.out.println("wo de ming zi shi:"+name);
    }

    @Override
    public void sayGoodBye(String goodBye) {
        System.out.println("goodBye");
    }
}
