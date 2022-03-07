package SortingAndSearchingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] array){
        if(array.length <= 1){
            return;
        }
        //
        int mainIndex = 0;
        int average = array.length/2;
        int[] left = new int[average];
        int[] right = new int[array.length-average];
        //
        for(int i = 0; i < left.length; i++){
            left[i] = array[mainIndex];
            mainIndex++;
        }
        for (int i = 0; i < right.length; i++){
            right[i] = array[mainIndex];
            mainIndex++;
        }
        //
        mergeSort(left);
        mergeSort(right);
        // sort and marge sub-array
        int l = 0; //index left array
        int r = 0; // right array
        for(int pointer = 0; pointer < array.length; pointer++){
            //right array always bigger than left
            if(r < right.length && l < left.length){
                if(left[l] > right[r]){
                    array[pointer] = right[r];
                    r++;
                }else {
                    array[pointer] = left[l];
                    l++;
                }
                continue;
            }
            //
            if(r < right.length && l >= left.length){
                array[pointer] = right[r];
                r++;
            }
            if(l < left.length && r >= right.length){
                array[pointer] = left[l];
                l++;
            }
        }
    }
}


























