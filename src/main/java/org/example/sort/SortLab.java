package org.example.sort;

import org.example.utils.CollectionUtils;
import org.example.utils.PerformanceUtils;
import org.example.utils.ResultCaptor;

import java.util.*;
import java.util.function.Supplier;

public class SortLab<T> {

    private final int collectionSize;
    private final SortAlgorithm<T> sortAlgorithm;
    private final Comparator<T> comparator;
    private final Supplier<T> contentSupplier;

    public SortLab(int collectionSize, SortAlgorithm<T> sortAlgorithm, Comparator<T> comparator, Supplier<T> contentSupplier) {
        this.collectionSize = collectionSize;
        this.sortAlgorithm = sortAlgorithm;
        this.comparator = comparator;
        this.contentSupplier = contentSupplier;
    }

    public void sort() {
        List<T> unsortedCollection = new ArrayList<>(collectionSize);
        CollectionUtils.fillCollection(unsortedCollection, contentSupplier, collectionSize);
        ResultCaptor<Collection<T>> resultCaptor = new ResultCaptor<>();
        long executionTime = PerformanceUtils.measureExecutionTime(() -> sortAlgorithm.sort(unsortedCollection, comparator), resultCaptor);
        showSortResult(unsortedCollection, resultCaptor.getResult(), executionTime);
    }

    private void showSortResult(Collection<T> unmodifiedCollection, Collection<T> sortedCollection, long executionTime) {
        System.out.printf("before sort: %s\n", CollectionUtils.toString(unmodifiedCollection));
        System.out.printf("after sort: %s\n", CollectionUtils.toString(sortedCollection));
        System.out.printf("execution time: %d millis%n", executionTime);
    }
}
