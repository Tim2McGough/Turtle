import java.awt.*;

public abstract class Shape {

    private Turtle turtle;
    private double location;
    private Color color;
    private double border;

    public Shape(Turtle turtle, double location, Color color, double border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }
    public Shape(Turtle turtle){
        this.turtle = turtle;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getBorder() {
        return border;
    }

    public void setBorder(double border) {
        this.border = border;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "turtle=" + turtle +
                ", location=" + location +
                ", color=" + color +
                ", border=" + border +
                '}';
    }

    //paint method that will not have an implementation
    public abstract void paint();
}
