// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloWorld.proto

package com.huma.grpc;

public final class HelloWorld {
  private HelloWorld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_huma_grpc_RpcReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_huma_grpc_RpcReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_huma_grpc_RpcResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_huma_grpc_RpcResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020HelloWorld.proto\022\rcom.huma.grpc\"&\n\006Rpc" +
      "Req\022\014\n\004name\030\001 \001(\t\022\016\n\006school\030\002 \001(\t\"\031\n\007Rpc" +
      "Resp\022\016\n\006result\030\001 \001(\t2N\n\021HelloWorldServic" +
      "e\0229\n\010sayHello\022\025.com.huma.grpc.RpcReq\032\026.c" +
      "om.huma.grpc.RpcRespB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_huma_grpc_RpcReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_huma_grpc_RpcReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_huma_grpc_RpcReq_descriptor,
        new java.lang.String[] { "Name", "School", });
    internal_static_com_huma_grpc_RpcResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_huma_grpc_RpcResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_huma_grpc_RpcResp_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
