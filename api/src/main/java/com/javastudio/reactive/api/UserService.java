package com.javastudio.reactive.api;

import com.javastudio.reactive.dto.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> getUserById(String id);

    Flux<User> getUsers();

    Mono<User> saveUser(User user);

    Mono<User> updateUser(String id, User user);

    Mono<Void> deleteUser(String id);
}
