package com.epam.training.array;

import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {

    //TODO: uncomment test when junit dependency is added
    @Test
    public void testSortShouldSortWhenPositiveNumbers(){
        //Given
        ArraySorter array = new ArraySorter();
        int[] arr = {5, 9, 8, 0, 2};
        Array array1 = new Array(arr);

        //When
        Array result = array.sort(array1);
        int[] resArr = result.getItems();
        Array res = new Array(resArr);

        //Then
        int [] resultArr = {0, 2, 5, 8, 9};
        Array resultClass = new Array(resultArr);
        Assert.assertEquals(resultClass, res);
    }

    //TODO: add tests for other positive and negative scenarios

    @Test
    public void testSortShouldSortWhenNegativeNumbers(){
        //Given
        ArraySorter array = new ArraySorter();
        int[] arr = {-5, -6, -3, 0, -9};
        Array array1 = new Array(arr);

        //When
        Array result = array.sort(array1);
        int[] resArr = result.getItems();
        Array res = new Array(resArr);

        //Then
        int [] resultArr = {0, -3, -5, -6, -9};
        Array resultClass = new Array(resultArr);
        Assert.assertEquals(resultClass, res);
    }
}
