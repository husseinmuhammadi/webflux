package com.javastudio.reactive.web.resources;

import com.javastudio.reactive.web.generated.v1.api.UsersApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.javastudio.reactive.configuration.Constants.BASE_URL;

@RestController
@RequestMapping(BASE_URL)
public class UsersResource implements UsersApi {



}
