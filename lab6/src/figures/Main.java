package figures;

import com.vlsu.lab6.AbstractNode;
import com.vlsu.lab6.AddNode;
import com.vlsu.lab6.ConcNode;
import com.vlsu.lab6.SimpleNode;

public class Main {

    private static AbstractNode generateFirst() {
        return new ConcNode(
                new AddNode(new SimpleNode("aaa"),new SimpleNode("")),
                new AddNode(new SimpleNode("bbb"), new SimpleNode("ccc")));
    }
    private static AbstractNode generateSecond() {
        return new ConcNode(
                new AddNode(new SimpleNode("aaa"),new SimpleNode("bbb")),
                new AddNode(new SimpleNode("ccc"), new SimpleNode("ddd")));
    }

    public static void main(String[] args) {
	AbstractNode first = generateFirst();
	AbstractNode second = generateSecond();

        System.out.println("first:  " + first + "\tValue: " + first.calculate());
        System.out.println("second: " + second + "\tValue: " + second.calculate());

    }
}
