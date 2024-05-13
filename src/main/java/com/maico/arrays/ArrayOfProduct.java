package com.maico.arrays;

import java.util.Arrays;

public class ArrayOfProduct {

    public int[] arrayOfProducts(int[] array) {
        int[]  reuslt = new int[array.length];
        int[]  productOfLeft = new int[array.length];
        int[]  productOfRight = new int[array.length];
        Arrays.fill(reuslt, 1);
        Arrays.fill(productOfLeft, 1);
        Arrays.fill(productOfRight, 1);

        for(int  i  = 1; i < array.length; i++){
            productOfLeft[i] = productOfLeft[i-1] * array[i-1];
        }

        for(int i  = array.length - 2; i >= 0; i--){
            productOfRight[i] = productOfRight[i + 1] * array[  i + 1];
        }

        for(int i=0; i < reuslt.length; i++){
            reuslt[i] = productOfLeft[i] * productOfRight[i];
        }




        return reuslt;
    }
}
