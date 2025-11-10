import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Quick Demo - Bubble sort
        Integer[] data01 = {3, 5, 2, 0, -5, 20, 25, 1};
        Sorter<Integer> bubbleSorter = new BubbleSort<>();
        bubbleSorter.sort(data01);
        System.out.println("Sorted (bubble): " + Arrays.toString(data01));

        //Quick Demo - Insertion sort

        //Quick Demo - Selection sort
        Integer[] data02 = {6, 2, -1, 35, -4, -15, 26, 3};
        Sorter<Integer> selectionSorter = new SelectionSort<>();
        selectionSorter.sort(data02);
        System.out.println("Sorted (selection): " + Arrays.toString(data02));

        //Quick Demo - Merge sort

        //Quick Demo - Quick sort
    }
}