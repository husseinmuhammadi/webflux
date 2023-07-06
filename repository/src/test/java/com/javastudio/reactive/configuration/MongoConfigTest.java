package com.javastudio.reactive.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static org.junit.jupiter.api.Assertions.*;

class MongoConfigTest {

    @Test
    public void givenConnectionUri_whenAlsoIncludingIndividualParameters_thenInvalidConfig() {
        /*
        System.setProperty(
                "spring.data.mongodb.uri",
                "mongodb://" + USER + ":" + PASS + "@" + HOST + ":" + PORT + "/" + DB
        );

        SpringApplicationBuilder app = new SpringApplicationBuilder(SpringMongoConnectionViaPropertiesApp.class)
                .properties(
                        "spring.data.mongodb.host=" + HOST,
                        "spring.data.mongodb.port=" + PORT,
                        "spring.data.mongodb.username=" + USER,
                        "spring.data.mongodb.password=" + PASS
                );

        BeanCreationException e = assertThrows(BeanCreationException.class, () -> {
            app.run();
        });

        Throwable rootCause = e.getRootCause();
        assertTrue(rootCause instanceof IllegalStateException);
        assertThat(rootCause.getMessage()
                .contains("Invalid mongo configuration, either uri or host/port/credentials/replicaSet must be specified"));
         */
    }
}