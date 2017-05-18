package com.training;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Opleiding on 18/05/2017.
 */
public class UtilsTest {

    @Test
    public void test(){
        System.out.println("this is a test");
    }

    @Test
    public void hassanTest(){
        Assert.assertSame("successful", 10 , Utils.add(5,5));
    }

    @Test
    public void hassanSecondTest(){
        Assert.assertSame(15,Utils.add(3,3,3,3,3));
       // Assert.assertNotSame(10,Utils.add(5,5));
    }
}
