// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user-service.proto

// Protobuf Java Version: 3.25.1
package com.trading.user;

/**
 * Protobuf type {@code user.StockTradeRequest}
 */
public final class StockTradeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.StockTradeRequest)
    StockTradeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StockTradeRequest.newBuilder() to construct.
  private StockTradeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StockTradeRequest() {
    ticker_ = 0;
    action_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StockTradeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.trading.user.UserServiceOuterClass.internal_static_user_StockTradeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.trading.user.UserServiceOuterClass.internal_static_user_StockTradeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.trading.user.StockTradeRequest.class, com.trading.user.StockTradeRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private int userId_ = 0;
  /**
   * <code>int32 user_id = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  public static final int TICKER_FIELD_NUMBER = 2;
  private int ticker_ = 0;
  /**
   * <code>.common.Ticker ticker = 2;</code>
   * @return The enum numeric value on the wire for ticker.
   */
  @java.lang.Override public int getTickerValue() {
    return ticker_;
  }
  /**
   * <code>.common.Ticker ticker = 2;</code>
   * @return The ticker.
   */
  @java.lang.Override public com.trading.common.Ticker getTicker() {
    com.trading.common.Ticker result = com.trading.common.Ticker.forNumber(ticker_);
    return result == null ? com.trading.common.Ticker.UNRECOGNIZED : result;
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private int price_ = 0;
  /**
   * <code>int32 price = 3;</code>
   * @return The price.
   */
  @java.lang.Override
  public int getPrice() {
    return price_;
  }

  public static final int QUANTITY_FIELD_NUMBER = 4;
  private int quantity_ = 0;
  /**
   * <code>int32 quantity = 4;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
  }

  public static final int ACTION_FIELD_NUMBER = 5;
  private int action_ = 0;
  /**
   * <code>.user.TradeAction action = 5;</code>
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override public int getActionValue() {
    return action_;
  }
  /**
   * <code>.user.TradeAction action = 5;</code>
   * @return The action.
   */
  @java.lang.Override public com.trading.user.TradeAction getAction() {
    com.trading.user.TradeAction result = com.trading.user.TradeAction.forNumber(action_);
    return result == null ? com.trading.user.TradeAction.UNRECOGNIZED : result;
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
    if (userId_ != 0) {
      output.writeInt32(1, userId_);
    }
    if (ticker_ != com.trading.common.Ticker.UNKNOWN.getNumber()) {
      output.writeEnum(2, ticker_);
    }
    if (price_ != 0) {
      output.writeInt32(3, price_);
    }
    if (quantity_ != 0) {
      output.writeInt32(4, quantity_);
    }
    if (action_ != com.trading.user.TradeAction.BUY.getNumber()) {
      output.writeEnum(5, action_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, userId_);
    }
    if (ticker_ != com.trading.common.Ticker.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ticker_);
    }
    if (price_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, price_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, quantity_);
    }
    if (action_ != com.trading.user.TradeAction.BUY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, action_);
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
    if (!(obj instanceof com.trading.user.StockTradeRequest)) {
      return super.equals(obj);
    }
    com.trading.user.StockTradeRequest other = (com.trading.user.StockTradeRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (ticker_ != other.ticker_) return false;
    if (getPrice()
        != other.getPrice()) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
    if (action_ != other.action_) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + TICKER_FIELD_NUMBER;
    hash = (53 * hash) + ticker_;
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.trading.user.StockTradeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trading.user.StockTradeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trading.user.StockTradeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trading.user.StockTradeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trading.user.StockTradeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.trading.user.StockTradeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.trading.user.StockTradeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.trading.user.StockTradeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.trading.user.StockTradeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.trading.user.StockTradeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.trading.user.StockTradeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.trading.user.StockTradeRequest parseFrom(
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
  public static Builder newBuilder(com.trading.user.StockTradeRequest prototype) {
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
   * Protobuf type {@code user.StockTradeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.StockTradeRequest)
      com.trading.user.StockTradeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.trading.user.UserServiceOuterClass.internal_static_user_StockTradeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.trading.user.UserServiceOuterClass.internal_static_user_StockTradeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.trading.user.StockTradeRequest.class, com.trading.user.StockTradeRequest.Builder.class);
    }

    // Construct using com.trading.user.StockTradeRequest.newBuilder()
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
      userId_ = 0;
      ticker_ = 0;
      price_ = 0;
      quantity_ = 0;
      action_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.trading.user.UserServiceOuterClass.internal_static_user_StockTradeRequest_descriptor;
    }

    @java.lang.Override
    public com.trading.user.StockTradeRequest getDefaultInstanceForType() {
      return com.trading.user.StockTradeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.trading.user.StockTradeRequest build() {
      com.trading.user.StockTradeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.trading.user.StockTradeRequest buildPartial() {
      com.trading.user.StockTradeRequest result = new com.trading.user.StockTradeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.trading.user.StockTradeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ticker_ = ticker_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.price_ = price_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.quantity_ = quantity_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.action_ = action_;
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
      if (other instanceof com.trading.user.StockTradeRequest) {
        return mergeFrom((com.trading.user.StockTradeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.trading.user.StockTradeRequest other) {
      if (other == com.trading.user.StockTradeRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.ticker_ != 0) {
        setTickerValue(other.getTickerValue());
      }
      if (other.getPrice() != 0) {
        setPrice(other.getPrice());
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
      }
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
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
            case 8: {
              userId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              ticker_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              price_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              quantity_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              action_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private int userId_ ;
    /**
     * <code>int32 user_id = 1;</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {

      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userId_ = 0;
      onChanged();
      return this;
    }

    private int ticker_ = 0;
    /**
     * <code>.common.Ticker ticker = 2;</code>
     * @return The enum numeric value on the wire for ticker.
     */
    @java.lang.Override public int getTickerValue() {
      return ticker_;
    }
    /**
     * <code>.common.Ticker ticker = 2;</code>
     * @param value The enum numeric value on the wire for ticker to set.
     * @return This builder for chaining.
     */
    public Builder setTickerValue(int value) {
      ticker_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.common.Ticker ticker = 2;</code>
     * @return The ticker.
     */
    @java.lang.Override
    public com.trading.common.Ticker getTicker() {
      com.trading.common.Ticker result = com.trading.common.Ticker.forNumber(ticker_);
      return result == null ? com.trading.common.Ticker.UNRECOGNIZED : result;
    }
    /**
     * <code>.common.Ticker ticker = 2;</code>
     * @param value The ticker to set.
     * @return This builder for chaining.
     */
    public Builder setTicker(com.trading.common.Ticker value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      ticker_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.common.Ticker ticker = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTicker() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ticker_ = 0;
      onChanged();
      return this;
    }

    private int price_ ;
    /**
     * <code>int32 price = 3;</code>
     * @return The price.
     */
    @java.lang.Override
    public int getPrice() {
      return price_;
    }
    /**
     * <code>int32 price = 3;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(int value) {

      price_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 price = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      bitField0_ = (bitField0_ & ~0x00000004);
      price_ = 0;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 4;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 4;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {

      quantity_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      bitField0_ = (bitField0_ & ~0x00000008);
      quantity_ = 0;
      onChanged();
      return this;
    }

    private int action_ = 0;
    /**
     * <code>.user.TradeAction action = 5;</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override public int getActionValue() {
      return action_;
    }
    /**
     * <code>.user.TradeAction action = 5;</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      action_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.user.TradeAction action = 5;</code>
     * @return The action.
     */
    @java.lang.Override
    public com.trading.user.TradeAction getAction() {
      com.trading.user.TradeAction result = com.trading.user.TradeAction.forNumber(action_);
      return result == null ? com.trading.user.TradeAction.UNRECOGNIZED : result;
    }
    /**
     * <code>.user.TradeAction action = 5;</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.trading.user.TradeAction value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.user.TradeAction action = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000010);
      action_ = 0;
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


    // @@protoc_insertion_point(builder_scope:user.StockTradeRequest)
  }

  // @@protoc_insertion_point(class_scope:user.StockTradeRequest)
  private static final com.trading.user.StockTradeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.trading.user.StockTradeRequest();
  }

  public static com.trading.user.StockTradeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StockTradeRequest>
      PARSER = new com.google.protobuf.AbstractParser<StockTradeRequest>() {
    @java.lang.Override
    public StockTradeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StockTradeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StockTradeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.trading.user.StockTradeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

