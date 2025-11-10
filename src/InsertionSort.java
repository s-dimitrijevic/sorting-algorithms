public class InsertionSort <T extends Comparable<? super T>> implements Sorter<T>{

    @Override
    public void sort(T[] array){

        if(array == null) {
            throw new IllegalArgumentException("Array can not be null.");
        }

        throw new UnsupportedOperationException("Insertion sort still not implemented.");
    }
}
