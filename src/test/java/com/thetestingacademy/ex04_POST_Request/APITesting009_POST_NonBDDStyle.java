package com.thetestingacademy.ex04_POST_Request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class APITesting009_POST_NonBDDStyle {


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Description("Verify the POST Req Positive : Create Token")
    @Test
    public void test_POST_NonBDDStyle_Create_Token() {
        // URL, Method, Payload/ body / headers
        // Auth?

        String payload =  "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        System.out.println(" ----    Part 1 ---- ");

        // Part 1 - Pre Condition - Preparing Request - URL, Headers, Auth...
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");

        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        System.out.println(" ----    Part 2 ---- ");

        // Making HTTP Request -> Part 2
        response = r.when().log().all().post();


        System.out.println(" ----    Part 3 ---- ");

        // Verification Part -> Part 3
        vr = response.then().log().all();
        vr.statusCode(200);








    }


}
