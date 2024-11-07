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
        this.getTurtle().penUp();
        this.getTurtle().goTo(-150,0);
        this.getTurtle().setHeading(90);
        this.getTurtle().penDown();

        this.getTurtle().turnRight(180);
        this.getTurtle().forward(200);

        // turtle.penUp();
        this.getTurtle().turnRight(90);
        this.getTurtle().forward(200);

        this.getTurtle().turnRight(90);
        this.getTurtle().forward(200);

        this.getTurtle().turnRight(90);
        this.getTurtle().forward(200);
        this.getTurtle().penUp();
    }

    public void paint(double x, double y){

    }
}
