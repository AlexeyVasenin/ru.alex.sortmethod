package ru.alex.testsort.sortshella;

import ru.alex.testsort.Swap;

import java.util.Arrays;

/**
 * Сортировка Шелла
 */
public class ShellSort {
    public static void main(String[] args) {

        Integer[] numArr = {12, 5, 7, 3, 8, 10, 33, 21};

        System.out.println(Arrays.toString(numArr));
        // Вычисляем промежуток между проверяемыи элементами
        int gap = numArr.length / 2;
        // Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < numArr.length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (numArr[c] > numArr[c + gap]) {
                        Swap.swap(numArr, c, c + gap);
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
