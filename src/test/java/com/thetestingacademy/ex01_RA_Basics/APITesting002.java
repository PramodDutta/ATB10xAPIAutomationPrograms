package com.thetestingacademy.ex01_RA_Basics;

public class APITesting002 {
    // NoDesignPattern

    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(String param1){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        APITesting002 np =  new APITesting002();
        np.step1();
        np.step2();
        np.step3("pramod");
    }




}
