// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_service.proto

package com.example.project.protobuf.pb;

public interface UploadImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:example.protobuf.UploadImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.example.protobuf.ImageInfo info = 1;</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.example.protobuf.ImageInfo info = 1;</code>
   * @return The info.
   */
  com.example.project.protobuf.pb.ImageInfo getInfo();
  /**
   * <code>.example.protobuf.ImageInfo info = 1;</code>
   */
  com.example.project.protobuf.pb.ImageInfoOrBuilder getInfoOrBuilder();

  /**
   * <code>bytes chunk_data = 2;</code>
   * @return Whether the chunkData field is set.
   */
  boolean hasChunkData();
  /**
   * <code>bytes chunk_data = 2;</code>
   * @return The chunkData.
   */
  com.google.protobuf.ByteString getChunkData();

  public com.example.project.protobuf.pb.UploadImageRequest.DataCase getDataCase();
}
