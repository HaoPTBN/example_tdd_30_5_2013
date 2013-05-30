package org.qsoft.training.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 5/30/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */

public class TestMathService {

    private MathService mathService;

    @Test
    public void testWithParamNull() {
        assertEquals(0, mathService.methodAdd(null));
    }

    @Test
    public void testWithParamNotNullWithEmptyString() {
        assertEquals(0, mathService.methodAdd(""));
    }

    @Test
    public void testWithOneNumber() {
        assertEquals(1, mathService.methodAdd("1"));
    }

    @Test
    public void testWithParamTwoNumber() {
        assertEquals(3, mathService.methodAdd("1,2"));
    }

    @Test
    public void testWithParamValidator() {
        assertEquals(0, mathService.methodAdd("1,2,1,*"));
    }

}
