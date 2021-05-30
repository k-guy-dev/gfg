package gfgPractice.arraysMedium;

import java.util.*;

// Given an array of n elements, where each element is at most
//  k away from its target position, devise an algorithm that sorts in O(n log k) 
//  time. For example, let us consider k is 2, an element at index 7 in the sorted 
//  array, can be at indexes 5, 6, 7, 8, 9 in the given array.
class nearlySortedArray {

    // Insertion sort can be used here also
    // Below is the heap implementation
    // Form a heap array of size k+1 and add first k+1 elements to it
    // One by one remove the smallest element from the k-wala array
    // and add it to the result array, also simultaneously keep adding
    // new elements from the main array to the k-wala array

    static void heapSort(int[] arr, int n, int k) {

        // min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.peek();
            pq.poll();
            pq.add(arr[i]);
        }

        Iterator<Integer> itr = pq.iterator();
        while (itr.hasNext()) {
            arr[index++] = pq.peek();
            pq.poll();
        }
    }

    public static void main(String[] args) {

    }
}