import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle yurtle = new Turtle(turtleWorld);
        Turtle surtle = new Turtle(turtleWorld);
        Turtle murtle = new Turtle(turtleWorld);
        surtle.setPenColor(Color.GREEN);
        turtle.setPenColor(Color.ORANGE);
        murtle.setPenColor(Color.RED);
        yurtle.setPenColor(Color.BLUE);
        yurtle.penDown();
        murtle.penDown();
        surtle.penDown();
        turtle.penDown();
        int count = 0;
        int county =0;
       while (county < 10){
        surtle.forward(60);
        murtle.backward(60);
        surtle.turnLeft();
        surtle.forward(20);
        murtle.turnRight();
        murtle.backward(20);
        surtle.backward(60);
        murtle.forward(60);
        murtle.turnLeft();
        murtle.forward(60);
        surtle.turnRight();
        surtle.backward(60);
        surtle.turnRight();
        surtle.backward(160);
        murtle.turnLeft();
        murtle.backward(160);
        surtle.turnLeft();
        murtle.turnRight();
        surtle.backward(60);
        murtle.forward(60);
        surtle.turnLeft();
        murtle.turnRight();
        surtle.backward(80);
        murtle.backward(80);
        murtle.forward(70);
        surtle.forward(70);
       
        county+=1;}
        while (count < 10){
        yurtle.backward(60);
        turtle.forward(60);
        yurtle.turnLeft();
        yurtle.forward(20);
        turtle.turnRight();
        turtle.forward(20);
        yurtle.forward(60);
        turtle.forward(60);
        turtle.turnLeft();
        turtle.forward(60);
        yurtle.turnRight();
        yurtle.backward(60);
        yurtle.turnRight();
        yurtle.forward(160);
        turtle.turnLeft();
        turtle.forward(160);
        yurtle.turnLeft();
        turtle.turnRight();
        yurtle.forward(60);
        turtle.backward(60);
        yurtle.turnLeft();
        turtle.turnRight();
        yurtle.forward(80);
        turtle.forward(80);
        
       
        count +=1;
        

    }
    }
}
