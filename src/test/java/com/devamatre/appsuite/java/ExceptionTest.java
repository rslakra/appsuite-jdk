package com.devamatre.appsuite.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.devamatre.appsuite.core.MathUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Rohtash Lakra
 * @created 9/16/19 11:53 AM
 */
public class ExceptionTest {

    private void throwException() {
        throw new RuntimeException("ExceptionTest-throwException");
    }


    @Test
    public void testThrowException() {
        try {
            throwException();
        } catch (RuntimeException ex) {
            assertTrue(true);
        }
    }

    /**
     *
     */
    @Test
    public void testListEvenNumbers() {
        int count = 5;
        List<Integer> evenNumbers = MathUtils.listEvenNumbers(count);
        assertEquals(count, evenNumbers.size());
    }

    @Test
    public void testFilterEvenNumbers() {
        List<Integer> validEvenNumbers = null;
        try {
            int numbers = 5;
            List<Integer> evenNumbers = MathUtils.listEvenNumbers(numbers);
            evenNumbers.add(5);
            validEvenNumbers = MathUtils.filterEvenNumbers(evenNumbers);
        } catch (RuntimeException ex) {
            assertEquals(null, validEvenNumbers);
        }
    }

}
