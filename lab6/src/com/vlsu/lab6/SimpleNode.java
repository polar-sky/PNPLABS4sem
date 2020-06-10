package com.vlsu.lab6;

public class SimpleNode implements AbstractNode {
    private final String value;

    public SimpleNode(String value) {
        this.value = value;
    }

    @Override
    public String calculate() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
