package com.ives.learning.algo.sorting;

import lombok.extern.slf4j.Slf4j;

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
