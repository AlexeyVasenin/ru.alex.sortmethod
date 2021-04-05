package ru.alex.testsort.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertion() {

        Integer[] numArr = {10, 12, 17, 1, 7, 11, 20, 3, 15, 9, 8};

        System.out.println(Arrays.toString(numArr));

        for (int left = 0; left < numArr.length; left++) {
            // Берем занчение элемента
            Integer value = numArr[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            Integer i = left - 1;

            for (; i >= 0; i--) {
                // Если значение взятого элемента меньше - передвигаем больший дальше
                if (value < numArr[i]) {
                    numArr[i + 1] = numArr[i];
                    // Если взятый элемент больше - останвливаем
                } else break;
            }
            // В освободившееся место вставляем вытащенный элемент
            numArr[i + 1] = value;
        }
        System.out.println(Arrays.toString(numArr));
    }

}
