// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/common.proto

package com.google.bigtable.admin.v2;

/**
 * Protobuf type {@code google.bigtable.admin.v2.Progress}
 *
 * <pre>
 * Used to track progress of a change in long-running operation metadata.
 * </pre>
 */
public  final class Progress extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.Progress)
    ProgressOrBuilder {
  // Use Progress.newBuilder() to construct.
  private Progress(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Progress() {
    start_ = 0L;
    current_ = 0L;
    target_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Progress(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            start_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (startTime_ != null) {
              subBuilder = startTime_.toBuilder();
            }
            startTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(startTime_);
              startTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            current_ = input.readInt64();
            break;
          }
          case 32: {

            target_ = input.readInt64();
            break;
          }
          case 42: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (finishTime_ != null) {
              subBuilder = finishTime_.toBuilder();
            }
            finishTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(finishTime_);
              finishTime_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.v2.CommonProto.internal_static_google_bigtable_admin_v2_Progress_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.CommonProto.internal_static_google_bigtable_admin_v2_Progress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.Progress.class, com.google.bigtable.admin.v2.Progress.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private long start_;
  /**
   * <code>optional int64 start = 1;</code>
   *
   * <pre>
   * Generally left at zero, but may be different in cases where we're
   * tracking progress from a higher start to a lower target
   * (e.g. shrinking a cluster) or starting from a non-zero baseline
   * (e.g. growing a cluster that already had some nodes).
   * </pre>
   */
  public long getStart() {
    return start_;
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp startTime_;
  /**
   * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
   */
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int CURRENT_FIELD_NUMBER = 3;
  private long current_;
  /**
   * <code>optional int64 current = 3;</code>
   */
  public long getCurrent() {
    return current_;
  }

  public static final int TARGET_FIELD_NUMBER = 4;
  private long target_;
  /**
   * <code>optional int64 target = 4;</code>
   *
   * <pre>
   * An estimate of the target state, which may change over time.
   * </pre>
   */
  public long getTarget() {
    return target_;
  }

  public static final int FINISH_TIME_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp finishTime_;
  /**
   * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
   */
  public boolean hasFinishTime() {
    return finishTime_ != null;
  }
  /**
   * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
   */
  public com.google.protobuf.Timestamp getFinishTime() {
    return finishTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : finishTime_;
  }
  /**
   * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder() {
    return getFinishTime();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (start_ != 0L) {
      output.writeInt64(1, start_);
    }
    if (startTime_ != null) {
      output.writeMessage(2, getStartTime());
    }
    if (current_ != 0L) {
      output.writeInt64(3, current_);
    }
    if (target_ != 0L) {
      output.writeInt64(4, target_);
    }
    if (finishTime_ != null) {
      output.writeMessage(5, getFinishTime());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, start_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStartTime());
    }
    if (current_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, current_);
    }
    if (target_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, target_);
    }
    if (finishTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getFinishTime());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.admin.v2.Progress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.Progress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.Progress parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.Progress parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.Progress parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.v2.Progress parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.Progress parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.admin.v2.Progress parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.Progress parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.admin.v2.Progress parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.v2.Progress prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.admin.v2.Progress}
   *
   * <pre>
   * Used to track progress of a change in long-running operation metadata.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.Progress)
      com.google.bigtable.admin.v2.ProgressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.v2.CommonProto.internal_static_google_bigtable_admin_v2_Progress_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.CommonProto.internal_static_google_bigtable_admin_v2_Progress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.Progress.class, com.google.bigtable.admin.v2.Progress.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.Progress.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      start_ = 0L;

      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      current_ = 0L;

      target_ = 0L;

      if (finishTimeBuilder_ == null) {
        finishTime_ = null;
      } else {
        finishTime_ = null;
        finishTimeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.v2.CommonProto.internal_static_google_bigtable_admin_v2_Progress_descriptor;
    }

    public com.google.bigtable.admin.v2.Progress getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.Progress.getDefaultInstance();
    }

    public com.google.bigtable.admin.v2.Progress build() {
      com.google.bigtable.admin.v2.Progress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.v2.Progress buildPartial() {
      com.google.bigtable.admin.v2.Progress result = new com.google.bigtable.admin.v2.Progress(this);
      result.start_ = start_;
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      result.current_ = current_;
      result.target_ = target_;
      if (finishTimeBuilder_ == null) {
        result.finishTime_ = finishTime_;
      } else {
        result.finishTime_ = finishTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.Progress) {
        return mergeFrom((com.google.bigtable.admin.v2.Progress)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.Progress other) {
      if (other == com.google.bigtable.admin.v2.Progress.getDefaultInstance()) return this;
      if (other.getStart() != 0L) {
        setStart(other.getStart());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.getCurrent() != 0L) {
        setCurrent(other.getCurrent());
      }
      if (other.getTarget() != 0L) {
        setTarget(other.getTarget());
      }
      if (other.hasFinishTime()) {
        mergeFinishTime(other.getFinishTime());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.v2.Progress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.Progress) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long start_ ;
    /**
     * <code>optional int64 start = 1;</code>
     *
     * <pre>
     * Generally left at zero, but may be different in cases where we're
     * tracking progress from a higher start to a lower target
     * (e.g. shrinking a cluster) or starting from a non-zero baseline
     * (e.g. growing a cluster that already had some nodes).
     * </pre>
     */
    public long getStart() {
      return start_;
    }
    /**
     * <code>optional int64 start = 1;</code>
     *
     * <pre>
     * Generally left at zero, but may be different in cases where we're
     * tracking progress from a higher start to a lower target
     * (e.g. shrinking a cluster) or starting from a non-zero baseline
     * (e.g. growing a cluster that already had some nodes).
     * </pre>
     */
    public Builder setStart(long value) {
      
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 start = 1;</code>
     *
     * <pre>
     * Generally left at zero, but may be different in cases where we're
     * tracking progress from a higher start to a lower target
     * (e.g. shrinking a cluster) or starting from a non-zero baseline
     * (e.g. growing a cluster that already had some nodes).
     * </pre>
     */
    public Builder clearStart() {
      
      start_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTime_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
            com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp start_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private long current_ ;
    /**
     * <code>optional int64 current = 3;</code>
     */
    public long getCurrent() {
      return current_;
    }
    /**
     * <code>optional int64 current = 3;</code>
     */
    public Builder setCurrent(long value) {
      
      current_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 current = 3;</code>
     */
    public Builder clearCurrent() {
      
      current_ = 0L;
      onChanged();
      return this;
    }

    private long target_ ;
    /**
     * <code>optional int64 target = 4;</code>
     *
     * <pre>
     * An estimate of the target state, which may change over time.
     * </pre>
     */
    public long getTarget() {
      return target_;
    }
    /**
     * <code>optional int64 target = 4;</code>
     *
     * <pre>
     * An estimate of the target state, which may change over time.
     * </pre>
     */
    public Builder setTarget(long value) {
      
      target_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 target = 4;</code>
     *
     * <pre>
     * An estimate of the target state, which may change over time.
     * </pre>
     */
    public Builder clearTarget() {
      
      target_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp finishTime_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> finishTimeBuilder_;
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    public boolean hasFinishTime() {
      return finishTimeBuilder_ != null || finishTime_ != null;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    public com.google.protobuf.Timestamp getFinishTime() {
      if (finishTimeBuilder_ == null) {
        return finishTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : finishTime_;
      } else {
        return finishTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    public Builder setFinishTime(com.google.protobuf.Timestamp value) {
      if (finishTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        finishTime_ = value;
        onChanged();
      } else {
        finishTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    public Builder setFinishTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (finishTimeBuilder_ == null) {
        finishTime_ = builderForValue.build();
        onChanged();
      } else {
        finishTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    public Builder mergeFinishTime(com.google.protobuf.Timestamp value) {
      if (finishTimeBuilder_ == null) {
        if (finishTime_ != null) {
          finishTime_ =
            com.google.protobuf.Timestamp.newBuilder(finishTime_).mergeFrom(value).buildPartial();
        } else {
          finishTime_ = value;
        }
        onChanged();
      } else {
        finishTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    public Builder clearFinishTime() {
      if (finishTimeBuilder_ == null) {
        finishTime_ = null;
        onChanged();
      } else {
        finishTime_ = null;
        finishTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    public com.google.protobuf.Timestamp.Builder getFinishTimeBuilder() {
      
      onChanged();
      return getFinishTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder() {
      if (finishTimeBuilder_ != null) {
        return finishTimeBuilder_.getMessageOrBuilder();
      } else {
        return finishTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : finishTime_;
      }
    }
    /**
     * <code>optional .google.protobuf.Timestamp finish_time = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getFinishTimeFieldBuilder() {
      if (finishTimeBuilder_ == null) {
        finishTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getFinishTime(),
                getParentForChildren(),
                isClean());
        finishTime_ = null;
      }
      return finishTimeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.Progress)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.Progress)
  private static final com.google.bigtable.admin.v2.Progress DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.Progress();
  }

  public static com.google.bigtable.admin.v2.Progress getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Progress>
      PARSER = new com.google.protobuf.AbstractParser<Progress>() {
    public Progress parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Progress(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Progress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Progress> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.v2.Progress getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
