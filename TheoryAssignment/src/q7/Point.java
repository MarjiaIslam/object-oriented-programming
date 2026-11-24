package q7;

import java.util.ArrayList;
import java.util.Collections;

public class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point:" + "x=" + x + " y=" + y + "\n";
    }

    @Override
    public int compareTo(Point p) {
        if((this.x+this.y)<(p.x+p.y)) return 1;
        else if ((this.x+this.y)>(p.x+p.y)) return -1;
           else return 0;
    }
}

 class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(3, 4));
        points.add(new Point(1, 2));
        points.add(new Point(5, 2));
        points.add(new Point(3, 1));

        Collections.sort(points);
        System.out.println(points);
    }
}
