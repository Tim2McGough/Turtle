import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(600, 600);
        Turtle turtle = new Turtle(world,-190, 000);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
       double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);

/* Cyan Triangle
        turtle.setColor(Color.CYAN);
        turtle.setPenWidth(5);

        turtle.turnLeft(45);
        turtle.forward(hypotenuse);

        turtle.turnRight(90);
        turtle.forward(hypotenuse);

        turtle.turnRight(135);
        turtle.forward(400);
*/

    Square sq = new Square(turtle);
sq.paint();
}   /*  turtle.setPenWidth(7);
        turtle.setColor(Color.black);

        turtle.turnRight(90);
        turtle.forward(200);

       // turtle.penUp();
        turtle.turnLeft(90);
        turtle.forward(200);

        turtle.turnLeft(90);
        turtle.forward(200);

        turtle.turnLeft(90);
        turtle.forward(200);
}
}     //  turtle.penDown();
        //turtle.forward(hypotenuse);

*/


}