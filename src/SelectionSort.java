public class SelectionSort <T extends Comparable<? super T>> implements Sorter<T>{

    @Override
    public void sort(T[] array) {

        if(array == null) {
            throw new IllegalArgumentException("Array can not be null.");
        }

        for(int i = 0; i < array.length-1; i++){

            int minIndex = i;

            for(int j = i+1; j < array.length; j++){

                if(array[j].compareTo(array[minIndex]) < 0)
                    minIndex = j;
            }

            if(minIndex != i){
                T temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
