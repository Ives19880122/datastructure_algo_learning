package com.ives.learning.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ives.learning.algo.sorting.BubbleSort;
import com.ives.learning.algo.sorting.GnomeSort;
import com.ives.learning.algo.sorting.InsertionSort;
import com.ives.learning.algo.sorting.SearchingSort;
import com.ives.learning.algo.sorting.SelectionSort;
import com.ives.learning.algo.sorting.Sorting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SortingTest {

    private int[] arr;
    private int[] expected;

    @BeforeEach
    public void setup(){
        this.arr = new int[]{1,3,5,2,-2};
        this.expected = new int[]{-2,1,2,3,5};
    }

    private void testSortFn(Sorting sorting){
        log.info("before {}: {}",sorting.getClass().getSimpleName(),arr);
        sorting.sort(arr);
        log.info("after {}: {}",sorting.getClass().getSimpleName(),arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testSearchingSort(){
        testSortFn(new SearchingSort());
    }

    @Test
    public void testSelectionSort(){
        testSortFn(new SelectionSort());
    }

    @Test
    public void testBubbleSort(){
        testSortFn(new BubbleSort());
    }

    @Test
    public void testGnomeSort(){
        testSortFn(new GnomeSort());
    }

    @Test
    public void testInsertionSort(){
        testSortFn(new InsertionSort());
    }


}
