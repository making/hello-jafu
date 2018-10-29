package com.example.hellojafu;

import org.springframework.boot.SpringApplication;
import org.springframework.fu.jafu.Jafu;

public class HelloJafuApplication {
    static SpringApplication app = Jafu.application(app -> {
        app.beans(beans -> beans.bean(HelloHandler.class));
        app.server(server -> server.router(router -> {
            router.add(app.ref(HelloHandler.class).routes());
        }));
    });

    public static void main(String[] args) {
        app.run(args);
    }
}
