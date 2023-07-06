package com.javastudio.reactive.mapper;

import com.javastudio.reactive.dto.User;
import com.javastudio.reactive.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserEntity map(User user);

    User map(UserEntity userEntity);
}
