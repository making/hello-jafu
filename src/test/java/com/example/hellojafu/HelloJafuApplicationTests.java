package com.example.hellojafu;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.web.reactive.server.WebTestClient;

public class HelloJafuApplicationTests {

    private WebTestClient client = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();

    private ConfigurableApplicationContext context;

    @BeforeAll
    public void beforeAll() {
        context = HelloJafuApplication.app.run();
    }

    @Test
    public void requestRootEndpoint() {
        client.get().uri("/").exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody(String.class).isEqualTo("Hello World!");
    }

    @AfterAll
    void afterAll() {
        context.close();
    }

}
