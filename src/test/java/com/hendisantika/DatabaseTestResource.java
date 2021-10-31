package com.hendisantika;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.PostgreSQLContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : reactive-quarkus-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/21
 * Time: 15.50
 */
public class DatabaseTestResource implements QuarkusTestResourceLifecycleManager {
    private static final PostgreSQLContainer<?> DATABASE = new PostgreSQLContainer<>("postgres:14");

    @Override
    public Map<String, String> start() {
        DATABASE.start();
        Map<String, String> map = new HashMap<>();
        map.put("quarkus.datasource.reactive.url",
                String.format("postgresql://%s:%d/%s",
                        DATABASE.getHost(),
                        DATABASE.getFirstMappedPort(),
                        DATABASE.getDatabaseName()
                )
        );
        map.put("quarkus.datasource.username", DATABASE.getUsername());
        map.put("quarkus.datasource.password", DATABASE.getPassword());
        return map;
    }

    @Override
    public void stop() {
        DATABASE.stop();
    }
}
