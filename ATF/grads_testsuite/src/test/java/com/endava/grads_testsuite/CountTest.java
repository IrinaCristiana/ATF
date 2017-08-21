package com.endava.grads_testsuite;

import com.endava.grads_framework.Count;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountTest {
    public Count count;

    @Before
    public void instantiateCount() {
        count = new Count();
    }

    @Test
    public void countTest(){
        Assert.assertNotNull(count);
    }
}
