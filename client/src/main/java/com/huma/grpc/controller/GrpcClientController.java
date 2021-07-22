package com.huma.grpc.controller;

import com.huma.grpc.client.req.GrpcReq;
import com.huma.grpc.client.service.IHelloWorldRpc;
import com.huma.grpc.client.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hudenian
 * @date 2021/7/16
 */
@Slf4j
@RestController
@RequestMapping(value = "grpc", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = "grpc相关接口")
public class GrpcClientController {

    @Resource
    private IHelloWorldRpc helloWorldRpc;

    @GetMapping("test")
    @ApiOperation(value = "testGrpc", notes = "testGrpc")
    public ResponseVo<String> testGrpc(GrpcReq grpcReq) {
        log.info("grpc测试");
        String result = helloWorldRpc.sayHello(grpcReq.getName(), grpcReq.getSchool());
        return ResponseVo.createSuccess(result);
    }
}
