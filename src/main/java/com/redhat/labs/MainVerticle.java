package com.redhat.labs;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.util.UUID;

public class MainVerticle extends AbstractVerticle {

    private static final Logger LOG = LoggerFactory.getLogger(MainVerticle.class);
    private static final String uuid = UUID.randomUUID().toString();

    @Override
    public void start() {
        vertx.eventBus().publish("cluster.event", uuid);

        vertx.eventBus().consumer("cluster.event", LOG::warn);
    }

}
