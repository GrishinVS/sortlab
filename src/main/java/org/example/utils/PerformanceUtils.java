package org.example.utils;

import java.util.function.Supplier;

public class PerformanceUtils {

    public static long measureExecutionTime(Procedure method) {
        long timeBefore = System.currentTimeMillis();
        method.execute();
        long timeAfter = System.currentTimeMillis();
        return (timeAfter - timeBefore);
    }

    public static <T> long measureExecutionTime(Supplier<T> method, ResultCaptor<T> resultCaptor) {
        long timeBefore = System.currentTimeMillis();
        T methodResult = method.get();
        resultCaptor.setResult(methodResult);
        long timeAfter = System.currentTimeMillis();
        return (timeAfter - timeBefore);
    }
}
