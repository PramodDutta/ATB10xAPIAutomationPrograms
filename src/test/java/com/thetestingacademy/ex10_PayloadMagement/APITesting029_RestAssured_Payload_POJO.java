package com.thetestingacademy.ex10_PayloadMagement;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;


public class APITesting029_RestAssured_Payload_POJO {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;

    //        String payload_POST = "{\n" +
//                "    \"firstname\" : \"Pramod\",\n" +
//                "    \"lastname\" : \"Dutta\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : false,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2024-01-01\",\n" +
//                "        \"checkout\" : \"2024-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Lunch\"\n" +
//                "}";


    //        Map<String,Object> jsonBodyUsingMap = new LinkedHashMap();
//        jsonBodyUsingMap.put("firstname", "Pramod");
//        jsonBodyUsingMap.put("lastname","Dutta");
//        jsonBodyUsingMap.put("totalprice",123);
//        jsonBodyUsingMap.put("depositpaid",false);
//
//        Map<String,Object> bookingDatesMap = new LinkedHashMap();
//        bookingDatesMap.put("checkin","2018-01-01");
//        bookingDatesMap.put("checkout","2019-01-01");
//
//        jsonBodyUsingMap.put("bookingdates",bookingDatesMap);
//        jsonBodyUsingMap.put("additionalneeds", "Breakfast");
//        System.out.println(jsonBodyUsingMap);


    // Map -> JSON ? ( GSON, Jackson API)
    // {firstname=Jim, lastname=brown, totalprice=123, depositpaid=true, bookingdates={checkin=2018-01-01, checkout=2019-01-01}, additionalneeds=Breakfast}
    //{"firstname" : "Jim", lastname=brown, totalprice=123, depositpaid=true, bookingdates={checkin=2018-01-01, checkout=2019-01-01}, additionalneeds=Breakfast}


    // POJO









}
