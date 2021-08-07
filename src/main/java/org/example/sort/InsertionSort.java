package org.example.sort;

import org.example.utils.CollectionUtils;

import java.util.*;

public class InsertionSort<T> implements SortAlgorithm<T> {

    @Override
    public Collection<T> sort(Collection<? extends T> collection, Comparator<T> comparator) {
        List<T> result = new ArrayList<>(collection);
        for (int i = 1; i < collection.size(); i++) {
            if (comparator.compare(result.get(i - 1), result.get(i)) > 0) {
                int index = i;
                while ((index > 0) && (comparator.compare(result.get(index), result.get(index - 1)) < 0)) {
                    CollectionUtils.swap(result, index, index - 1);
                    index--;
                }
            }
        }
        return result;
    }
}
