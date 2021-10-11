package com.hendisantika;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by IntelliJ IDEA.
 * Project : reactive-quarkus-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/10/21
 * Time: 15.52
 */
@QuarkusTest
@QuarkusTestResource(DatabaseTestResource.class)
public class AccountResourceTest {
    @Test
    public void get() {
        given()
                .when().get("/api/accounts")
                .then()
                .statusCode(200);
    }
}
