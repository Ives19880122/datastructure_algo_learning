package com.ives.learning.algo.sorting;

/**
 * 氣泡排序法:
 * 外圈迴圈逐步向右
 * 遇到大小順序不符合的交換
 * 時間複雜度O(N^2) 空間複雜度O(1)
 */
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
