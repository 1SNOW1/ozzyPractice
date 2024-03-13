package com.cydeo;

public class ArraySorting { //QuickSort, BubbleSort

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();

        as.sort(quickSort);
        as.sort(bubbleSort);

        Sorting quickSort1 = () -> System.out.println("Quick Sorting");
        as.sort(quickSort1);
    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
