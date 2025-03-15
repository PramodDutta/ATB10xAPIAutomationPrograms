package com.thetestingacademy.ex08_testNGExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting017_TestNG_Groups {
    // sanity - 1
    // reg -> 3
    // p1 -> 2

    @Test(groups = {"sanity", "reg"},priority = 1)
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"p1", "reg"},priority = 2)
    public void test_regRun() {
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"p1", "reg"},priority = -1)
    public void test_smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }




}
