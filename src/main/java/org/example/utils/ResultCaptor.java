package org.example.utils;

public class ResultCaptor <T> {

    private T result;

    public T getResult() {
        return result;
    }

    protected void setResult(T result) {
        this.result = result;
    }
}
