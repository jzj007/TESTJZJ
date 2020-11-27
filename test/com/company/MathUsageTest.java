package com.company;

import org.junit.Test;
import org.mockito.Mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MathUsageTest {

    @Test
    public void judgment() {
        double []a0={175,174,173,172,171};
        double []b0={179,177,175,173,171};
        double []a1={171,172,173,174,175};
        double []b1={171,173,175,177,179};
        MathUsage test=new MathUsage();
        BubbleSort aBubble = mock(BubbleSort.class);
        when(aBubble.bubbleSort(a0)).thenReturn(a1);
        Heapsort bHeap = mock(Heapsort.class);
        when(bHeap.heapSort(b0)).thenReturn(b1);
        test.judgment(a0,b0,aBubble,bHeap);
        assertEquals("B",test.mean_higher);
        assertEquals("A",test.variance_lower);
    }
}