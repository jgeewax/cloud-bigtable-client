// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_data.proto

package com.google.bigtable.v1;

public interface MutationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.Mutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.bigtable.v1.Mutation.SetCell set_cell = 1;</code>
   *
   * <pre>
   * Set a cell's value.
   * </pre>
   */
  com.google.bigtable.v1.Mutation.SetCell getSetCell();
  /**
   * <code>optional .google.bigtable.v1.Mutation.SetCell set_cell = 1;</code>
   *
   * <pre>
   * Set a cell's value.
   * </pre>
   */
  com.google.bigtable.v1.Mutation.SetCellOrBuilder getSetCellOrBuilder();

  /**
   * <code>optional .google.bigtable.v1.Mutation.DeleteFromColumn delete_from_column = 2;</code>
   *
   * <pre>
   * Deletes cells from a column.
   * </pre>
   */
  com.google.bigtable.v1.Mutation.DeleteFromColumn getDeleteFromColumn();
  /**
   * <code>optional .google.bigtable.v1.Mutation.DeleteFromColumn delete_from_column = 2;</code>
   *
   * <pre>
   * Deletes cells from a column.
   * </pre>
   */
  com.google.bigtable.v1.Mutation.DeleteFromColumnOrBuilder getDeleteFromColumnOrBuilder();

  /**
   * <code>optional .google.bigtable.v1.Mutation.DeleteFromFamily delete_from_family = 3;</code>
   *
   * <pre>
   * Deletes cells from a column family.
   * </pre>
   */
  com.google.bigtable.v1.Mutation.DeleteFromFamily getDeleteFromFamily();
  /**
   * <code>optional .google.bigtable.v1.Mutation.DeleteFromFamily delete_from_family = 3;</code>
   *
   * <pre>
   * Deletes cells from a column family.
   * </pre>
   */
  com.google.bigtable.v1.Mutation.DeleteFromFamilyOrBuilder getDeleteFromFamilyOrBuilder();

  /**
   * <code>optional .google.bigtable.v1.Mutation.DeleteFromRow delete_from_row = 4;</code>
   *
   * <pre>
   * Deletes cells from the entire row.
   * </pre>
   */
  com.google.bigtable.v1.Mutation.DeleteFromRow getDeleteFromRow();
  /**
   * <code>optional .google.bigtable.v1.Mutation.DeleteFromRow delete_from_row = 4;</code>
   *
   * <pre>
   * Deletes cells from the entire row.
   * </pre>
   */
  com.google.bigtable.v1.Mutation.DeleteFromRowOrBuilder getDeleteFromRowOrBuilder();
}
