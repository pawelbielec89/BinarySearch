package com.codecool.binarySearch;

public class BinarySearch {
    public boolean find(int[] elements, int value) {
        int lowIndex = 0;
        int highIndex = elements.length - 1;
        boolean result = false;
        while (lowIndex<=highIndex){
            int middleIndex = (lowIndex + highIndex) / 2;
            if (elements[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            } else if(elements[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else {
                result = true;
                lowIndex = highIndex + 1;
            }
        }
        return result;
    }
}
