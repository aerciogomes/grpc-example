// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.calculator;

/**
 * Protobuf type {@code calculator.Sum}
 */
public final class Sum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.Sum)
    SumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Sum.newBuilder() to construct.
  private Sum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Sum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Sum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Sum(
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
          case 8: {

            firstNumber_ = input.readInt32();
            break;
          }
          case 16: {

            secondNumber_ = input.readInt32();
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
    return com.proto.calculator.Calculator.internal_static_calculator_Sum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.calculator.Calculator.internal_static_calculator_Sum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.calculator.Sum.class, com.proto.calculator.Sum.Builder.class);
  }

  public static final int FIRST_NUMBER_FIELD_NUMBER = 1;
  private int firstNumber_;
  /**
   * <code>int32 first_number = 1;</code>
   * @return The firstNumber.
   */
  @java.lang.Override
  public int getFirstNumber() {
    return firstNumber_;
  }

  public static final int SECOND_NUMBER_FIELD_NUMBER = 2;
  private int secondNumber_;
  /**
   * <code>int32 second_number = 2;</code>
   * @return The secondNumber.
   */
  @java.lang.Override
  public int getSecondNumber() {
    return secondNumber_;
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
    if (firstNumber_ != 0) {
      output.writeInt32(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      output.writeInt32(2, secondNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firstNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, firstNumber_);
    }
    if (secondNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, secondNumber_);
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
    if (!(obj instanceof com.proto.calculator.Sum)) {
      return super.equals(obj);
    }
    com.proto.calculator.Sum other = (com.proto.calculator.Sum) obj;

    if (getFirstNumber()
        != other.getFirstNumber()) return false;
    if (getSecondNumber()
        != other.getSecondNumber()) return false;
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
    hash = (37 * hash) + FIRST_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getFirstNumber();
    hash = (37 * hash) + SECOND_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSecondNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.calculator.Sum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.Sum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.Sum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.Sum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.Sum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.Sum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.Sum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.Sum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.Sum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.calculator.Sum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.Sum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.Sum parseFrom(
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
  public static Builder newBuilder(com.proto.calculator.Sum prototype) {
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
   * Protobuf type {@code calculator.Sum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.Sum)
      com.proto.calculator.SumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.calculator.Calculator.internal_static_calculator_Sum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.calculator.Calculator.internal_static_calculator_Sum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.calculator.Sum.class, com.proto.calculator.Sum.Builder.class);
    }

    // Construct using com.proto.calculator.Sum.newBuilder()
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
      firstNumber_ = 0;

      secondNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.calculator.Calculator.internal_static_calculator_Sum_descriptor;
    }

    @java.lang.Override
    public com.proto.calculator.Sum getDefaultInstanceForType() {
      return com.proto.calculator.Sum.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.calculator.Sum build() {
      com.proto.calculator.Sum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.calculator.Sum buildPartial() {
      com.proto.calculator.Sum result = new com.proto.calculator.Sum(this);
      result.firstNumber_ = firstNumber_;
      result.secondNumber_ = secondNumber_;
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
      if (other instanceof com.proto.calculator.Sum) {
        return mergeFrom((com.proto.calculator.Sum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.calculator.Sum other) {
      if (other == com.proto.calculator.Sum.getDefaultInstance()) return this;
      if (other.getFirstNumber() != 0) {
        setFirstNumber(other.getFirstNumber());
      }
      if (other.getSecondNumber() != 0) {
        setSecondNumber(other.getSecondNumber());
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
      com.proto.calculator.Sum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.calculator.Sum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int firstNumber_ ;
    /**
     * <code>int32 first_number = 1;</code>
     * @return The firstNumber.
     */
    @java.lang.Override
    public int getFirstNumber() {
      return firstNumber_;
    }
    /**
     * <code>int32 first_number = 1;</code>
     * @param value The firstNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNumber(int value) {
      
      firstNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 first_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstNumber() {
      
      firstNumber_ = 0;
      onChanged();
      return this;
    }

    private int secondNumber_ ;
    /**
     * <code>int32 second_number = 2;</code>
     * @return The secondNumber.
     */
    @java.lang.Override
    public int getSecondNumber() {
      return secondNumber_;
    }
    /**
     * <code>int32 second_number = 2;</code>
     * @param value The secondNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSecondNumber(int value) {
      
      secondNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 second_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondNumber() {
      
      secondNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:calculator.Sum)
  }

  // @@protoc_insertion_point(class_scope:calculator.Sum)
  private static final com.proto.calculator.Sum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.calculator.Sum();
  }

  public static com.proto.calculator.Sum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Sum>
      PARSER = new com.google.protobuf.AbstractParser<Sum>() {
    @java.lang.Override
    public Sum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Sum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Sum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Sum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.calculator.Sum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

