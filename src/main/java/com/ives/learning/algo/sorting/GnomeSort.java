package com.ives.learning.algo.sorting;

import lombok.extern.slf4j.Slf4j;

/**
 * 地精排序:
 * 氣泡排序強化版
 * 特色只有一個迴圈
 * 1. 遇到排序正常則往右++
 * 2. 遇到排序交換則在交換後--
 */
@Slf4j
public class GnomeSort implements Sorting{
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length;) {
            log.info("arr{}:{}",i,arr);
            if(i == 0 || arr[i-1]<arr[i]) i++;
            else {
                swap(i,i-1,arr);
                i--;
            }
        }
    }
    private void swap(int from, int to, int[] arr){
        int tmp = arr[from];
        arr[from] = arr[to];
        arr[to] = tmp;
    }

}
