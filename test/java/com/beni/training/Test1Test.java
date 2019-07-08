package com.beni.training;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Test1Test {
    
    @Test
    public void givenInputData_whenCalc_thenResult() {
        // GIVEN
        Test1 test1 = new Test1();
        // WHENN
        List<Object> calc = test1.calc();
        // THEN
        assertEquals(calc.get(35), "fizzbuzz");
        assertEquals(calc.get(5), "buzz");
        assertEquals(calc.get(49), "fizz");
    }
}
