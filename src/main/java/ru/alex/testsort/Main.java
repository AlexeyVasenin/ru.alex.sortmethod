package ru.alex.testsort;

import ru.alex.testsort.bubble.BubbleSort;
import ru.alex.testsort.insertionsort.InsertionSort;
import ru.alex.testsort.mergesort.MergeSort;
import ru.alex.testsort.selectionsort.SelectionSort;
import ru.alex.testsort.shuttlesort.ShuttleSort;
import ru.alex.testsort.sortshella.ShellSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ведите название метода сортировки");
        System.out.println("bubble(Метод пузырьков)" + "\n" + "selection" +
                "(сортировка выбором)" +
                "\n" + "insertion(сортировка вставкой)" + "\n" + "shuttle" +
                "(челночная сортировка)" +
                "\n" + "shell(сортировка Шелла)" + "\n" + "merge(сортировка " +
                "объединением)");
        String start = bufferedReader.readLine().toLowerCase();

        switch (start) {
            case "bubble":

                BubbleSort.bubbleSort();
                break;

            case "selection":
                SelectionSort.selectionSort();
                break;

            case "insertion":
                InsertionSort.insertion();
                break;

            case "shuttle":
                ShuttleSort.shuttleSort();
                break;

            case "shell":
                ShellSort.shellSort();
                break;

            case "merge":
                MergeSort.mergeStart();
                break;

            default:
                break;
        }
    }
}

