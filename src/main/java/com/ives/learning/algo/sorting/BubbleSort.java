package com.ives.learning.algo.sorting;

public class BubbleSort implements Sorting{

    @Override
    public void sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
    }
    private void swap(int from, int to, int[] arr){
        int tmp = arr[from];
        arr[from] = arr[to];
        arr[to] = tmp;
    }
}
