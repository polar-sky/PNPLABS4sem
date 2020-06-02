package figures.Point;
        import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2){

        int result = o1.getManhattanDistance(o1.getX(),o1.getY()).compareTo(o2.getManhattanDistance(o2.getX(),o2.getY()));
        if (result != 0) return result;
        return o1.getManhattanDistance(o1.getX(),o1.getY()).compareTo(o2.getManhattanDistance(o2.getX(),o2.getY()));
    }
}
