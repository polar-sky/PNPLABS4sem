package figures;
import java.util.*;
import figures.Point.Point;
import figures.Point.PointComparator;

public class Main {
        private Point read(Scanner sc) {
            System.out.println("Enter the coordinates of a point(x;y)");
            Float x = sc.nextFloat();
            Float y = sc.nextFloat();
            return new Point(x,y);
        }

        private void run(){
            List<Point> list = new ArrayList();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of points");
            int N = sc.nextInt();
            for (int i=0; i<N; i++){
                list.add(read(sc));
            }

            sort(list);
        }
        private void sort(List<Point> list){
            Comparator pointComparator = new PointComparator();
            Collections.sort(list, pointComparator);
            System.out.println(list);
        }
    public static void main(String[] args) {
    new Main().run();
    }
}
