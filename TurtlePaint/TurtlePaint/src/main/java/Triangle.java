import java.awt.*;

public class Triangle extends Shape {

    public Triangle(Turtle turtle, double location, Color color, double border) {
        super(turtle, location, color, border);
    }

    public Triangle(Turtle turtle) {
        super(turtle);
    }


    int width = 200;
    int height = 200;
    // calculate the hypotenuse (diagonal)
    // a2 + b2 = c2

    double widthSquared = Math.pow(width, 2);
    double heightSquared = Math.pow(height, 2);
    double hypotenuse = Math.sqrt(widthSquared + heightSquared);
    @Override
    public void paint() {

        this.getTurtle().setColor(Color.CYAN);
        this.getTurtle().setPenWidth(5);
        this.getTurtle().penUp();
        this.getTurtle().setHeading(90);
        this.getTurtle().goTo(-150,0);
        this.getTurtle().penDown();

        this.getTurtle().turnLeft(135);
        this.getTurtle().forward(hypotenuse);

        this.getTurtle().turnRight(90);
        this.getTurtle().forward(hypotenuse);

        this.getTurtle().turnRight(135);
        this.getTurtle().forward(400);
        this.getTurtle().penUp();
    }

    public void paint(double x, double y){

    }
}
