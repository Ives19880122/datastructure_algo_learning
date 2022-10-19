package com.ives.learning.algo.sorting;

public class SearchingSort implements Sorting{
    @Override
    public void sort(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] tmp = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
            tmp[i] = arr[i];
        }
        for ( int n = min; n<=max; n++){
            for(int i=0; i<tmp.length; i++)
                if(tmp[i]==n){
                    arr[idx] = tmp[i];
                    idx++;
                }
        }
    }
}
