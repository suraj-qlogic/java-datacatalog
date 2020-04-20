/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Entry resources in Data Catalog can be of different types e.g. a BigQuery
 * Table entry is of type `TABLE`. This enum describes all the possible types
 * Data Catalog contains.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.datacatalog.v1beta1.EntryType}
 */
public enum EntryType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default unknown type.
   * </pre>
   *
   * <code>ENTRY_TYPE_UNSPECIFIED = 0;</code>
   */
  ENTRY_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Output only. The type of entry that has a GoogleSQL schema, including
   * logical views.
   * </pre>
   *
   * <code>TABLE = 2;</code>
   */
  TABLE(2),
  /**
   *
   *
   * <pre>
   * Output only. The type of models.
   * https://cloud.google.com/bigquery-ml/docs/bigqueryml-intro
   * </pre>
   *
   * <code>MODEL = 5;</code>
   */
  MODEL(5),
  /**
   *
   *
   * <pre>
   * Output only. An entry type which is used for streaming entries. Example:
   * Pub/Sub topic.
   * </pre>
   *
   * <code>DATA_STREAM = 3;</code>
   */
  DATA_STREAM(3),
  /**
   *
   *
   * <pre>
   * An entry type which is a set of files or objects. Example:
   * Cloud Storage fileset.
   * </pre>
   *
   * <code>FILESET = 4;</code>
   */
  FILESET(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default unknown type.
   * </pre>
   *
   * <code>ENTRY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ENTRY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Output only. The type of entry that has a GoogleSQL schema, including
   * logical views.
   * </pre>
   *
   * <code>TABLE = 2;</code>
   */
  public static final int TABLE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Output only. The type of models.
   * https://cloud.google.com/bigquery-ml/docs/bigqueryml-intro
   * </pre>
   *
   * <code>MODEL = 5;</code>
   */
  public static final int MODEL_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Output only. An entry type which is used for streaming entries. Example:
   * Pub/Sub topic.
   * </pre>
   *
   * <code>DATA_STREAM = 3;</code>
   */
  public static final int DATA_STREAM_VALUE = 3;
  /**
   *
   *
   * <pre>
   * An entry type which is a set of files or objects. Example:
   * Cloud Storage fileset.
   * </pre>
   *
   * <code>FILESET = 4;</code>
   */
  public static final int FILESET_VALUE = 4;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EntryType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EntryType forNumber(int value) {
    switch (value) {
      case 0:
        return ENTRY_TYPE_UNSPECIFIED;
      case 2:
        return TABLE;
      case 5:
        return MODEL;
      case 3:
        return DATA_STREAM;
      case 4:
        return FILESET;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EntryType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<EntryType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<EntryType>() {
        public EntryType findValueByNumber(int number) {
          return EntryType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog.getDescriptor().getEnumTypes().get(0);
  }

  private static final EntryType[] VALUES = values();

  public static EntryType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EntryType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datacatalog.v1beta1.EntryType)
}
