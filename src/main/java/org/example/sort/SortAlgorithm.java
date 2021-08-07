package org.example.sort;

import java.util.Collection;
import java.util.Comparator;

public interface SortAlgorithm<T> {

    Collection<T> sort(Collection<? extends T> collection, Comparator<T> comparator);

}
