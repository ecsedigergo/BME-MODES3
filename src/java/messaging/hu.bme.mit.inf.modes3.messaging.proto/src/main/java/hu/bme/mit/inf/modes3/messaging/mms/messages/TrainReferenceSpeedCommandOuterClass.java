// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrainReferenceSpeedCommand.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

public final class TrainReferenceSpeedCommandOuterClass {
  private TrainReferenceSpeedCommandOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TrainReferenceSpeedCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TrainReferenceSpeedCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n TrainReferenceSpeedCommand.proto\032\013Enum" +
      "s.proto\"n\n\032TrainReferenceSpeedCommand\022\017\n" +
      "\007trainID\030\001 \001(\r\022\026\n\016referenceSpeed\030\002 \001(\r\022\'" +
      "\n\tdirection\030\003 \001(\0162\024.TrainDirectionValueB" +
      "0\n,hu.bme.mit.inf.modes3.messaging.mms.m" +
      "essagesP\001b\006proto3"
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
    internal_static_TrainReferenceSpeedCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TrainReferenceSpeedCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TrainReferenceSpeedCommand_descriptor,
        new java.lang.String[] { "TrainID", "ReferenceSpeed", "Direction", });
    hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
