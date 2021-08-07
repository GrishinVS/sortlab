package org.example.utils;

import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class CollectionUtils {

    private static final int MAX_SHOW_ELEMENT_SIZE = 67;

    public static <T> void fillCollection(Collection<T> collection, Supplier<T> supplier, int elementCount) {
        for (int i = 0; i < elementCount; i++) {
            collection.add(supplier.get());
        }
    }

    public static <T> String toString(Collection<? extends T> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        int elementIndex = 0;
        for (T element : collection) {
            stringBuilder.append(element.toString().concat(", "));
            if (elementIndex > MAX_SHOW_ELEMENT_SIZE) {
                stringBuilder.append("...");
                break;
            }
            elementIndex++;
        }

        return stringBuilder.toString();
    }

    public static <T> void swap(List<T> list, int firstIndex, int secondIndex) {
        T temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }
}
