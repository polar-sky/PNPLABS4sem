package com.vlsu.lab6;

public class AddNode implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;

    public AddNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String calculate() {
        return left.calculate().concat(right.calculate());
    }

    @Override
    public String toString() {
        return "(" + left + ")" + "*" + "("+ right + ")";
    }
}
