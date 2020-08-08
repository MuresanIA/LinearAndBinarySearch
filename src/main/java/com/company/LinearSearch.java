package com.company;

public class LinearSearch {

    public static int search(int[] array, int x) {
        int number = array.length;
        for (int i = 0; i < number; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 10, 40, 1, 1000, 213, 23, 333, 11, 12, 32, 12, 31, 23, 12, 31, 34, 123};
        int x = 123;

        int result = search(array, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }
}


