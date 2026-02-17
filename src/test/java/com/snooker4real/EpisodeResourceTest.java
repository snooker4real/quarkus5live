package com.snooker4real;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class EpisodeResourceTest {
    @Test
    void testEpisodesEndpoint() {
        given()
          .when().get("/episodes")
          .then()
             .statusCode(200)
             .body("size()", is(3))
             .body("[0].title", is("e1"))
             .body("[1].title", is("e2"))
             .body("[2].title", is("e3"));
    }

}