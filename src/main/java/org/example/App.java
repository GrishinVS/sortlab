package org.example;

import org.example.sort.InsertionSort;
import org.example.sort.SortLab;

import java.util.Random;

//TODO add merge sort algorithm
public class App {

    public static void main(String[] args) {
        SortLab<Integer> sortLab = new SortLab<>(100,
                new InsertionSort<>(),
                Integer::compareTo,
                () -> new Random().nextInt(10));
        sortLab.sort();
    }
}
