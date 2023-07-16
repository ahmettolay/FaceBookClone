package com.ahmet.mapper;

import com.ahmet.dto.request.UserProfileSaveRequestDto;
import com.ahmet.dto.request.UserProfileUpdateRequestDto;
import com.ahmet.rabbitmq.model.CreateUserModel;
import com.ahmet.repository.entity.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IUserProfileMapper {
    IUserProfileMapper INSTANCE = Mappers.getMapper(IUserProfileMapper.class);

    UserProfile toUserProfile(final UserProfileSaveRequestDto dto);

    UserProfile toUserProfile( final UserProfileUpdateRequestDto dto);

    UserProfile toUserProfile(final CreateUserModel model);
}
