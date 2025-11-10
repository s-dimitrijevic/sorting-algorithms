// test/SorterContractTest.java
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

public class SorterContractTest {

    private List<Sorter<Integer>> sorterList = List.of(

              new BubbleSort<>(),
              new SelectionSort<>()
//            new InsertionSort<>(), not implemented
//            new QuickSort<>(), not implemented
//            new MergeSort<>() not implemented

    );

    @Test void sortsCommonCases() {

        List<Integer[]> cases = List.of(

                new Integer[] {},
                new Integer[] {1},
                new Integer[] {2,1},
                new Integer[] {1,1,1,1},
                new Integer[] {3,5,2,0,-5,20,25,1},
                new Integer[] {1,2,3,4,5},
                new Integer[] {5,4,3,2,1}
        );

        for (Sorter<Integer> s : sorterList) {

            for (Integer[] original : cases) {

                Integer[] a = Arrays.copyOf(original, original.length);
                Integer[] expected = Arrays.copyOf(original, original.length);

                Arrays.sort(expected);
                s.sort(a);

                assertArrayEquals(expected, a, s.getClass().getSimpleName());
            }
        }
    }
}
