package com.ives.learning.algo.sorting;

public class SelectionSort implements Sorting{
    @Override
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min_idx])
                    min_idx = j;
            }
            swap(i,min_idx,arr);
        }
    }
    private void swap(int from, int to, int[] arr){
        int tmp = arr[from];
        arr[from] = arr[to];
        arr[to] = tmp;
    }
}
