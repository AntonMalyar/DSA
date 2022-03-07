import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import SortingAndSearchingAlgorithms.*;

import java.util.Arrays;

public class SortingAndSearchingAlgorithms {
    @Test
    void bubbleSort(){
        int[] data = { -2, 45, 0, 11, -9 };
        int[] expected = {-9,-2,0,11,45};

        BubbleSort object = new BubbleSort();
        object.bubbleSort(data);
        Assertions.assertArrayEquals(expected,data);
    }
}
