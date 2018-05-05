package com.politecnica.workshops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {

    @Test
    public void sumGreaterThanTenMustReturnSuccesfully(){
        //Given
        Operation operation = new Operation();

        //When:
        int result = operation.suma(10,20);

        //Then:
        assertEquals("La suma debe ser 30", 30, result);



    }

    @Test(expected = RuntimeException.class)
    public void sumLessThanTenMustThrowException(){
        //Given
        Operation operation = new Operation();

        //When:
        int result = operation.suma(1,3);

        //Then:
        //Must throw an exception for result less than 10


    }
}
