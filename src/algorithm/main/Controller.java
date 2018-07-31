package algorithm.main;

import algorithm.linkedListPackage.CustomLinkedList;
import algorithm.linkedListPackage.ListItem;
import algorithm.prog1.SimpleAlgImpl;

public class Controller
{

    public static void main(String[] args) {

        int[] array = {38,51,1,8,2,9,4,11,34,67,20};
        SimpleAlgImpl impl = new SimpleAlgImpl();

        //******************Original array display ***********************************
        for (int number:array
             ) {
            System.out.print(number + ",");
        }
        System.out.println();
        //****************** Select in Unsorted List ***********************************
        int result2 = impl.selectInUnsortedList(2, array);
        System.out.println("Select value = 2 in unsorted list: " + result2);

        //****************** Linear search in Unsorted List ***********************************
        int result = impl.linearSearch(34,array);
        System.out.println("Index of 34 with linear search: " + result);

        //****************** Bubblesort ******************************************************
        impl.bubbleSort(array);
        System.out.println("Sorting with Bubblesort: ");
        for (int number:array
                ) {
            System.out.print(number + ",");
        }

        //****************** Binary search  ******************************************************
        int binaryResult = impl.binarySearch(8, array);
        System.out.println("Binary search result: "+binaryResult);

        //****************** Binary search recursive ******************************************************
        int binaryRecResult = impl.binarySearchRecursive(8,array,0,array.length-1);
        System.out.println("Binary recursive search result: "+binaryRecResult);

        //***********************Insertion sort **********************************************
        int[] array2 = {38,51,1,8,2,9,4,11,34,67,20};

        System.out.println("Sorting with Insertion sort: ");
        impl.insertionSort(array2);
        for (int number:array
                ) {
            System.out.print(number + ",");
        }

        System.out.println();
        //**************CustomLinkedList**************************************************************
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.insert("How I met your mother");
        customLinkedList.insert("WestWorld");
        customLinkedList.insert("Misfits");
        customLinkedList.insert("Terror");
        customLinkedList.display();
        ListItem<String> sb = customLinkedList.search("WestWorld");
        if(sb != null){
            System.out.println("result of the search: " + sb.toString());
        }else{
            System.out.println("not found");
        }
        customLinkedList.delete("Misfits");
        customLinkedList.display();
    }
}
