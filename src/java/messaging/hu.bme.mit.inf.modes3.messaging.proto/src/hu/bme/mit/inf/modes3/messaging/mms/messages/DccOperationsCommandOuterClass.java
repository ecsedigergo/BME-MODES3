// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DccOperationsCommand.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

public final class DccOperationsCommandOuterClass {
  private DccOperationsCommandOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_modes3_protobuf_DccOperationsCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_modes3_protobuf_DccOperationsCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032DccOperationsCommand.proto\022\017modes3.pro" +
      "tobuf\032\013Enums.proto\"M\n\024DccOperationsComma" +
      "nd\0225\n\rdccOperations\030\001 \001(\0162\036.modes3.proto" +
      "buf.DccOperationsB0\n,hu.bme.mit.inf.mode" +
      "s3.messaging.mms.messagesP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor(),
        }, assigner);
    internal_static_modes3_protobuf_DccOperationsCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_modes3_protobuf_DccOperationsCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_modes3_protobuf_DccOperationsCommand_descriptor,
        new java.lang.String[] { "DccOperations", });
    hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}