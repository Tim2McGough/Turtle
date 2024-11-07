import java.awt.*;

public class Square extends Shape {

    public Square(Turtle turtle, double location, Color color, double border) {
        super(turtle, location, color, border);
    }

    public Square(Turtle turtle) {
        super(turtle);
    }

    @Override
    public void paint() {

        this.getTurtle().setPenWidth(7);
       this.getTurtle().setColor(Color.black);

        this.getTurtle().turnRight(90);
        this.getTurtle().forward(200);

        // turtle.penUp();
        this.getTurtle().turnLeft(90);
        this.getTurtle().forward(200);

        this.getTurtle().turnLeft(90);
        this.getTurtle().forward(200);

        this.getTurtle().turnLeft(90);
        this.getTurtle().forward(200);
    }

    public void paint(double x, double y){

    }
}
