package com.ives.learning.algo.sorting;

import lombok.extern.slf4j.Slf4j;

/**
 * Insertion Sort
 * 插入排序。由左到右，逐一把數字插入到目前已排序的陣列當中。
 * 將大量數字往右挪，以騰出空間插入數字。
 * 實作雙迴圈
 * 外迴圈左至右，內迴圈右至左
 */
@Slf4j
public class InsertionSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            log.info("sort {}:{}",i,arr);
            int tmp = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if(tmp<arr[j-1]) arr[j] = arr [j-1];
                else break;
                log.info("sort {} swap {}:{}",i,j,arr);
            }
            arr[j] = tmp;
        }
    }

}
