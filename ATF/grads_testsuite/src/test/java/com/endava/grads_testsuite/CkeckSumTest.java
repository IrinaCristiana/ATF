package com.endava.grads_testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.endava.grads_framework.CheckSum;

public class CkeckSumTest {
    public CheckSum checkSum;

    @Before
    public void instantiateCheckSum() {
        checkSum = new CheckSum();
    }

    @Test
    public void checkSumSuccessTest(){
        Assert.assertEquals("SUCCESS!", checkSum.checkSum(2,3,5));
    }

    @Test
    public void checkSumFailTest() {
        Assert.assertEquals("FAIL!", checkSum.checkSum(2,3,8));
    }

}


