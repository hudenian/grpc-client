package com.huma.grpc.client.service.Impl;

import com.huma.grpc.client.GrpcHelloWorldClient;
import com.huma.grpc.client.service.IHelloWorldRpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hudenian
 * @date 2021/7/16
 */
@Slf4j
@Service
public class HelloWorldRpcImpl implements IHelloWorldRpc {

    @Resource
    private GrpcHelloWorldClient helloWorldClient;

    @Override
    public String sayHello(String name, String school) {
        return helloWorldClient.sayHello(name, school);
    }
}
