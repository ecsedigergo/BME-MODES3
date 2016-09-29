// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SegmentCommand.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "SegmentCommand.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/port.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace modes3
{
namespace protobuf
{

    namespace
    {

        const ::google::protobuf::Descriptor* SegmentCommand_descriptor_ = NULL;
        const ::google::protobuf::internal::GeneratedMessageReflection* SegmentCommand_reflection_ = NULL;

    } // namespace

    void protobuf_AssignDesc_SegmentCommand_2eproto()
    {
        protobuf_AddDesc_SegmentCommand_2eproto();
        const ::google::protobuf::FileDescriptor* file =
            ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName("SegmentCommand.proto");
        GOOGLE_CHECK(file != NULL);
        SegmentCommand_descriptor_ = file->message_type(0);
        static const int SegmentCommand_offsets_[2] = {
            GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SegmentCommand, segmentid_),
            GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SegmentCommand, state_),
        };
        SegmentCommand_reflection_ =
            ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
                SegmentCommand_descriptor_, SegmentCommand::default_instance_, SegmentCommand_offsets_, -1, -1, -1,
                sizeof(SegmentCommand),
                GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SegmentCommand, _internal_metadata_),
                GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(SegmentCommand, _is_default_instance_));
    }

    namespace
    {

        GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
        inline void protobuf_AssignDescriptorsOnce()
        {
            ::google::protobuf::GoogleOnceInit(
                &protobuf_AssignDescriptors_once_, &protobuf_AssignDesc_SegmentCommand_2eproto);
        }

        void protobuf_RegisterTypes(const ::std::string&)
        {
            protobuf_AssignDescriptorsOnce();
            ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
                SegmentCommand_descriptor_, &SegmentCommand::default_instance());
        }

    } // namespace

    void protobuf_ShutdownFile_SegmentCommand_2eproto()
    {
        delete SegmentCommand::default_instance_;
        delete SegmentCommand_reflection_;
    }

    void protobuf_AddDesc_SegmentCommand_2eproto()
    {
        static bool already_here = false;
        if(already_here)
            return;
        already_here = true;
        GOOGLE_PROTOBUF_VERIFY_VERSION;

        ::modes3::protobuf::protobuf_AddDesc_Enums_2eproto();
        ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
            "\n\024SegmentCommand.proto\022\017modes3.protobuf\032"
            "\013Enums.proto\"V\n\016SegmentCommand\022\021\n\tsegmen"
            "tID\030\001 \001(\r\0221\n\005state\030\002 \001(\0162\".modes3.protob"
            "uf.SegmentStateValueB0\n,hu.bme.mit.inf.m"
            "odes3.messaging.mms.messagesP\001b\006proto3",
            198);
        ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
            "SegmentCommand.proto", &protobuf_RegisterTypes);
        SegmentCommand::default_instance_ = new SegmentCommand();
        SegmentCommand::default_instance_->InitAsDefaultInstance();
        ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_SegmentCommand_2eproto);
    }

    // Force AddDescriptors() to be called at static initialization time.
    struct StaticDescriptorInitializer_SegmentCommand_2eproto {
        StaticDescriptorInitializer_SegmentCommand_2eproto()
        {
            protobuf_AddDesc_SegmentCommand_2eproto();
        }
    } static_descriptor_initializer_SegmentCommand_2eproto_;

    namespace
    {

        static void MergeFromFail(int line) GOOGLE_ATTRIBUTE_COLD;
        static void MergeFromFail(int line)
        {
            GOOGLE_CHECK(false) << __FILE__ << ":" << line;
        }

    } // namespace

// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
    const int SegmentCommand::kSegmentIDFieldNumber;
    const int SegmentCommand::kStateFieldNumber;
#endif // !defined(_MSC_VER) || _MSC_VER >= 1900

    SegmentCommand::SegmentCommand()
        : ::google::protobuf::Message()
        , _internal_metadata_(NULL)
    {
        SharedCtor();
        // @@protoc_insertion_point(constructor:modes3.protobuf.SegmentCommand)
    }

    void SegmentCommand::InitAsDefaultInstance()
    {
        _is_default_instance_ = true;
    }

    SegmentCommand::SegmentCommand(const SegmentCommand& from)
        : ::google::protobuf::Message()
        , _internal_metadata_(NULL)
    {
        SharedCtor();
        MergeFrom(from);
        // @@protoc_insertion_point(copy_constructor:modes3.protobuf.SegmentCommand)
    }

    void SegmentCommand::SharedCtor()
    {
        _is_default_instance_ = false;
        _cached_size_ = 0;
        segmentid_ = 0u;
        state_ = 0;
    }

    SegmentCommand::~SegmentCommand()
    {
        // @@protoc_insertion_point(destructor:modes3.protobuf.SegmentCommand)
        SharedDtor();
    }

    void SegmentCommand::SharedDtor()
    {
        if(this != default_instance_) {
        }
    }

    void SegmentCommand::SetCachedSize(int size) const
    {
        GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
        _cached_size_ = size;
        GOOGLE_SAFE_CONCURRENT_WRITES_END();
    }
    const ::google::protobuf::Descriptor* SegmentCommand::descriptor()
    {
        protobuf_AssignDescriptorsOnce();
        return SegmentCommand_descriptor_;
    }

    const SegmentCommand& SegmentCommand::default_instance()
    {
        if(default_instance_ == NULL)
            protobuf_AddDesc_SegmentCommand_2eproto();
        return *default_instance_;
    }

    SegmentCommand* SegmentCommand::default_instance_ = NULL;

    SegmentCommand* SegmentCommand::New(::google::protobuf::Arena* arena) const
    {
        SegmentCommand* n = new SegmentCommand;
        if(arena != NULL) {
            arena->Own(n);
        }
        return n;
    }

    void SegmentCommand::Clear()
    {
// @@protoc_insertion_point(message_clear_start:modes3.protobuf.SegmentCommand)
#if defined(__clang__)
#define ZR_HELPER_(f)                                                                                               \
    _Pragma("clang diagnostic push") _Pragma("clang diagnostic ignored \"-Winvalid-offsetof\"") __builtin_offsetof( \
        SegmentCommand, f) _Pragma("clang diagnostic pop")
#else
#define ZR_HELPER_(f) reinterpret_cast<char*>(&reinterpret_cast<SegmentCommand*>(16)->f)
#endif

#define ZR_(first, last)                                                          \
    do {                                                                          \
        ::memset(&first, 0, ZR_HELPER_(last) - ZR_HELPER_(first) + sizeof(last)); \
    } while(0)

        ZR_(segmentid_, state_);

#undef ZR_HELPER_
#undef ZR_
    }

    bool SegmentCommand::MergePartialFromCodedStream(::google::protobuf::io::CodedInputStream* input)
    {
#define DO_(EXPRESSION)                  \
    if(!GOOGLE_PREDICT_TRUE(EXPRESSION)) \
    goto failure
        ::google::protobuf::uint32 tag;
        // @@protoc_insertion_point(parse_start:modes3.protobuf.SegmentCommand)
        for(;;) {
            ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
            tag = p.first;
            if(!p.second)
                goto handle_unusual;
            switch(::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
            // optional uint32 segmentID = 1;
            case 1: {
                if(tag == 8) {
                    DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive< ::google::protobuf::uint32,
                        ::google::protobuf::internal::WireFormatLite::TYPE_UINT32>(input, &segmentid_)));

                } else {
                    goto handle_unusual;
                }
                if(input->ExpectTag(16))
                    goto parse_state;
                break;
            }

            // optional .modes3.protobuf.SegmentStateValue state = 2;
            case 2: {
                if(tag == 16) {
                parse_state:
                    int value;
                    DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<int,
                        ::google::protobuf::internal::WireFormatLite::TYPE_ENUM>(input, &value)));
                    set_state(static_cast< ::modes3::protobuf::SegmentStateValue>(value));
                } else {
                    goto handle_unusual;
                }
                if(input->ExpectAtEnd())
                    goto success;
                break;
            }

            default: {
            handle_unusual:
                if(tag == 0 ||
                    ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
                        ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
                    goto success;
                }
                DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
                break;
            }
            }
        }
    success:
        // @@protoc_insertion_point(parse_success:modes3.protobuf.SegmentCommand)
        return true;
    failure:
        // @@protoc_insertion_point(parse_failure:modes3.protobuf.SegmentCommand)
        return false;
#undef DO_
    }

    void SegmentCommand::SerializeWithCachedSizes(::google::protobuf::io::CodedOutputStream* output) const
    {
        // @@protoc_insertion_point(serialize_start:modes3.protobuf.SegmentCommand)
        // optional uint32 segmentID = 1;
        if(this->segmentid() != 0) {
            ::google::protobuf::internal::WireFormatLite::WriteUInt32(1, this->segmentid(), output);
        }

        // optional .modes3.protobuf.SegmentStateValue state = 2;
        if(this->state() != 0) {
            ::google::protobuf::internal::WireFormatLite::WriteEnum(2, this->state(), output);
        }

        // @@protoc_insertion_point(serialize_end:modes3.protobuf.SegmentCommand)
    }

    ::google::protobuf::uint8* SegmentCommand::InternalSerializeWithCachedSizesToArray(bool deterministic,
        ::google::protobuf::uint8* target) const
    {
        // @@protoc_insertion_point(serialize_to_array_start:modes3.protobuf.SegmentCommand)
        // optional uint32 segmentID = 1;
        if(this->segmentid() != 0) {
            target = ::google::protobuf::internal::WireFormatLite::WriteUInt32ToArray(1, this->segmentid(), target);
        }

        // optional .modes3.protobuf.SegmentStateValue state = 2;
        if(this->state() != 0) {
            target = ::google::protobuf::internal::WireFormatLite::WriteEnumToArray(2, this->state(), target);
        }

        // @@protoc_insertion_point(serialize_to_array_end:modes3.protobuf.SegmentCommand)
        return target;
    }

    int SegmentCommand::ByteSize() const
    {
        // @@protoc_insertion_point(message_byte_size_start:modes3.protobuf.SegmentCommand)
        int total_size = 0;

        // optional uint32 segmentID = 1;
        if(this->segmentid() != 0) {
            total_size += 1 + ::google::protobuf::internal::WireFormatLite::UInt32Size(this->segmentid());
        }

        // optional .modes3.protobuf.SegmentStateValue state = 2;
        if(this->state() != 0) {
            total_size += 1 + ::google::protobuf::internal::WireFormatLite::EnumSize(this->state());
        }

        GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
        _cached_size_ = total_size;
        GOOGLE_SAFE_CONCURRENT_WRITES_END();
        return total_size;
    }

    void SegmentCommand::MergeFrom(const ::google::protobuf::Message& from)
    {
        // @@protoc_insertion_point(generalized_merge_from_start:modes3.protobuf.SegmentCommand)
        if(GOOGLE_PREDICT_FALSE(&from == this))
            MergeFromFail(__LINE__);
        const SegmentCommand* source =
            ::google::protobuf::internal::DynamicCastToGenerated<const SegmentCommand>(&from);
        if(source == NULL) {
            // @@protoc_insertion_point(generalized_merge_from_cast_fail:modes3.protobuf.SegmentCommand)
            ::google::protobuf::internal::ReflectionOps::Merge(from, this);
        } else {
            // @@protoc_insertion_point(generalized_merge_from_cast_success:modes3.protobuf.SegmentCommand)
            MergeFrom(*source);
        }
    }

    void SegmentCommand::MergeFrom(const SegmentCommand& from)
    {
        // @@protoc_insertion_point(class_specific_merge_from_start:modes3.protobuf.SegmentCommand)
        if(GOOGLE_PREDICT_FALSE(&from == this))
            MergeFromFail(__LINE__);
        if(from.segmentid() != 0) {
            set_segmentid(from.segmentid());
        }
        if(from.state() != 0) {
            set_state(from.state());
        }
    }

    void SegmentCommand::CopyFrom(const ::google::protobuf::Message& from)
    {
        // @@protoc_insertion_point(generalized_copy_from_start:modes3.protobuf.SegmentCommand)
        if(&from == this)
            return;
        Clear();
        MergeFrom(from);
    }

    void SegmentCommand::CopyFrom(const SegmentCommand& from)
    {
        // @@protoc_insertion_point(class_specific_copy_from_start:modes3.protobuf.SegmentCommand)
        if(&from == this)
            return;
        Clear();
        MergeFrom(from);
    }

    bool SegmentCommand::IsInitialized() const
    {

        return true;
    }

    void SegmentCommand::Swap(SegmentCommand* other)
    {
        if(other == this)
            return;
        InternalSwap(other);
    }
    void SegmentCommand::InternalSwap(SegmentCommand* other)
    {
        std::swap(segmentid_, other->segmentid_);
        std::swap(state_, other->state_);
        _internal_metadata_.Swap(&other->_internal_metadata_);
        std::swap(_cached_size_, other->_cached_size_);
    }

    ::google::protobuf::Metadata SegmentCommand::GetMetadata() const
    {
        protobuf_AssignDescriptorsOnce();
        ::google::protobuf::Metadata metadata;
        metadata.descriptor = SegmentCommand_descriptor_;
        metadata.reflection = SegmentCommand_reflection_;
        return metadata;
    }

#if PROTOBUF_INLINE_NOT_IN_HEADERS
    // SegmentCommand

    // optional uint32 segmentID = 1;
    void SegmentCommand::clear_segmentid()
    {
        segmentid_ = 0u;
    }
    ::google::protobuf::uint32 SegmentCommand::segmentid() const
    {
        // @@protoc_insertion_point(field_get:modes3.protobuf.SegmentCommand.segmentID)
        return segmentid_;
    }
    void SegmentCommand::set_segmentid(::google::protobuf::uint32 value)
    {

        segmentid_ = value;
        // @@protoc_insertion_point(field_set:modes3.protobuf.SegmentCommand.segmentID)
    }

    // optional .modes3.protobuf.SegmentStateValue state = 2;
    void SegmentCommand::clear_state()
    {
        state_ = 0;
    }
    ::modes3::protobuf::SegmentStateValue SegmentCommand::state() const
    {
        // @@protoc_insertion_point(field_get:modes3.protobuf.SegmentCommand.state)
        return static_cast< ::modes3::protobuf::SegmentStateValue>(state_);
    }
    void SegmentCommand::set_state(::modes3::protobuf::SegmentStateValue value)
    {

        state_ = value;
        // @@protoc_insertion_point(field_set:modes3.protobuf.SegmentCommand.state)
    }

#endif // PROTOBUF_INLINE_NOT_IN_HEADERS

    // @@protoc_insertion_point(namespace_scope)

} // namespace protobuf
} // namespace modes3

// @@protoc_insertion_point(global_scope)