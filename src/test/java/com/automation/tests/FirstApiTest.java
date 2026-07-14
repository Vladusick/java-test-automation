package com.automation.tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class FirstApiTest {

    @Test
    void shouldGetUserList() {

        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(200);
    }
}
