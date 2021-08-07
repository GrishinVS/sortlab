package org.example.sort;

import org.example.utils.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class BubbleSort<T> implements SortAlgorithm<T> {

    @Override
    public Collection<T> sort(Collection<? extends T> collection, Comparator<T> comparator) {
        List<T> result = new ArrayList<>(collection);
        for (int i = 0; i < collection.size() - 1; i++) {
            for (int j = 1; j < (collection.size() - i); j++) {
                if (comparator.compare(result.get(j), result.get(j - 1)) < 0) {
                    CollectionUtils.swap(result, j, j - 1);
                }
            }
        }
        return result;
    }
}
