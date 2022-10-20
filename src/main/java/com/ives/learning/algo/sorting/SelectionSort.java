package com.ives.learning.algo.sorting;
/**
 * SelectionSort選擇排序
 * 1. 掃描一遍所有數字，
 * 2. 找到最小值，挪至陣列左端。
 * 3. 處理尚未排序的 N-1 個數字。
 */
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
