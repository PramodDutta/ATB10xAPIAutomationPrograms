package com.thetestingacademy.ex02_RA_TestNG_AllureReport;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting005_TC_TestNG_Fix {

    @Test
    @Description("TC#1 - Verify that the Valid Pincode gives 200 Ok")
    public void test_GET_Positive_TC1(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110048")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }

    @Test
    @Description("TC#2 - Verify that the Invalid Pincode gives error")
    public void test_GET_Negative_TC2(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+"-1")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }

    @Test
    @Description("TC#3 - Verify that the InValid Pincode gives 200 Ok")
    public void test_GET_Negative_TC3(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+"$")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }



}
