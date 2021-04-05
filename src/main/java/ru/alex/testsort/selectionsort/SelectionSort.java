package ru.alex.testsort.selectionsort;

import ru.alex.testsort.Swap;

import java.util.Arrays;

/**
 * Пример работы алгоритма сортировки выбором(Selection Sort)
 */
public class SelectionSort {

    public static void selectionSort() {
        
        Integer[] numArr = {12, 5, 7, 3, 8, 10, 33, 21};

        System.out.println(Arrays.toString(numArr));

        for (int left = 0; left < numArr.length; left++) {
            int minInt = left;

            for (int i = left; i < numArr.length; i++) {

                if (numArr[i] < numArr[minInt]) {
                    minInt = i;
                }
            }
            Swap.swap(numArr, left, minInt);
        }
        System.out.println(Arrays.toString(numArr));
    }
}
