package com.codecool.binarySearch;

public class BinarySearch {
    public boolean find(int[] elements, int value) {
        int[] sortElements = bubbleSort(elements);
        int lowIndex = 0;
        int highIndex = elements.length - 1;
        boolean result = false;
        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            if (sortElements[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            } else if (sortElements[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else {
                result = true;
                lowIndex = highIndex + 1;
            }
        }
        return result;
    }

    private int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
}
