package com.maico.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfProductTest {
    private  ArrayOfProduct arrayOfProduct;

    @BeforeEach
    void init(){
        arrayOfProduct = new ArrayOfProduct();
    }

    @Test
    void arrayOfProducts() {
        int[]  input = {5, 1, 4, 2};
        int[]  expected = {8,40,10,20};
        int[] actual = arrayOfProduct.arrayOfProducts(input);
        assertArrayEquals(expected, actual);
    }
}