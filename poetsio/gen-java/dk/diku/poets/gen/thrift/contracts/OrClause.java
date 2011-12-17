/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package dk.diku.poets.gen.thrift.contracts;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrClause implements org.apache.thrift.TBase<OrClause, OrClause._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OrClause");

  private static final org.apache.thrift.protocol.TField LEFT_CLAUSE_FIELD_DESC = new org.apache.thrift.protocol.TField("leftClause", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RIGHT_CLAUSE_FIELD_DESC = new org.apache.thrift.protocol.TField("rightClause", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OrClauseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OrClauseTupleSchemeFactory());
  }

  public int leftClause; // required
  public int rightClause; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LEFT_CLAUSE((short)1, "leftClause"),
    RIGHT_CLAUSE((short)2, "rightClause");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // LEFT_CLAUSE
          return LEFT_CLAUSE;
        case 2: // RIGHT_CLAUSE
          return RIGHT_CLAUSE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LEFTCLAUSE_ISSET_ID = 0;
  private static final int __RIGHTCLAUSE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LEFT_CLAUSE, new org.apache.thrift.meta_data.FieldMetaData("leftClause", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    tmpMap.put(_Fields.RIGHT_CLAUSE, new org.apache.thrift.meta_data.FieldMetaData("rightClause", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OrClause.class, metaDataMap);
  }

  public OrClause() {
  }

  public OrClause(
    int leftClause,
    int rightClause)
  {
    this();
    this.leftClause = leftClause;
    setLeftClauseIsSet(true);
    this.rightClause = rightClause;
    setRightClauseIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OrClause(OrClause other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.leftClause = other.leftClause;
    this.rightClause = other.rightClause;
  }

  public OrClause deepCopy() {
    return new OrClause(this);
  }

  @Override
  public void clear() {
    setLeftClauseIsSet(false);
    this.leftClause = 0;
    setRightClauseIsSet(false);
    this.rightClause = 0;
  }

  public int getLeftClause() {
    return this.leftClause;
  }

  public OrClause setLeftClause(int leftClause) {
    this.leftClause = leftClause;
    setLeftClauseIsSet(true);
    return this;
  }

  public void unsetLeftClause() {
    __isset_bit_vector.clear(__LEFTCLAUSE_ISSET_ID);
  }

  /** Returns true if field leftClause is set (has been assigned a value) and false otherwise */
  public boolean isSetLeftClause() {
    return __isset_bit_vector.get(__LEFTCLAUSE_ISSET_ID);
  }

  public void setLeftClauseIsSet(boolean value) {
    __isset_bit_vector.set(__LEFTCLAUSE_ISSET_ID, value);
  }

  public int getRightClause() {
    return this.rightClause;
  }

  public OrClause setRightClause(int rightClause) {
    this.rightClause = rightClause;
    setRightClauseIsSet(true);
    return this;
  }

  public void unsetRightClause() {
    __isset_bit_vector.clear(__RIGHTCLAUSE_ISSET_ID);
  }

  /** Returns true if field rightClause is set (has been assigned a value) and false otherwise */
  public boolean isSetRightClause() {
    return __isset_bit_vector.get(__RIGHTCLAUSE_ISSET_ID);
  }

  public void setRightClauseIsSet(boolean value) {
    __isset_bit_vector.set(__RIGHTCLAUSE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LEFT_CLAUSE:
      if (value == null) {
        unsetLeftClause();
      } else {
        setLeftClause((Integer)value);
      }
      break;

    case RIGHT_CLAUSE:
      if (value == null) {
        unsetRightClause();
      } else {
        setRightClause((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LEFT_CLAUSE:
      return Integer.valueOf(getLeftClause());

    case RIGHT_CLAUSE:
      return Integer.valueOf(getRightClause());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LEFT_CLAUSE:
      return isSetLeftClause();
    case RIGHT_CLAUSE:
      return isSetRightClause();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OrClause)
      return this.equals((OrClause)that);
    return false;
  }

  public boolean equals(OrClause that) {
    if (that == null)
      return false;

    boolean this_present_leftClause = true;
    boolean that_present_leftClause = true;
    if (this_present_leftClause || that_present_leftClause) {
      if (!(this_present_leftClause && that_present_leftClause))
        return false;
      if (this.leftClause != that.leftClause)
        return false;
    }

    boolean this_present_rightClause = true;
    boolean that_present_rightClause = true;
    if (this_present_rightClause || that_present_rightClause) {
      if (!(this_present_rightClause && that_present_rightClause))
        return false;
      if (this.rightClause != that.rightClause)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(OrClause other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    OrClause typedOther = (OrClause)other;

    lastComparison = Boolean.valueOf(isSetLeftClause()).compareTo(typedOther.isSetLeftClause());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeftClause()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leftClause, typedOther.leftClause);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRightClause()).compareTo(typedOther.isSetRightClause());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRightClause()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rightClause, typedOther.rightClause);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("OrClause(");
    boolean first = true;

    sb.append("leftClause:");
    sb.append(this.leftClause);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rightClause:");
    sb.append(this.rightClause);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OrClauseStandardSchemeFactory implements SchemeFactory {
    public OrClauseStandardScheme getScheme() {
      return new OrClauseStandardScheme();
    }
  }

  private static class OrClauseStandardScheme extends StandardScheme<OrClause> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OrClause struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LEFT_CLAUSE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.leftClause = iprot.readI32();
              struct.setLeftClauseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RIGHT_CLAUSE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rightClause = iprot.readI32();
              struct.setRightClauseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, OrClause struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(LEFT_CLAUSE_FIELD_DESC);
      oprot.writeI32(struct.leftClause);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RIGHT_CLAUSE_FIELD_DESC);
      oprot.writeI32(struct.rightClause);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OrClauseTupleSchemeFactory implements SchemeFactory {
    public OrClauseTupleScheme getScheme() {
      return new OrClauseTupleScheme();
    }
  }

  private static class OrClauseTupleScheme extends TupleScheme<OrClause> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OrClause struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLeftClause()) {
        optionals.set(0);
      }
      if (struct.isSetRightClause()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLeftClause()) {
        oprot.writeI32(struct.leftClause);
      }
      if (struct.isSetRightClause()) {
        oprot.writeI32(struct.rightClause);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OrClause struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.leftClause = iprot.readI32();
        struct.setLeftClauseIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rightClause = iprot.readI32();
        struct.setRightClauseIsSet(true);
      }
    }
  }

}

