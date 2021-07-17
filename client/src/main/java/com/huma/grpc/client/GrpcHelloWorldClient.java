package com.huma.grpc.client;

import com.huma.grpc.HelloWorldServiceGrpc;
import com.huma.grpc.RpcReq;
import com.huma.grpc.RpcResp;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

/**
 * @author hudenian
 * @date 2021/7/16
 */
@Slf4j
@Component
public class GrpcHelloWorldClient extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    @GrpcClient("helloWorld-grpc-server")
    private HelloWorldServiceGrpc.HelloWorldServiceBlockingStub helloWorldServiceBlockingStub;

    public String sayHello(String name, String school) {
        RpcReq rpcReq = RpcReq.newBuilder().setName(name).setSchool(school).build();
        RpcResp rpcResp = helloWorldServiceBlockingStub.sayHello(rpcReq);
        log.info("client received {}", rpcResp);

        return rpcResp.getResult();
    }
}
