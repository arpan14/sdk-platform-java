// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/sequence.proto

package com.google.showcase.v1beta1;

/**
 * Protobuf type {@code google.showcase.v1beta1.CreateStreamingSequenceRequest}
 */
public final class CreateStreamingSequenceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.CreateStreamingSequenceRequest)
    CreateStreamingSequenceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateStreamingSequenceRequest.newBuilder() to construct.
  private CreateStreamingSequenceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateStreamingSequenceRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateStreamingSequenceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.SequenceOuterClass.internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.SequenceOuterClass.internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.CreateStreamingSequenceRequest.class, com.google.showcase.v1beta1.CreateStreamingSequenceRequest.Builder.class);
  }

  public static final int STREAMING_SEQUENCE_FIELD_NUMBER = 1;
  private com.google.showcase.v1beta1.StreamingSequence streamingSequence_;
  /**
   * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
   * @return Whether the streamingSequence field is set.
   */
  @java.lang.Override
  public boolean hasStreamingSequence() {
    return streamingSequence_ != null;
  }
  /**
   * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
   * @return The streamingSequence.
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.StreamingSequence getStreamingSequence() {
    return streamingSequence_ == null ? com.google.showcase.v1beta1.StreamingSequence.getDefaultInstance() : streamingSequence_;
  }
  /**
   * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.StreamingSequenceOrBuilder getStreamingSequenceOrBuilder() {
    return streamingSequence_ == null ? com.google.showcase.v1beta1.StreamingSequence.getDefaultInstance() : streamingSequence_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (streamingSequence_ != null) {
      output.writeMessage(1, getStreamingSequence());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (streamingSequence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStreamingSequence());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.showcase.v1beta1.CreateStreamingSequenceRequest)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.CreateStreamingSequenceRequest other = (com.google.showcase.v1beta1.CreateStreamingSequenceRequest) obj;

    if (hasStreamingSequence() != other.hasStreamingSequence()) return false;
    if (hasStreamingSequence()) {
      if (!getStreamingSequence()
          .equals(other.getStreamingSequence())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStreamingSequence()) {
      hash = (37 * hash) + STREAMING_SEQUENCE_FIELD_NUMBER;
      hash = (53 * hash) + getStreamingSequence().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.showcase.v1beta1.CreateStreamingSequenceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.showcase.v1beta1.CreateStreamingSequenceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.CreateStreamingSequenceRequest)
      com.google.showcase.v1beta1.CreateStreamingSequenceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.SequenceOuterClass.internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.SequenceOuterClass.internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.CreateStreamingSequenceRequest.class, com.google.showcase.v1beta1.CreateStreamingSequenceRequest.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.CreateStreamingSequenceRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      streamingSequence_ = null;
      if (streamingSequenceBuilder_ != null) {
        streamingSequenceBuilder_.dispose();
        streamingSequenceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.SequenceOuterClass.internal_static_google_showcase_v1beta1_CreateStreamingSequenceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateStreamingSequenceRequest getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.CreateStreamingSequenceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateStreamingSequenceRequest build() {
      com.google.showcase.v1beta1.CreateStreamingSequenceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateStreamingSequenceRequest buildPartial() {
      com.google.showcase.v1beta1.CreateStreamingSequenceRequest result = new com.google.showcase.v1beta1.CreateStreamingSequenceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.CreateStreamingSequenceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.streamingSequence_ = streamingSequenceBuilder_ == null
            ? streamingSequence_
            : streamingSequenceBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.showcase.v1beta1.CreateStreamingSequenceRequest) {
        return mergeFrom((com.google.showcase.v1beta1.CreateStreamingSequenceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.CreateStreamingSequenceRequest other) {
      if (other == com.google.showcase.v1beta1.CreateStreamingSequenceRequest.getDefaultInstance()) return this;
      if (other.hasStreamingSequence()) {
        mergeStreamingSequence(other.getStreamingSequence());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getStreamingSequenceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.showcase.v1beta1.StreamingSequence streamingSequence_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.StreamingSequence, com.google.showcase.v1beta1.StreamingSequence.Builder, com.google.showcase.v1beta1.StreamingSequenceOrBuilder> streamingSequenceBuilder_;
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     * @return Whether the streamingSequence field is set.
     */
    public boolean hasStreamingSequence() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     * @return The streamingSequence.
     */
    public com.google.showcase.v1beta1.StreamingSequence getStreamingSequence() {
      if (streamingSequenceBuilder_ == null) {
        return streamingSequence_ == null ? com.google.showcase.v1beta1.StreamingSequence.getDefaultInstance() : streamingSequence_;
      } else {
        return streamingSequenceBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     */
    public Builder setStreamingSequence(com.google.showcase.v1beta1.StreamingSequence value) {
      if (streamingSequenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        streamingSequence_ = value;
      } else {
        streamingSequenceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     */
    public Builder setStreamingSequence(
        com.google.showcase.v1beta1.StreamingSequence.Builder builderForValue) {
      if (streamingSequenceBuilder_ == null) {
        streamingSequence_ = builderForValue.build();
      } else {
        streamingSequenceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     */
    public Builder mergeStreamingSequence(com.google.showcase.v1beta1.StreamingSequence value) {
      if (streamingSequenceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          streamingSequence_ != null &&
          streamingSequence_ != com.google.showcase.v1beta1.StreamingSequence.getDefaultInstance()) {
          getStreamingSequenceBuilder().mergeFrom(value);
        } else {
          streamingSequence_ = value;
        }
      } else {
        streamingSequenceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     */
    public Builder clearStreamingSequence() {
      bitField0_ = (bitField0_ & ~0x00000001);
      streamingSequence_ = null;
      if (streamingSequenceBuilder_ != null) {
        streamingSequenceBuilder_.dispose();
        streamingSequenceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     */
    public com.google.showcase.v1beta1.StreamingSequence.Builder getStreamingSequenceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStreamingSequenceFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     */
    public com.google.showcase.v1beta1.StreamingSequenceOrBuilder getStreamingSequenceOrBuilder() {
      if (streamingSequenceBuilder_ != null) {
        return streamingSequenceBuilder_.getMessageOrBuilder();
      } else {
        return streamingSequence_ == null ?
            com.google.showcase.v1beta1.StreamingSequence.getDefaultInstance() : streamingSequence_;
      }
    }
    /**
     * <code>.google.showcase.v1beta1.StreamingSequence streaming_sequence = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.StreamingSequence, com.google.showcase.v1beta1.StreamingSequence.Builder, com.google.showcase.v1beta1.StreamingSequenceOrBuilder> 
        getStreamingSequenceFieldBuilder() {
      if (streamingSequenceBuilder_ == null) {
        streamingSequenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.showcase.v1beta1.StreamingSequence, com.google.showcase.v1beta1.StreamingSequence.Builder, com.google.showcase.v1beta1.StreamingSequenceOrBuilder>(
                getStreamingSequence(),
                getParentForChildren(),
                isClean());
        streamingSequence_ = null;
      }
      return streamingSequenceBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.CreateStreamingSequenceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.CreateStreamingSequenceRequest)
  private static final com.google.showcase.v1beta1.CreateStreamingSequenceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.CreateStreamingSequenceRequest();
  }

  public static com.google.showcase.v1beta1.CreateStreamingSequenceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateStreamingSequenceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateStreamingSequenceRequest>() {
    @java.lang.Override
    public CreateStreamingSequenceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CreateStreamingSequenceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateStreamingSequenceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.CreateStreamingSequenceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
