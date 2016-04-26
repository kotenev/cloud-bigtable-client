// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/instance.proto

package com.google.bigtable.admin.v2;

public interface ClusterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.Cluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * &#64;OutputOnly
   * </pre>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * &#64;OutputOnly
   * </pre>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string location = 2;</code>
   *
   * <pre>
   * &#64;CreationOnly
   * Currently only zones are supported, e.g. projects/&#42;&#47;locations/us-central1-b
   * </pre>
   */
  java.lang.String getLocation();
  /**
   * <code>optional string location = 2;</code>
   *
   * <pre>
   * &#64;CreationOnly
   * Currently only zones are supported, e.g. projects/&#42;&#47;locations/us-central1-b
   * </pre>
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>optional .google.bigtable.admin.v2.Cluster.State state = 3;</code>
   *
   * <pre>
   * &#64;OutputOnly
   * </pre>
   */
  int getStateValue();
  /**
   * <code>optional .google.bigtable.admin.v2.Cluster.State state = 3;</code>
   *
   * <pre>
   * &#64;OutputOnly
   * </pre>
   */
  com.google.bigtable.admin.v2.Cluster.State getState();

  /**
   * <code>optional int32 serve_nodes = 4;</code>
   */
  int getServeNodes();

  /**
   * <code>optional .google.bigtable.admin.v2.StorageType default_storage_type = 5;</code>
   *
   * <pre>
   * &#64;CreationOnly
   * </pre>
   */
  int getDefaultStorageTypeValue();
  /**
   * <code>optional .google.bigtable.admin.v2.StorageType default_storage_type = 5;</code>
   *
   * <pre>
   * &#64;CreationOnly
   * </pre>
   */
  com.google.bigtable.admin.v2.StorageType getDefaultStorageType();
}