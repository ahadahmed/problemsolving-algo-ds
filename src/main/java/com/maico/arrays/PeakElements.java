package com.maico.arrays;

import java.util.Arrays;

/**
 * @author ahadahmed - 13/11/20
 * @see <a href="#"> see this</a>
 */
public class PeakElements {

    //min peak
    public static void main(String[] args) {
//            int[] input = {1,5,2,8,3,7,4};//5
//        int[] mulpeak1 = {1,2,8,3,7,4};//7
//        int[] mulpeak2 = {1,2,8,3,4};//4
//        int[] mulpeak3 = {1,2,3,8};//8
//        int[] mulpeak4 = {1,2,3};//3
//        int[] mulpeak5 = {1,2};//2
//        int[] mulpeak6 = {1};//1
//          int[] input = {3,1,4,2};

        int[] input = {1,7,3,4,2}; // 4
//        int[] input1 = {1,3,7,2};// 7
//        int[] input2 = {1,3,2};// 3
//        int[] input3 = {1,2};// 2
//        int[] input4 = {1};// 1
//        System.out.println(Arrays.toString(peakElements(input2)));
        int[] resultArray = new int[input.length];
        int j = input.length;
        for(int i=0; i<resultArray.length; i++){
            int meanIndex = findMeanPeakIndex(input, j);
            resultArray[i] = input[meanIndex];
            shiftArrayElement(input, meanIndex);
            j--;
        }
        System.out.println(Arrays.toString(resultArray));
    }


    public static int[] peakElements(int[] a){
//        int[] resultArray = new int[a.length];
        int peak = findPeak(a,0, a.length - 1, a.length);
        System.out.println(peak);
        return a;
    }


    public static int findPeak(int[] arr, int low, int high, int arrayLength){

        int mid = low + (high - low)/2;

        if((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arrayLength -1 || arr[mid +1] <= arr[mid])){
            return arr[mid];
        }else if(mid > 0 && arr[mid - 1] > arr[mid]){

            return findPeak(arr, low, mid - 1, arrayLength);

        }else {
            return findPeak(arr, mid + 1, high, arrayLength);
        }
    }

    public static int findMeanPeakIndex(int[] array, int j){

        int length = j;

        int meanPeakIndex = -1;
        int meanPeak = Integer.MAX_VALUE;

        if(length==1){
            return 0;
        }

/*
        if(length == 2){
            return array[0] > array[1] ? 0 : 1;
        }
*/

        for (int i = 0; i < j; i++) {
            if (i == 0) {
                if (array[i] >= array[i + 1]) {
                    meanPeakIndex = i;
                    meanPeak = array[i];
                }
            } else if (i == j - 1) {
                if (array[i] >= array[i - 1] && array[i] < meanPeak) {
                    meanPeakIndex = i;
                    meanPeak = array[i];
                }
            } else if ((array[i] >= array[i - 1]) && (array[i] >= array[i + 1])) {

                if (array[i] < meanPeak) {
                    meanPeakIndex = i;
                    meanPeak = array[i];
                }
            }
        }

        /*if(meanPeakIndex == -1){
            meanPeakIndex = j-1;
        }*/


        return meanPeakIndex;
    }

    public static void shiftArrayElement(int[] a, int startIndex){

        for(int i=startIndex; i<a.length - 1; i++){
            a[i] = a[i+1];
        }
    }
}
