package com.company;

import com.vlsu.lab7.AbstractNode;
import com.vlsu.lab7.NotNode;
import com.vlsu.lab7.SimpleNode;
import com.vlsu.lab7.XORNode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AbstractNode first = new XORNode(Arrays.<AbstractNode>asList(
                new SimpleNode(true),
                new NotNode(new SimpleNode(false)),
                new NotNode(new SimpleNode(true))));

        AbstractNode second = new NotNode(
                new XORNode(Arrays.<AbstractNode>asList(new NotNode(new SimpleNode(true)),
                        new NotNode(new SimpleNode(false)))));

        System.out.println("first: " + first + "\tValue: " + first.calculate());
        System.out.println("second: " + second + "\tValue: " + second.calculate());
    }
}
