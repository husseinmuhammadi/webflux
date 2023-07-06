package com.javastudio.reactive.repository;

import com.javastudio.reactive.entity.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<UserEntity, String> {

}
