package com.thetestingacademy.ex08_testNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting015_BeforeTest {
        // PUT Request -
        // 1. getToken
        // 2. getBookingId
        // 3. test_PUT ( which will use the above two methods)
        // 4. closeAllThings


        @BeforeTest()
        public void getToken(){
                System.out.println("1");
        }

        @BeforeTest
        public void getBookingID(){
                System.out.println("2");
        }

        @Test
        public void test_PUT(){
                // token and BookingID
                System.out.println("3");
        }

        @AfterTest
        public void closeAllThings(){
                System.out.println("Close");
        }





}
