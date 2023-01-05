// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/compliance.proto

package com.google.showcase.v1beta1;

/**
 * Protobuf type {@code google.showcase.v1beta1.RepeatResponse}
 */
public final class RepeatResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.RepeatResponse)
    RepeatResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepeatResponse.newBuilder() to construct.
  private RepeatResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepeatResponse() {
    bindingUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RepeatResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RepeatResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.showcase.v1beta1.RepeatRequest.Builder subBuilder = null;
            if (request_ != null) {
              subBuilder = request_.toBuilder();
            }
            request_ = input.readMessage(com.google.showcase.v1beta1.RepeatRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(request_);
              request_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            bindingUri_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_RepeatResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_RepeatResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.RepeatResponse.class, com.google.showcase.v1beta1.RepeatResponse.Builder.class);
  }

  public static final int REQUEST_FIELD_NUMBER = 1;
  private com.google.showcase.v1beta1.RepeatRequest request_;
  /**
   * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
   * @return Whether the request field is set.
   */
  @java.lang.Override
  public boolean hasRequest() {
    return request_ != null;
  }
  /**
   * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
   * @return The request.
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.RepeatRequest getRequest() {
    return request_ == null ? com.google.showcase.v1beta1.RepeatRequest.getDefaultInstance() : request_;
  }
  /**
   * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.RepeatRequestOrBuilder getRequestOrBuilder() {
    return getRequest();
  }

  public static final int BINDING_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object bindingUri_;
  /**
   * <pre>
   * The URI template the request was bound to server-side.
   * </pre>
   *
   * <code>string binding_uri = 2;</code>
   * @return The bindingUri.
   */
  @java.lang.Override
  public java.lang.String getBindingUri() {
    java.lang.Object ref = bindingUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bindingUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The URI template the request was bound to server-side.
   * </pre>
   *
   * <code>string binding_uri = 2;</code>
   * @return The bytes for bindingUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBindingUriBytes() {
    java.lang.Object ref = bindingUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bindingUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (request_ != null) {
      output.writeMessage(1, getRequest());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bindingUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bindingUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (request_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequest());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bindingUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bindingUri_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.showcase.v1beta1.RepeatResponse)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.RepeatResponse other = (com.google.showcase.v1beta1.RepeatResponse) obj;

    if (hasRequest() != other.hasRequest()) return false;
    if (hasRequest()) {
      if (!getRequest()
          .equals(other.getRequest())) return false;
    }
    if (!getBindingUri()
        .equals(other.getBindingUri())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRequest()) {
      hash = (37 * hash) + REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getRequest().hashCode();
    }
    hash = (37 * hash) + BINDING_URI_FIELD_NUMBER;
    hash = (53 * hash) + getBindingUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.showcase.v1beta1.RepeatResponse parseFrom(
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
  public static Builder newBuilder(com.google.showcase.v1beta1.RepeatResponse prototype) {
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
   * Protobuf type {@code google.showcase.v1beta1.RepeatResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.RepeatResponse)
      com.google.showcase.v1beta1.RepeatResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_RepeatResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_RepeatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.RepeatResponse.class, com.google.showcase.v1beta1.RepeatResponse.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.RepeatResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (requestBuilder_ == null) {
        request_ = null;
      } else {
        request_ = null;
        requestBuilder_ = null;
      }
      bindingUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.showcase.v1beta1.ComplianceOuterClass.internal_static_google_showcase_v1beta1_RepeatResponse_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.RepeatResponse getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.RepeatResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.RepeatResponse build() {
      com.google.showcase.v1beta1.RepeatResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.RepeatResponse buildPartial() {
      com.google.showcase.v1beta1.RepeatResponse result = new com.google.showcase.v1beta1.RepeatResponse(this);
      if (requestBuilder_ == null) {
        result.request_ = request_;
      } else {
        result.request_ = requestBuilder_.build();
      }
      result.bindingUri_ = bindingUri_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.showcase.v1beta1.RepeatResponse) {
        return mergeFrom((com.google.showcase.v1beta1.RepeatResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.RepeatResponse other) {
      if (other == com.google.showcase.v1beta1.RepeatResponse.getDefaultInstance()) return this;
      if (other.hasRequest()) {
        mergeRequest(other.getRequest());
      }
      if (!other.getBindingUri().isEmpty()) {
        bindingUri_ = other.bindingUri_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.showcase.v1beta1.RepeatResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.showcase.v1beta1.RepeatResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.showcase.v1beta1.RepeatRequest request_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.RepeatRequest, com.google.showcase.v1beta1.RepeatRequest.Builder, com.google.showcase.v1beta1.RepeatRequestOrBuilder> requestBuilder_;
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     * @return Whether the request field is set.
     */
    public boolean hasRequest() {
      return requestBuilder_ != null || request_ != null;
    }
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     * @return The request.
     */
    public com.google.showcase.v1beta1.RepeatRequest getRequest() {
      if (requestBuilder_ == null) {
        return request_ == null ? com.google.showcase.v1beta1.RepeatRequest.getDefaultInstance() : request_;
      } else {
        return requestBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     */
    public Builder setRequest(com.google.showcase.v1beta1.RepeatRequest value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
        onChanged();
      } else {
        requestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     */
    public Builder setRequest(
        com.google.showcase.v1beta1.RepeatRequest.Builder builderForValue) {
      if (requestBuilder_ == null) {
        request_ = builderForValue.build();
        onChanged();
      } else {
        requestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     */
    public Builder mergeRequest(com.google.showcase.v1beta1.RepeatRequest value) {
      if (requestBuilder_ == null) {
        if (request_ != null) {
          request_ =
            com.google.showcase.v1beta1.RepeatRequest.newBuilder(request_).mergeFrom(value).buildPartial();
        } else {
          request_ = value;
        }
        onChanged();
      } else {
        requestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     */
    public Builder clearRequest() {
      if (requestBuilder_ == null) {
        request_ = null;
        onChanged();
      } else {
        request_ = null;
        requestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     */
    public com.google.showcase.v1beta1.RepeatRequest.Builder getRequestBuilder() {
      
      onChanged();
      return getRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     */
    public com.google.showcase.v1beta1.RepeatRequestOrBuilder getRequestOrBuilder() {
      if (requestBuilder_ != null) {
        return requestBuilder_.getMessageOrBuilder();
      } else {
        return request_ == null ?
            com.google.showcase.v1beta1.RepeatRequest.getDefaultInstance() : request_;
      }
    }
    /**
     * <code>.google.showcase.v1beta1.RepeatRequest request = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.showcase.v1beta1.RepeatRequest, com.google.showcase.v1beta1.RepeatRequest.Builder, com.google.showcase.v1beta1.RepeatRequestOrBuilder> 
        getRequestFieldBuilder() {
      if (requestBuilder_ == null) {
        requestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.showcase.v1beta1.RepeatRequest, com.google.showcase.v1beta1.RepeatRequest.Builder, com.google.showcase.v1beta1.RepeatRequestOrBuilder>(
                getRequest(),
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      return requestBuilder_;
    }

    private java.lang.Object bindingUri_ = "";
    /**
     * <pre>
     * The URI template the request was bound to server-side.
     * </pre>
     *
     * <code>string binding_uri = 2;</code>
     * @return The bindingUri.
     */
    public java.lang.String getBindingUri() {
      java.lang.Object ref = bindingUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bindingUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The URI template the request was bound to server-side.
     * </pre>
     *
     * <code>string binding_uri = 2;</code>
     * @return The bytes for bindingUri.
     */
    public com.google.protobuf.ByteString
        getBindingUriBytes() {
      java.lang.Object ref = bindingUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bindingUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The URI template the request was bound to server-side.
     * </pre>
     *
     * <code>string binding_uri = 2;</code>
     * @param value The bindingUri to set.
     * @return This builder for chaining.
     */
    public Builder setBindingUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bindingUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI template the request was bound to server-side.
     * </pre>
     *
     * <code>string binding_uri = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBindingUri() {
      
      bindingUri_ = getDefaultInstance().getBindingUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The URI template the request was bound to server-side.
     * </pre>
     *
     * <code>string binding_uri = 2;</code>
     * @param value The bytes for bindingUri to set.
     * @return This builder for chaining.
     */
    public Builder setBindingUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bindingUri_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.RepeatResponse)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.RepeatResponse)
  private static final com.google.showcase.v1beta1.RepeatResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.RepeatResponse();
  }

  public static com.google.showcase.v1beta1.RepeatResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepeatResponse>
      PARSER = new com.google.protobuf.AbstractParser<RepeatResponse>() {
    @java.lang.Override
    public RepeatResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RepeatResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RepeatResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepeatResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.RepeatResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
