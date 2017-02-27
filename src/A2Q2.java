
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new city
        City kw = new City();

        //create new robot in city
        Robot karel = new Robot(kw, 2, 2, Direction.EAST);

        //building hurdle race
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.EAST);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.SOUTH);
        new Wall(kw, 2, 9, Direction.SOUTH);
        new Wall(kw, 2, 9, Direction.EAST);
        new Wall(kw, 2, 10, Direction.SOUTH);
        new Wall(kw, 2, 11, Direction.SOUTH);

        //create finish line
        new Thing(kw, 2, 11);
        //create loop
        while (true) {
            //if there is a hurdle in front of karel
            if (!(karel.frontIsClear())) {
                //avoid wall- turn left
                karel.turnLeft();

                //if there is no hurdle in front of karel
            } else {
                //move forward
                karel.move();
                if (karel.frontIsClear()) {
                    //karel turn right
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }
                if(karel.canPickThing()){
                    break;
                }
            }
        } 
    }
}
