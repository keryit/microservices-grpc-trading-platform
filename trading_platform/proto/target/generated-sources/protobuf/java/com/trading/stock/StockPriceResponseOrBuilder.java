// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock-service.proto

// Protobuf Java Version: 3.25.1
package com.trading.stock;

public interface StockPriceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stock.StockPriceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.common.Ticker ticker = 1;</code>
   * @return The enum numeric value on the wire for ticker.
   */
  int getTickerValue();
  /**
   * <code>.common.Ticker ticker = 1;</code>
   * @return The ticker.
   */
  com.trading.common.Ticker getTicker();

  /**
   * <code>int32 price = 2;</code>
   * @return The price.
   */
  int getPrice();
}
