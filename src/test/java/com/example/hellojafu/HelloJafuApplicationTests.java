package com.example.hellojafu;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.web.reactive.server.WebTestClient;

public class HelloJafuApplicationTests {

    private WebTestClient client = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();

    private ConfigurableApplicationContext context;

    @Before
    public void beforeAll() {
        this.context = HelloJafuApplication.app.run();
    }

    @Test
    public void testHello() throws Exception {
        this.client.get()
                .uri("/") //
                .exchange() //
                .expectStatus().isOk() //
                .expectBody(String.class).isEqualTo("Hello World!");
    }

    @After
    public void afterAll() {
        this.context.close();
    }

}
