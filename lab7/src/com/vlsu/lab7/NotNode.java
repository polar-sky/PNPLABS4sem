package com.vlsu.lab7;

public class NotNode implements AbstractNode {
    private final AbstractNode list;

    public NotNode(AbstractNode list) {
        this.list = list;
    }

    @Override
    public boolean calculate() {
        return !(list.calculate());
    }

    @Override
    public String toString() {
        return "!(" + list + ")";
    }
}
