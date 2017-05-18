package com.training;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mschneider on 18-05-17.
 */
public class MikeTest {
    @Test
        public void testAddTwoPositif(){
            boolean expResult = true;
            boolean actualResult = false;
            int numberOne = 5;
            int numberTwo = 7;
            if(Utils.add(numberOne,numberTwo)== 12) {
                actualResult = true;
            }
            assertEquals("Addition with 2 positif not right",expResult,actualResult);
    }
    @Test
    public void testAddTwoNegatif(){
        boolean expResult = true;
        boolean actualResult = false;
        int numberOne = -5;
        int numberTwo = -7;
        if(Utils.add(numberOne,numberTwo)== 12) {
            actualResult = true;
        }
        assertEquals("Addition with 2 negatif not right",expResult,actualResult);
    }
    @Test
    public void testAddOnePositifOneNegatif(){
        boolean expResult = true;
        boolean actualResult = false;
        int numberOne = -5;
        int numberTwo = 7;
        if(Utils.add(numberOne,numberTwo)== 2) {
            actualResult = true;
        }
        assertEquals("Addition with 1 positif and 1 negatif not right",expResult,actualResult);
    }
    @Test
    public void testAddOneZeroOnePositif(){
        boolean expResult = true;
        boolean actualResult = false;
        int numberOne = 0;
        int numberTwo = 7;
        if(Utils.add(numberOne,numberTwo)== 7) {
            actualResult = true;
        }
        assertEquals("Addition with 1 zero and 1 positif not right",expResult,actualResult);
    }
}
