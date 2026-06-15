package shapes;

import java.util.Scanner;
import java.util.ArrayList;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        while (sc.hasNext()) {
            String type = sc.next();
            if (type.equalsIgnoreCase("RECTANGLE")) {
                String color   = sc.next();
                boolean filled = sc.nextBoolean();
                double width   = sc.nextDouble();
                double length  = sc.nextDouble();
                shapes.add(new Rectangle(color, filled, width, length));
            } else if (type.equalsIgnoreCase("CIRCLE")) {
                String color   = sc.next();
                boolean filled = sc.nextBoolean();
                double radius  = sc.nextDouble();
                shapes.add(new Circle(color, filled, radius));
            }
        }

        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println();
        }

        System.out.println("--- Downcast Check ---");
        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle width=" + r.getWidth()
                                 + " length=" + r.getLength());
            } else if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle radius=" + c.getRadius());
            }
        }
        sc.close();
    }
}