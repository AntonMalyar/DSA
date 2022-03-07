import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import SortingAndSearchingAlgorithms.*;

public class SortingAndSearchingAlgorithms {
    @Test
    void bubbleSort(){
        int[] data = { -2, 45, 0, 11, -9 };
        int[] expected = {-9,-2,0,11,45};

        BubbleSort object = new BubbleSort();
        object.bubbleSort(data);
        Assertions.assertArrayEquals(expected,data);
    }
    @Test
    void selectionSort(){
        int[] data = { -2, 45, 0, 11, -9 };
        int[] expected = {-9,-2,0,11,45};

        SelectionSort object = new SelectionSort();
        object.selectionSort(data);
        Assertions.assertArrayEquals(expected,data);
    }
    @Test
    void insertionSort(){
        int[] data = { -2, 45, 0, 11, -9 };
        int[] expected = {-9,-2,0,11,45};

        InsertionSort object = new InsertionSort();
        object.insertionSort(data);
        Assertions.assertArrayEquals(expected, data);
    }

}
