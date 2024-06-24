/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.generated.sources;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OrderDetailsAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 431802058127828565L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderDetailsAvro\",\"namespace\":\"com.generated.sources\",\"fields\":[{\"name\":\"shippingId\",\"type\":\"long\"},{\"name\":\"orderId\",\"type\":\"long\"},{\"name\":\"productId\",\"type\":\"long\"},{\"name\":\"userId\",\"type\":\"long\"},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"productPrice\",\"type\":\"double\"},{\"name\":\"productName\",\"type\":\"string\"},{\"name\":\"fileName\",\"type\":\"string\"},{\"name\":\"shippingAdd\",\"type\":\"string\"},{\"name\":\"pinCode\",\"type\":\"string\"},{\"name\":\"country\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderDetailsAvro> ENCODER =
      new BinaryMessageEncoder<OrderDetailsAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderDetailsAvro> DECODER =
      new BinaryMessageDecoder<OrderDetailsAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<OrderDetailsAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<OrderDetailsAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderDetailsAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this OrderDetailsAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a OrderDetailsAvro from a ByteBuffer. */
  public static OrderDetailsAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long shippingId;
  @Deprecated public long orderId;
  @Deprecated public long productId;
  @Deprecated public long userId;
  @Deprecated public int quantity;
  @Deprecated public double productPrice;
  @Deprecated public java.lang.CharSequence productName;
  @Deprecated public java.lang.CharSequence fileName;
  @Deprecated public java.lang.CharSequence shippingAdd;
  @Deprecated public java.lang.CharSequence pinCode;
  @Deprecated public java.lang.CharSequence country;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderDetailsAvro() {}

  /**
   * All-args constructor.
   * @param shippingId The new value for shippingId
   * @param orderId The new value for orderId
   * @param productId The new value for productId
   * @param userId The new value for userId
   * @param quantity The new value for quantity
   * @param productPrice The new value for productPrice
   * @param productName The new value for productName
   * @param fileName The new value for fileName
   * @param shippingAdd The new value for shippingAdd
   * @param pinCode The new value for pinCode
   * @param country The new value for country
   */
  public OrderDetailsAvro(java.lang.Long shippingId, java.lang.Long orderId, java.lang.Long productId, java.lang.Long userId, java.lang.Integer quantity, java.lang.Double productPrice, java.lang.CharSequence productName, java.lang.CharSequence fileName, java.lang.CharSequence shippingAdd, java.lang.CharSequence pinCode, java.lang.CharSequence country) {
    this.shippingId = shippingId;
    this.orderId = orderId;
    this.productId = productId;
    this.userId = userId;
    this.quantity = quantity;
    this.productPrice = productPrice;
    this.productName = productName;
    this.fileName = fileName;
    this.shippingAdd = shippingAdd;
    this.pinCode = pinCode;
    this.country = country;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return shippingId;
    case 1: return orderId;
    case 2: return productId;
    case 3: return userId;
    case 4: return quantity;
    case 5: return productPrice;
    case 6: return productName;
    case 7: return fileName;
    case 8: return shippingAdd;
    case 9: return pinCode;
    case 10: return country;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: shippingId = (java.lang.Long)value$; break;
    case 1: orderId = (java.lang.Long)value$; break;
    case 2: productId = (java.lang.Long)value$; break;
    case 3: userId = (java.lang.Long)value$; break;
    case 4: quantity = (java.lang.Integer)value$; break;
    case 5: productPrice = (java.lang.Double)value$; break;
    case 6: productName = (java.lang.CharSequence)value$; break;
    case 7: fileName = (java.lang.CharSequence)value$; break;
    case 8: shippingAdd = (java.lang.CharSequence)value$; break;
    case 9: pinCode = (java.lang.CharSequence)value$; break;
    case 10: country = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'shippingId' field.
   * @return The value of the 'shippingId' field.
   */
  public java.lang.Long getShippingId() {
    return shippingId;
  }

  /**
   * Sets the value of the 'shippingId' field.
   * @param value the value to set.
   */
  public void setShippingId(java.lang.Long value) {
    this.shippingId = value;
  }

  /**
   * Gets the value of the 'orderId' field.
   * @return The value of the 'orderId' field.
   */
  public java.lang.Long getOrderId() {
    return orderId;
  }

  /**
   * Sets the value of the 'orderId' field.
   * @param value the value to set.
   */
  public void setOrderId(java.lang.Long value) {
    this.orderId = value;
  }

  /**
   * Gets the value of the 'productId' field.
   * @return The value of the 'productId' field.
   */
  public java.lang.Long getProductId() {
    return productId;
  }

  /**
   * Sets the value of the 'productId' field.
   * @param value the value to set.
   */
  public void setProductId(java.lang.Long value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.Long getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.Long value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.lang.Integer value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'productPrice' field.
   * @return The value of the 'productPrice' field.
   */
  public java.lang.Double getProductPrice() {
    return productPrice;
  }

  /**
   * Sets the value of the 'productPrice' field.
   * @param value the value to set.
   */
  public void setProductPrice(java.lang.Double value) {
    this.productPrice = value;
  }

  /**
   * Gets the value of the 'productName' field.
   * @return The value of the 'productName' field.
   */
  public java.lang.CharSequence getProductName() {
    return productName;
  }

  /**
   * Sets the value of the 'productName' field.
   * @param value the value to set.
   */
  public void setProductName(java.lang.CharSequence value) {
    this.productName = value;
  }

  /**
   * Gets the value of the 'fileName' field.
   * @return The value of the 'fileName' field.
   */
  public java.lang.CharSequence getFileName() {
    return fileName;
  }

  /**
   * Sets the value of the 'fileName' field.
   * @param value the value to set.
   */
  public void setFileName(java.lang.CharSequence value) {
    this.fileName = value;
  }

  /**
   * Gets the value of the 'shippingAdd' field.
   * @return The value of the 'shippingAdd' field.
   */
  public java.lang.CharSequence getShippingAdd() {
    return shippingAdd;
  }

  /**
   * Sets the value of the 'shippingAdd' field.
   * @param value the value to set.
   */
  public void setShippingAdd(java.lang.CharSequence value) {
    this.shippingAdd = value;
  }

  /**
   * Gets the value of the 'pinCode' field.
   * @return The value of the 'pinCode' field.
   */
  public java.lang.CharSequence getPinCode() {
    return pinCode;
  }

  /**
   * Sets the value of the 'pinCode' field.
   * @param value the value to set.
   */
  public void setPinCode(java.lang.CharSequence value) {
    this.pinCode = value;
  }

  /**
   * Gets the value of the 'country' field.
   * @return The value of the 'country' field.
   */
  public java.lang.CharSequence getCountry() {
    return country;
  }

  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(java.lang.CharSequence value) {
    this.country = value;
  }

  /**
   * Creates a new OrderDetailsAvro RecordBuilder.
   * @return A new OrderDetailsAvro RecordBuilder
   */
  public static com.generated.sources.OrderDetailsAvro.Builder newBuilder() {
    return new com.generated.sources.OrderDetailsAvro.Builder();
  }

  /**
   * Creates a new OrderDetailsAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderDetailsAvro RecordBuilder
   */
  public static com.generated.sources.OrderDetailsAvro.Builder newBuilder(com.generated.sources.OrderDetailsAvro.Builder other) {
    return new com.generated.sources.OrderDetailsAvro.Builder(other);
  }

  /**
   * Creates a new OrderDetailsAvro RecordBuilder by copying an existing OrderDetailsAvro instance.
   * @param other The existing instance to copy.
   * @return A new OrderDetailsAvro RecordBuilder
   */
  public static com.generated.sources.OrderDetailsAvro.Builder newBuilder(com.generated.sources.OrderDetailsAvro other) {
    return new com.generated.sources.OrderDetailsAvro.Builder(other);
  }

  /**
   * RecordBuilder for OrderDetailsAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderDetailsAvro>
    implements org.apache.avro.data.RecordBuilder<OrderDetailsAvro> {

    private long shippingId;
    private long orderId;
    private long productId;
    private long userId;
    private int quantity;
    private double productPrice;
    private java.lang.CharSequence productName;
    private java.lang.CharSequence fileName;
    private java.lang.CharSequence shippingAdd;
    private java.lang.CharSequence pinCode;
    private java.lang.CharSequence country;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.generated.sources.OrderDetailsAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.shippingId)) {
        this.shippingId = data().deepCopy(fields()[0].schema(), other.shippingId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderId)) {
        this.orderId = data().deepCopy(fields()[1].schema(), other.orderId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.productId)) {
        this.productId = data().deepCopy(fields()[2].schema(), other.productId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userId)) {
        this.userId = data().deepCopy(fields()[3].schema(), other.userId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.quantity)) {
        this.quantity = data().deepCopy(fields()[4].schema(), other.quantity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.productPrice)) {
        this.productPrice = data().deepCopy(fields()[5].schema(), other.productPrice);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.productName)) {
        this.productName = data().deepCopy(fields()[6].schema(), other.productName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.fileName)) {
        this.fileName = data().deepCopy(fields()[7].schema(), other.fileName);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.shippingAdd)) {
        this.shippingAdd = data().deepCopy(fields()[8].schema(), other.shippingAdd);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.pinCode)) {
        this.pinCode = data().deepCopy(fields()[9].schema(), other.pinCode);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.country)) {
        this.country = data().deepCopy(fields()[10].schema(), other.country);
        fieldSetFlags()[10] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing OrderDetailsAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.generated.sources.OrderDetailsAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.shippingId)) {
        this.shippingId = data().deepCopy(fields()[0].schema(), other.shippingId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderId)) {
        this.orderId = data().deepCopy(fields()[1].schema(), other.orderId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.productId)) {
        this.productId = data().deepCopy(fields()[2].schema(), other.productId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.userId)) {
        this.userId = data().deepCopy(fields()[3].schema(), other.userId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.quantity)) {
        this.quantity = data().deepCopy(fields()[4].schema(), other.quantity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.productPrice)) {
        this.productPrice = data().deepCopy(fields()[5].schema(), other.productPrice);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.productName)) {
        this.productName = data().deepCopy(fields()[6].schema(), other.productName);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.fileName)) {
        this.fileName = data().deepCopy(fields()[7].schema(), other.fileName);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.shippingAdd)) {
        this.shippingAdd = data().deepCopy(fields()[8].schema(), other.shippingAdd);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.pinCode)) {
        this.pinCode = data().deepCopy(fields()[9].schema(), other.pinCode);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.country)) {
        this.country = data().deepCopy(fields()[10].schema(), other.country);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'shippingId' field.
      * @return The value.
      */
    public java.lang.Long getShippingId() {
      return shippingId;
    }

    /**
      * Sets the value of the 'shippingId' field.
      * @param value The value of 'shippingId'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setShippingId(long value) {
      validate(fields()[0], value);
      this.shippingId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'shippingId' field has been set.
      * @return True if the 'shippingId' field has been set, false otherwise.
      */
    public boolean hasShippingId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'shippingId' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearShippingId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderId' field.
      * @return The value.
      */
    public java.lang.Long getOrderId() {
      return orderId;
    }

    /**
      * Sets the value of the 'orderId' field.
      * @param value The value of 'orderId'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setOrderId(long value) {
      validate(fields()[1], value);
      this.orderId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'orderId' field has been set.
      * @return True if the 'orderId' field has been set, false otherwise.
      */
    public boolean hasOrderId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'orderId' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearOrderId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'productId' field.
      * @return The value.
      */
    public java.lang.Long getProductId() {
      return productId;
    }

    /**
      * Sets the value of the 'productId' field.
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setProductId(long value) {
      validate(fields()[2], value);
      this.productId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'productId' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearProductId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.Long getUserId() {
      return userId;
    }

    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setUserId(long value) {
      validate(fields()[3], value);
      this.userId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearUserId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public java.lang.Integer getQuantity() {
      return quantity;
    }

    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setQuantity(int value) {
      validate(fields()[4], value);
      this.quantity = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearQuantity() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'productPrice' field.
      * @return The value.
      */
    public java.lang.Double getProductPrice() {
      return productPrice;
    }

    /**
      * Sets the value of the 'productPrice' field.
      * @param value The value of 'productPrice'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setProductPrice(double value) {
      validate(fields()[5], value);
      this.productPrice = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'productPrice' field has been set.
      * @return True if the 'productPrice' field has been set, false otherwise.
      */
    public boolean hasProductPrice() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'productPrice' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearProductPrice() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'productName' field.
      * @return The value.
      */
    public java.lang.CharSequence getProductName() {
      return productName;
    }

    /**
      * Sets the value of the 'productName' field.
      * @param value The value of 'productName'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setProductName(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.productName = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'productName' field has been set.
      * @return True if the 'productName' field has been set, false otherwise.
      */
    public boolean hasProductName() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'productName' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearProductName() {
      productName = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'fileName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFileName() {
      return fileName;
    }

    /**
      * Sets the value of the 'fileName' field.
      * @param value The value of 'fileName'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setFileName(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.fileName = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'fileName' field has been set.
      * @return True if the 'fileName' field has been set, false otherwise.
      */
    public boolean hasFileName() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'fileName' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearFileName() {
      fileName = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'shippingAdd' field.
      * @return The value.
      */
    public java.lang.CharSequence getShippingAdd() {
      return shippingAdd;
    }

    /**
      * Sets the value of the 'shippingAdd' field.
      * @param value The value of 'shippingAdd'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setShippingAdd(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.shippingAdd = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'shippingAdd' field has been set.
      * @return True if the 'shippingAdd' field has been set, false otherwise.
      */
    public boolean hasShippingAdd() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'shippingAdd' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearShippingAdd() {
      shippingAdd = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'pinCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getPinCode() {
      return pinCode;
    }

    /**
      * Sets the value of the 'pinCode' field.
      * @param value The value of 'pinCode'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setPinCode(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.pinCode = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'pinCode' field has been set.
      * @return True if the 'pinCode' field has been set, false otherwise.
      */
    public boolean hasPinCode() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'pinCode' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearPinCode() {
      pinCode = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'country' field.
      * @return The value.
      */
    public java.lang.CharSequence getCountry() {
      return country;
    }

    /**
      * Sets the value of the 'country' field.
      * @param value The value of 'country'.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder setCountry(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.country = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'country' field.
      * @return This builder.
      */
    public com.generated.sources.OrderDetailsAvro.Builder clearCountry() {
      country = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderDetailsAvro build() {
      try {
        OrderDetailsAvro record = new OrderDetailsAvro();
        record.shippingId = fieldSetFlags()[0] ? this.shippingId : (java.lang.Long) defaultValue(fields()[0]);
        record.orderId = fieldSetFlags()[1] ? this.orderId : (java.lang.Long) defaultValue(fields()[1]);
        record.productId = fieldSetFlags()[2] ? this.productId : (java.lang.Long) defaultValue(fields()[2]);
        record.userId = fieldSetFlags()[3] ? this.userId : (java.lang.Long) defaultValue(fields()[3]);
        record.quantity = fieldSetFlags()[4] ? this.quantity : (java.lang.Integer) defaultValue(fields()[4]);
        record.productPrice = fieldSetFlags()[5] ? this.productPrice : (java.lang.Double) defaultValue(fields()[5]);
        record.productName = fieldSetFlags()[6] ? this.productName : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.fileName = fieldSetFlags()[7] ? this.fileName : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.shippingAdd = fieldSetFlags()[8] ? this.shippingAdd : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.pinCode = fieldSetFlags()[9] ? this.pinCode : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.country = fieldSetFlags()[10] ? this.country : (java.lang.CharSequence) defaultValue(fields()[10]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderDetailsAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderDetailsAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderDetailsAvro>
    READER$ = (org.apache.avro.io.DatumReader<OrderDetailsAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
