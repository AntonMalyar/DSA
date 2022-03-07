package SortingAndSearchingAlgorithms;

// Insertion sort in Java

import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int[]array){
        // indexing first unsorted array
        for(int i = 1; i < array.length; i++){
            int pointer = array[i];
          //indexing second sorted array
            for(int k = i-1; k >= 0; k--){
                if(array[k] > pointer){
                    array[k+1] = array[k];
                    array[k] = pointer;
                }
            }
        }
    }
}