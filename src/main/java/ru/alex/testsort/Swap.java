package ru.alex.testsort;

public class Swap {

    public static void swap(Integer[] array, int int1, int int2) {
        Integer tmp = array[int1];
        array[int1] = array[int2];

        array[int2] = tmp;
        System.out.println("test branch");
    }

}

