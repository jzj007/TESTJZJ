package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeapsortTest {

    @Test
    public void heapSort() {
        double []a={8,7,6,5,4,3,2,1};
        double []b={1,2,3,4,5,6,7,8};
        Heapsort test=new Heapsort();
        a=test.heapSort(a).clone();
        assertArrayEquals(a,b,0);
    }
}