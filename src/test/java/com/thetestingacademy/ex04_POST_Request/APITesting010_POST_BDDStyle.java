package com.thetestingacademy.ex04_POST_Request;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import io.qameta.allure.Description;


public class APITesting010_POST_BDDStyle {

    @Description("Verify the POST Req Positive")
    @Test
    public void test_POST_BDDStyle() {

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);


    }
}
