package figures.Point;

public class Point implements Comparable<Point> {
    private final Float x;
    private final Float y;

    public Point (Float x, Float y){
        this.x = x;
        this.y = y;
    }

    public Float getX(){
        return x;
    }
    public Float getY(){
        return y;
    }
    public Float getManhattanDistance(Float x,Float y){
        return x+y;
    }

    @Override
    public String toString(){
        return "("+x+";"+y+")-<"+getManhattanDistance(x,y)+ '>';
    }

    @Override
    public int compareTo(Point o) {
        return 0;
    }
}
