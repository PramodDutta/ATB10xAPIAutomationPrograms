package com.thetestingacademy.ex07_DELETE_Request;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class APITesting013_DELETE_NONBddStyle {


    @Description("Verify the delete Request for the Restful Booker APIs")
    @Test
    public void test_delete_non_bdd() {

        String token = "9cc9447e730afc3";
        String bookingid = "794";


        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        requestSpecification.log().all();

        Response response = requestSpecification.when().delete();

        ValidatableResponse validatableResponse = response.then().log().all();

        // validatableResponse.statusCode(200);
        validatableResponse.statusCode(201);






    }



}


