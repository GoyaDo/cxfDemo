package com.ysmjjsy.goya.cxfdemo.cxf;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author goya
 * @create 2022-05-05 23:29
 * @Description
 */
@Component
@WebService(serviceName = "TestService",endpointInterface = "com.ysmjjsy.goya.cxfdemo.cxf.TestService")
public class TestServiceImpl implements TestService {

    @Override
    public String getMessage(String name) {
        return "hello"+name;
    }

    @Override
    public User getUser() {

        User user = new User();
        user.setAge("20");
        user.setSex("男");
        user.setName("盼");


        return user;
    }
}
