package ru.alex.testsort.shuttlesort;

import ru.alex.testsort.Swap;

import java.util.Arrays;

public class ShuttleSort {
    public static void main(String[] args) {

        Integer[] numArr = {12, 5, 7, 3, 8, 10, 33, 21};

        System.out.println(Arrays.toString(numArr));

        for (int i = 1; i < numArr.length; i++) {

            if (numArr[i] < numArr[i - 1]) {

                Swap.swap(numArr, i, i - 1);

                for (int z = i - 1; (z - 1) >= 0; z--) {

                    if (numArr[z] < numArr[z - 1]) {
                        Swap.swap(numArr, z, z - 1);
                    } else break;
                }
            }
        }
        System.out.println(Arrays.toString(numArr));
    }
}
