package SortingAndSearchingAlgorithms;

public class BubbleSort {
    public void bubbleSort(int[]array){
        int size = array.length-1;
        while (size != 0){
            for (int i = 0; i < size; i++){
                if(array[i] > array[i+1]){
                    int min = array[i+1];
                    array[i+1] = array[i];
                    array[i] = min;
                }
            }
            size--;
        }
    }
}
