package com.vlsu.lab6;

public class ConcNode implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;

    public ConcNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String calculate() {
        return right.calculate().concat(left.calculate());
    }

    @Override
    public String toString() {
        return "(" + left + ")" + "*" + "("+ right + ")";
    }

}
