package com.ives.learning.algo.sorting;

/**
 * MergeSort
 * 1. 把陣列切成左右兩個
 * 2. 遞迴切到最小
 * 3. 進行合併排序
 */
public class MergeSort implements Sorting{

    @Override
    public void sort(int[] arr) {
        int [] result = mergeSort(arr);
        for (int i = 0; i < result.length; i++) {
            arr[i] = result[i];
        }
    }
    private int[] mergeSort(int[] arr){
        if(arr.length<=1) return arr;
        int m = arr.length / 2;
        int[] left = new int[m];
        for (int i = 0; i < m; i++) {
            left[i] = arr[i];
        }
        int[] right = new int[arr.length-m];
        for (int i = m; i < arr.length; i++) {
            right[i-m] = arr[i];
        }
        right = mergeSort(right);
        left = mergeSort(left);
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int l = 0;
        int r = 0;
        int[] result = new int[left.length+right.length];
        int idx = 0;
        while(true){
            if(l<left.length && r<right.length){
                if(left[l]>right[r]){
                    result[idx++] = right[r++];
                }else if(left[l]<right[r]){
                    result[idx++] = left[l++];
                }else{
                    result[idx++] = left[l++];
                    result[idx++] = right[r++];
                }
            }else if(l<left.length){
                result[idx++] = left[l++];
            }else if(r<right.length){
                result[idx++] = right[r++];
            }else {
                break;
            }
        }
        return result;
    }

}
