package SortingAndSearchingAlgorithms;

public class SelectionSort {
    public void selectionSort(int[]array) {
        for(int i = 0; i < array.length-1; i++){
            for (int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    int min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }
            }
        }
    }
}
