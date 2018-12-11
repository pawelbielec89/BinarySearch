package com.codecool.binarySearch;

public class App {
    public static void main (String [] args){
    BinarySearch bs = new BinarySearch();
    int[] elements = {1, 5, 8, 13, 17, 23 ,29 ,35};
    boolean result = bs.find(elements, 25);
        System.out.println(result);
    int[] elements2 = {1, 5, 8, 13, 17, 23, 25, 29, 35};
    result = bs.find(elements2, 25);
        System.out.println(result);
    }
}

