package com.thetestingacademy.ex01_RA_Basics;

public class APITesting004_BuilderPatternDesignPattern {

    public APITesting004_BuilderPatternDesignPattern step1(){
        System.out.println("Step 1");
        return this;
    }

    public APITesting004_BuilderPatternDesignPattern step2(){
        System.out.println("Step 2");
        return this;
    }

    public APITesting004_BuilderPatternDesignPattern step3(String param1){
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting004_BuilderPatternDesignPattern bp = new APITesting004_BuilderPatternDesignPattern();
        bp.step1().step2().step3("pramod");

    }




}
