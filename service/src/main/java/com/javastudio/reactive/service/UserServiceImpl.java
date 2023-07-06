package com.javastudio.reactive.service;

import com.javastudio.reactive.api.UserService;
import com.javastudio.reactive.dto.User;
import com.javastudio.reactive.entity.UserEntity;
import com.javastudio.reactive.mapper.UserMapper;
import com.javastudio.reactive.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper mapper;

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        this.userRepository = repository;
        this.mapper = mapper;
    }

    @Override
    public Mono<User> getUserById(String id) {
        return userRepository.findById(id).map(mapper::map);
    }

    @Override
    public Flux<User> getUsers() {
        return userRepository.findAll().map(mapper::map);
    }

    public Mono<User> saveUser(User user) {
        UserEntity entity = mapper.map(user);
        return userRepository.save(entity).map(mapper::map);
    }

    @Override
    public Mono<User> updateUser(String id, User user) {
        UserEntity updateUser = mapper.map(user);
        return userRepository.findById(id).flatMap(userEntity -> {
            updateUser.setId(userEntity.getId());
            return userRepository.save(updateUser).map(mapper::map);
        });
    }

    @Override
    public Mono<Void> deleteUser(String id) {
        return userRepository.deleteById(id);
    }
}
