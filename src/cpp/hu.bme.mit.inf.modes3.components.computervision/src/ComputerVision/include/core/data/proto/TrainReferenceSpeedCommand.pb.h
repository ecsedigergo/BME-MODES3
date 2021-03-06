// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrainReferenceSpeedCommand.proto

#ifndef PROTOBUF_TrainReferenceSpeedCommand_2eproto__INCLUDED
#define PROTOBUF_TrainReferenceSpeedCommand_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 3004000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 3004000 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_table_driven.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>  // IWYU pragma: export
#include <google/protobuf/extension_set.h>  // IWYU pragma: export
#include <google/protobuf/unknown_field_set.h>
#include "Enums.pb.h"
// @@protoc_insertion_point(includes)
namespace modes3 {
namespace protobuf {
class TrainReferenceSpeedCommand;
class TrainReferenceSpeedCommandDefaultTypeInternal;
extern TrainReferenceSpeedCommandDefaultTypeInternal _TrainReferenceSpeedCommand_default_instance_;
}  // namespace protobuf
}  // namespace modes3

namespace modes3 {
namespace protobuf {

namespace protobuf_TrainReferenceSpeedCommand_2eproto {
// Internal implementation detail -- do not call these.
struct TableStruct {
  static const ::google::protobuf::internal::ParseTableField entries[];
  static const ::google::protobuf::internal::AuxillaryParseTableField aux[];
  static const ::google::protobuf::internal::ParseTable schema[];
  static const ::google::protobuf::uint32 offsets[];
  static const ::google::protobuf::internal::FieldMetadata field_metadata[];
  static const ::google::protobuf::internal::SerializationTable serialization_table[];
  static void InitDefaultsImpl();
};
void AddDescriptors();
void InitDefaults();
}  // namespace protobuf_TrainReferenceSpeedCommand_2eproto

// ===================================================================

class TrainReferenceSpeedCommand : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:modes3.protobuf.TrainReferenceSpeedCommand) */ {
 public:
  TrainReferenceSpeedCommand();
  virtual ~TrainReferenceSpeedCommand();

  TrainReferenceSpeedCommand(const TrainReferenceSpeedCommand& from);

  inline TrainReferenceSpeedCommand& operator=(const TrainReferenceSpeedCommand& from) {
    CopyFrom(from);
    return *this;
  }
  #if LANG_CXX11
  TrainReferenceSpeedCommand(TrainReferenceSpeedCommand&& from) noexcept
    : TrainReferenceSpeedCommand() {
    *this = ::std::move(from);
  }

  inline TrainReferenceSpeedCommand& operator=(TrainReferenceSpeedCommand&& from) noexcept {
    if (GetArenaNoVirtual() == from.GetArenaNoVirtual()) {
      if (this != &from) InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }
  #endif
  static const ::google::protobuf::Descriptor* descriptor();
  static const TrainReferenceSpeedCommand& default_instance();

  static inline const TrainReferenceSpeedCommand* internal_default_instance() {
    return reinterpret_cast<const TrainReferenceSpeedCommand*>(
               &_TrainReferenceSpeedCommand_default_instance_);
  }
  static PROTOBUF_CONSTEXPR int const kIndexInFileMessages =
    0;

  void Swap(TrainReferenceSpeedCommand* other);
  friend void swap(TrainReferenceSpeedCommand& a, TrainReferenceSpeedCommand& b) {
    a.Swap(&b);
  }

  // implements Message ----------------------------------------------

  inline TrainReferenceSpeedCommand* New() const PROTOBUF_FINAL { return New(NULL); }

  TrainReferenceSpeedCommand* New(::google::protobuf::Arena* arena) const PROTOBUF_FINAL;
  void CopyFrom(const ::google::protobuf::Message& from) PROTOBUF_FINAL;
  void MergeFrom(const ::google::protobuf::Message& from) PROTOBUF_FINAL;
  void CopyFrom(const TrainReferenceSpeedCommand& from);
  void MergeFrom(const TrainReferenceSpeedCommand& from);
  void Clear() PROTOBUF_FINAL;
  bool IsInitialized() const PROTOBUF_FINAL;

  size_t ByteSizeLong() const PROTOBUF_FINAL;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input) PROTOBUF_FINAL;
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const PROTOBUF_FINAL;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      bool deterministic, ::google::protobuf::uint8* target) const PROTOBUF_FINAL;
  int GetCachedSize() const PROTOBUF_FINAL { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const PROTOBUF_FINAL;
  void InternalSwap(TrainReferenceSpeedCommand* other);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return NULL;
  }
  inline void* MaybeArenaPtr() const {
    return NULL;
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const PROTOBUF_FINAL;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // uint32 trainID = 1;
  void clear_trainid();
  static const int kTrainIDFieldNumber = 1;
  ::google::protobuf::uint32 trainid() const;
  void set_trainid(::google::protobuf::uint32 value);

  // int32 referenceSpeed = 2;
  void clear_referencespeed();
  static const int kReferenceSpeedFieldNumber = 2;
  ::google::protobuf::int32 referencespeed() const;
  void set_referencespeed(::google::protobuf::int32 value);

  // .modes3.protobuf.TrainDirectionValue direction = 3;
  void clear_direction();
  static const int kDirectionFieldNumber = 3;
  ::modes3::protobuf::TrainDirectionValue direction() const;
  void set_direction(::modes3::protobuf::TrainDirectionValue value);

  // @@protoc_insertion_point(class_scope:modes3.protobuf.TrainReferenceSpeedCommand)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::uint32 trainid_;
  ::google::protobuf::int32 referencespeed_;
  int direction_;
  mutable int _cached_size_;
  friend struct protobuf_TrainReferenceSpeedCommand_2eproto::TableStruct;
};
// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
#ifdef __GNUC__
  #pragma GCC diagnostic push
  #pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// TrainReferenceSpeedCommand

// uint32 trainID = 1;
inline void TrainReferenceSpeedCommand::clear_trainid() {
  trainid_ = 0u;
}
inline ::google::protobuf::uint32 TrainReferenceSpeedCommand::trainid() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TrainReferenceSpeedCommand.trainID)
  return trainid_;
}
inline void TrainReferenceSpeedCommand::set_trainid(::google::protobuf::uint32 value) {
  
  trainid_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TrainReferenceSpeedCommand.trainID)
}

// int32 referenceSpeed = 2;
inline void TrainReferenceSpeedCommand::clear_referencespeed() {
  referencespeed_ = 0;
}
inline ::google::protobuf::int32 TrainReferenceSpeedCommand::referencespeed() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TrainReferenceSpeedCommand.referenceSpeed)
  return referencespeed_;
}
inline void TrainReferenceSpeedCommand::set_referencespeed(::google::protobuf::int32 value) {
  
  referencespeed_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TrainReferenceSpeedCommand.referenceSpeed)
}

// .modes3.protobuf.TrainDirectionValue direction = 3;
inline void TrainReferenceSpeedCommand::clear_direction() {
  direction_ = 0;
}
inline ::modes3::protobuf::TrainDirectionValue TrainReferenceSpeedCommand::direction() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TrainReferenceSpeedCommand.direction)
  return static_cast< ::modes3::protobuf::TrainDirectionValue >(direction_);
}
inline void TrainReferenceSpeedCommand::set_direction(::modes3::protobuf::TrainDirectionValue value) {
  
  direction_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TrainReferenceSpeedCommand.direction)
}

#ifdef __GNUC__
  #pragma GCC diagnostic pop
#endif  // __GNUC__
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)


}  // namespace protobuf
}  // namespace modes3

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_TrainReferenceSpeedCommand_2eproto__INCLUDED
