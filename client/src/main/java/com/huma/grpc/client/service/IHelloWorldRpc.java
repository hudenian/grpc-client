package com.huma.grpc.client.service;

/**
 * @author hudenian
 * @date 2021/7/16
 */
public interface IHelloWorldRpc {

    /**
     * test gRPC
     * @param firstName firstName
     * @param lastName firstName
     * @return result
     */
    String sayHello(String firstName, String lastName);
}
