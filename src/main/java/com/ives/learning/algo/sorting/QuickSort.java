package com.ives.learning.algo.sorting;

import lombok.extern.slf4j.Slf4j;

/**
 * QuickSort 快速排序
 * 分治法, 選擇pivot移動至陣列邊緣
 * 把陣列分成大的一邊小的一邊,分別排序
 */
@Slf4j
public class QuickSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
    void quickSort(int[] arr, int left, int right){
        if(left>=right) return;

        int i = left;
        int j = right;
        int m = (left + right)/2;
        int pivot = arr[m];
        while(i<j){
            while(arr[i]<pivot)i++;
            while(arr[j]>pivot)j--;
            swap(i,j,arr);
            log.info("pivot{}, swap from:{},to:{}, arr:{}",pivot,i,j,arr);
            i++;
            j--;
        }
        quickSort(arr,left,j);      // 左區塊遞迴
        quickSort(arr, i, right);   // 右區塊遞迴
    }
    private void swap(int from, int to, int[] arr){
        int tmp = arr[from];
        arr[from] = arr[to];
        arr[to] = tmp;
    }
}
