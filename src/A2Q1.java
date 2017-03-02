
import becker.robots.City;
import becker.robots.Robot;
import becker.robots.Direction;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city
        City kw = new City();

        //create new robot in city
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);

        //Create path of things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);

        //initial move forward
        karel.move();

        //loop
        // if there are things
        //      pick them all up
        while (karel.canPickThing()) {
            karel.pickThing();
            // if holding 1 thing, move
            if (karel.countThingsInBackpack() == 1) {
                // move
                karel.move();
                // if holding 2 things, move forward
            }
            if (karel.countThingsInBackpack() == 2) {
                // move
                karel.move();
                // if holding 3 things, move forward 
            }
            if (karel.countThingsInBackpack() == 3) {
                // move
                karel.move();
                // if holding 4 things, move forward
            }
            if (karel.countThingsInBackpack() == 4) {
                //move
                karel.move();
                //if holding 5 things, move forward
            }
            if (karel.countThingsInBackpack() == 5) {
                //move
                karel.move();
                //if holding 6 things, move forward
            }
            if (karel.countThingsInBackpack() == 6) {
                //move
                karel.move();
                break;
            }
        }
        //karel move forward until end of path
        karel.move();
        karel.move();
        karel.move();
    }
}
