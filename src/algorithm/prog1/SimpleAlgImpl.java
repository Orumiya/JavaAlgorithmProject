package algorithm.prog1;

public class SimpleAlgImpl extends SimpleAlgorithm implements SortingIF {

    @Override
    public int selectInUnsortedList(int value, int[] array) {
        int i = 0;
        while (array[i] != value) {
            i++;
        }
        return i;
    }

    @Override
    public int binarySearch(int value, int[] array) {

        int first = 0;
        int last = array.length-1;
        int middle = (first + last)/2;
        while (last > first) {
            if (value == array[middle]) {
                return middle;
            } else {
                if (value > array[middle]) {
                    first = middle + 1;
                } else {
                    last = middle - 1;
                }
                middle = (first + last)/2;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int value, int[] array, int first, int last){
        if(last > first) {
            int middle = (first + last) / 2;
            if (value == array[middle]) {
                return middle;
            } else {
                if (value > array[middle]) {
                    //System.out.println("IN WHILE: first: " + first + "last: " + last + "middle: " + middle);
                    return binarySearchRecursive(value, array, middle + 1, last);
                } else {
                    return binarySearchRecursive(value, array, first, middle - 1);
                }
            }
        }
        return -1;
    }

    @Override
    public int linearSearch(int value, int[] array) {
        int i = 0;
        while (i < array.length && array[i] != value) {
            i++;
        }
        if (i < array.length) {
            return i;
        } else {
            return -1;
        }
    }

    @Override
    public void bubbleSort(int[] array) {

        for (int i=array.length-1; i > 0; i--){
            for(int j = 0; j< i; j++){
                if(array[j] > array[j+1]){
                    //int x = array[j];
                    array[j] = array[j]+ array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                }
            }
        }
    }

    @Override
    public void quickSort(int[] array) {

    }


}
