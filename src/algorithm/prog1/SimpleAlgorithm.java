package algorithm.prog1;

public abstract class SimpleAlgorithm {

    //searches for the element in an unsorted list and returns its index (value is in the list)
    public abstract int selectInUnsortedList(int value, int[] array);

    //searches for the element in an unsorted list and returns its index (value can be in the list)
    abstract int linearSearch(int value, int[] array);

    //searches for the element in a sorted list and returns its index (value can be in the list)
    protected abstract int binarySearch(int value, int[] array);

}
