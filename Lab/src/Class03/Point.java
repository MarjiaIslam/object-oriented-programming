package Class03;

public class Point {
    double x;
    double y;
    double z;

    public Point(double x, double y , double z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public Point(double value){
//        this(value,value,value);

        this.display();
    }

    public void display(){
        System.out.println("x :"+ x);
        System.out.println("y :"+ y);
        System.out.println("z :"+ z);
    }


    public static void main(String[] args) {
//        Point p = new Point(1.5,2.5,3.4);
        Point p2 = new Point(5.4);

    }
}

