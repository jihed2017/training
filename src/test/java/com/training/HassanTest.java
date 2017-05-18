package com.training;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hassan on 18/05/2017.
 */
public class HassanTest {
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
