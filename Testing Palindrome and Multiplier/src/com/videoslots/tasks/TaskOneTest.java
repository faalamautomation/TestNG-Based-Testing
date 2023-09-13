package com.videoslots.tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskOneTest {

    @Test
    public void test1TaskOne() {
        double[] inputArray = {-00,1,2,4,8,6,12,24,32,-32,-3,-44,0.4,0.666};

        double[] expectedArray = {4.0, 8.0, 6.0, 12.0, 24.0, 32.0, -32.0, -44.0};
        double[] actualArray = TaskOne.Multiplier(inputArray);

        Assert.assertEquals(actualArray,expectedArray);
    }
    
    @Test
    public void test2TaskOne() {
        double[] inputArray = {22,65,88,63,132,40};

        double[] expectedArray = {88.0, 132.0, 40.0};
        double[] actualArray = TaskOne.Multiplier(inputArray);

        Assert.assertEquals(actualArray, expectedArray);
    }
    
    @Test
    public void test3TaskOne() {
        double[] inputArray = {0,-1,-2,-3};

        double[] expectedArray = {};
        double[] actualArray = TaskOne.Multiplier(inputArray);

        Assert.assertEquals(actualArray, expectedArray);
    }
    
    @Test
    public void test4TaskOne() {
        double[] inputArray = {0, 0.5,0.444,-9};

        double[] expectedArray = {};
        double[] actualArray = TaskOne.Multiplier(inputArray);

        Assert.assertEquals(actualArray, expectedArray);
    }
    
    @Test
    public void test5TaskOne() {
        double[] inputArray = {-60,-70,-80,-66,-8,-48};

        double[] expectedArray = {-60.0, -80.0, -66.0, -8.0, -48.0};
        double[] actualArray = TaskOne.Multiplier(inputArray);

        Assert.assertEquals(actualArray, expectedArray);
    }
}
