package shapes;

public abstract class Shape {
    private String color;
    private boolean filled;
//constractor
public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

public String getColor() { return color; }
public boolean isFilled() { return filled; }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
public String toString() {
        return "Color : " + color + "\n" +
               "Filled: " + (filled ? "Yes" : "No");
    }
}
