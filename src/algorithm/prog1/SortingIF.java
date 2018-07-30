package algorithm.prog1;

public interface SortingIF {

    void bubbleSort(int[] array);

    void quickSort(int[] array);

    static void selectionSort(int[] array){

    };

    default void insertionSort(int[] array){

        for(int i = 1; i < array.length; i++){
            int j = i-1;
            while(j >= 0 && array[j] > array[j + 1]){

                array[j] = array[j]+ array[j+1];
                array[j+1] = array[j] - array[j+1];
                array[j] = array[j] - array[j+1];
                j -= 1;
            }
        }
    };



}
