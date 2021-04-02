package ru.alex.testsort.bubble;

import ru.alex.testsort.Swap;

import java.util.Arrays;


/**
 * Пример алгоритма сортировки методом пузырьков(Bubble Sort)
 */
public class BubbleSort {


    public static void main(String[] args) {

        Integer[] numArr = {12, 10, 5, 1, 6, 8, 4, 7};

        long startTime = System.currentTimeMillis();

        System.out.println(Arrays.toString(numArr));

        Boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < numArr.length; i++) {
                if (numArr[i] < numArr[i - 1]) {
                    Swap.swap(numArr, i, i - 1);
                    needIteration = true;
                }
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println(Arrays.toString(numArr));
        System.out.println((endTime - startTime));
    }
}
