package com.training;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Mustafa on 5/18/2017.
 */
public class MustafaTest {

    @Test
    public void testAdd(){

        Utils utils = new Utils();
        int actual = utils.add(5,3,2,10,4,1);
        int expected = 25;
        assertEquals(actual,expected);
    }

    @Test
    public void testAddNotCoreect(){

        Utils utils = new Utils();
        int actual = utils.add(5,3,10,4,1);
        int expected = 25;
        assertEquals(actual,expected);
    }
}
