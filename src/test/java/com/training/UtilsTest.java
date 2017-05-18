package com.training;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Opleiding on 18/05/2017.
 */
public class UtilsTest {

    @Test
    public void test() {
        Integer nb = new Integer(15);
        nb = null;
        List<Integer> numbersNew = new ArrayList<Integer>();
        numbersNew.add(5);
        numbersNew.add(null);
        int total = Utils.add(nb,4);
        Assert.assertEquals(5, total);
    }


}
