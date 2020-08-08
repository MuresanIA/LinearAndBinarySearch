package com.company;

public class BinarySearch {

    static int countBinarySearch;

    int binarySearch(int[] array, int left, int right, int x) {

        countBinarySearch++;
        if (right >= left) {

            int middle = left + (right - left) / 2;

            if (array[middle] == x)
                return middle;

            if (x < array[middle])
                return binarySearch(array, left, middle - 1, x);

            if (x > array[middle])
                return binarySearch(array, middle + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch firstBinarySearch = new BinarySearch();

        int[] array = {2, 3, 4, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 25, 26, 27, 28};
        int number = array.length;
        int x = 22;
        long startTime = System.currentTimeMillis();
        int result = firstBinarySearch.binarySearch(array, 0, number - 1, x);
        long endTime = System.currentTimeMillis();
        System.out.println("Total duration " + (endTime - startTime));
        System.out.println("Big O Notation? " + countBinarySearch);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
