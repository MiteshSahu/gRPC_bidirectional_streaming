// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: storage_message.proto

package com.example.project.protobuf.pb;

public final class StorageMessage {
  private StorageMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_protobuf_Storage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_protobuf_Storage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025storage_message.proto\022\020example.protobu" +
      "f\032\024memory_message.proto\"\216\001\n\007Storage\0220\n\006d" +
      "river\030\001 \001(\0162 .example.protobuf.Storage.D" +
      "river\022(\n\006memory\030\002 \001(\0132\030.example.protobuf" +
      ".Memory\"\'\n\006Driver\022\013\n\007UNKNOWN\020\000\022\007\n\003HDD\020\001\022" +
      "\007\n\003SSD\020\002B\'\n\037com.example.project.protobuf" +
      ".pbP\001Z\002pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.example.project.protobuf.pb.MemoryMessage.getDescriptor(),
        });
    internal_static_example_protobuf_Storage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_protobuf_Storage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_protobuf_Storage_descriptor,
        new java.lang.String[] { "Driver", "Memory", });
    com.example.project.protobuf.pb.MemoryMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
