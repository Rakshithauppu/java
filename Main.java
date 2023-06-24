import java.util.Scanner;

class Point {
    double x;
    double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static double distance(Point p1, Point p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x coordinate of first point: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y coordinate of first point: ");
        double y1 = scanner.nextDouble();
        Point p1 = new Point(x1, y1);
        
        System.out.print("Enter x coordinate of second point: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y coordinate of second point: ");
        double y2 = scanner.nextDouble();
        Point p2 = new Point(x2, y2);
        
        double dist = Point.distance(p1, p2);
        System.out.println("Distance between p1 and p2 is " + dist);
    }
}
