package com.epam.training.array;

public class ArrayLogic {

    //TODO: write it using binary search
    public boolean exists(Array array, int element) {
        ArraySorter sorted = new ArraySorter();
        array = sorted.sort(array);
        int[] temp =  array.getItems();

        int last = temp.length - 1;
        int first = 0;
        int middle = (first + last) / 2;

        boolean result = false;
        while(first <= last){
            if(temp[middle] < element){
                first = middle + 1;
            }
            else if(temp[middle] == element){
                result = true;
                //return true;
            }
            else{
                last = middle - 1;
            }
            middle = (first + last) / 2;
            if(first > last){
                result = false;
                //return false;
            }
        }
        return result;
        //throw new UnsupportedOperationException();
    }

    public Array findPrimeNumbers(Array array) {
        int n = array.getArrayLength();
        int[] primeNumbers = new int[n];

        int[] arr = array.getItems();
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for(int j = 2; j < arr[i]; j++){
                if(arr[i] % j == 0){
                    isPrime = false;
                    n--;
                    break;
                }
            }
            if(isPrime){
                for(int j = 0; j < n; j++){
                    primeNumbers[j] = arr[i];
                }
            }
        }
        return new Array(primeNumbers);
    }
    
   //TODO: add other methods here

    public int findMaxValue(Array array){
        int[] arr = array.getItems();
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public int findMinValue(Array array){
        int[] arr = array.getItems();
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
