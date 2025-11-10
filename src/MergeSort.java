public class MergeSort <T extends Comparable<? super T>> implements Sorter<T>{

    @Override
    public void sort(T[] array){

        if(array == null) {
            throw new IllegalArgumentException("Array can not be null.");
        }

        throw new UnsupportedOperationException("Merge sort still not implemented.");
    }
}
