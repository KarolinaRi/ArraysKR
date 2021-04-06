package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {

    //TODO: add tests for various scenarios
    @Test
    public void testExistsShouldFindExistingNumber(){
        //Given
        ArrayLogic array = new ArrayLogic();
        int[] arr = {0, 5, 7, 2};
        Array array1 = new Array(arr);

        //When
        boolean result = array.exists(array1, 5);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testExistsShouldNotFindANumber(){
        //Given
        ArrayLogic array = new ArrayLogic();
        int[] arr = {0, 5, 7, 2};
        Array array1 = new Array(arr);

        //When
        boolean result = array.exists(array1, 6);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testFindPrimeNumbersShouldFindPositivePrimeNumbers(){
        //Given
        ArrayLogic array = new ArrayLogic();
        int[] arr = {5, 9, 8, 0, 2};
        Array array1 = new Array(arr);

        //When
        Array result = array.findPrimeNumbers(array1);
        int[] resArr = result.getItems();
        Array res = new Array(resArr);

        //Then
        int [] resultArr = {5, 2};
        Array resultClass = new Array(resultArr);
        Assert.assertEquals(resultClass, res);
    }

    @Test
    public void testFindPrimeNumbersShouldNotFindPrimeNumbers(){
        //Given
        ArrayLogic array = new ArrayLogic();
        int[] arr = {6, 9, 8, 0, 4};
        Array array1 = new Array(arr);

        //When
        Array result = array.findPrimeNumbers(array1);
        int[] resArr = result.getItems();
        Array res = new Array(resArr);

        //Then
        int [] resultArr = {};
        Array resultClass = new Array(resultArr);
        Assert.assertEquals(resultClass, res);
    }

    @Test
    public void testFindMaxValueShouldFindMaxValueWhenPositiveNumbers(){
        //Given
        ArrayLogic array = new ArrayLogic();
        int[] arr = {0, 5, 7, 2};
        Array array1 = new Array(arr);

        //When
        int result = array.findMaxValue(array1);

        //Then
        Assert.assertEquals(7, result);
    }

    @Test
    public void testFindMaxValueShouldFindMaxValueWhenNegativeNumbers(){
        //Given
        ArrayLogic array = new ArrayLogic();
        int[] arr = {-6, -7, -25, -2};
        Array array1 = new Array(arr);

        //When
        int result = array.findMaxValue(array1);

        //Then
        Assert.assertEquals(-2, result);
    }

    @Test
    public void testFindMinValueShouldFindMinValueWhenPositiveNumbers(){
        //Given
        ArrayLogic array = new ArrayLogic();
        int[] arr = {0, 5, 7, 2};
        Array array1 = new Array(arr);

        //When
        int result = array.findMinValue(array1);

        //Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testFindMinValueShouldFindMinValueWhenNegativeNumbers(){
        //Given
        ArrayLogic array = new ArrayLogic();
        int[] arr = {-6, -7, -25, -2};
        Array array1 = new Array(arr);

        //When
        int result = array.findMinValue(array1);

        //Then
        Assert.assertEquals(-25, result);
    }
}
