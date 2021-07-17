package com.huma.grpc.controller;

import com.huma.grpc.client.req.GrpcReq;
import com.huma.grpc.client.service.IHelloWorldRpc;
import com.huma.grpc.client.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author hudenian
 * @date 2021/7/16
 */
@Slf4j
@RestController
@RequestMapping(value = "grpc", produces = MediaType.APPLICATION_JSON_VALUE)
public class GrpcClientController {

    @Resource
    private IHelloWorldRpc helloWorldRpc;

    @GetMapping("test")
    public ResponseVo<String> testGrpc(GrpcReq grpcReq) {
        log.info("grpc测试");
        String result = helloWorldRpc.sayHello(grpcReq.getName(), grpcReq.getSchool());
        return ResponseVo.createSuccess(result);
    }
}
