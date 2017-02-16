
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
        while (true) {
            //if there are things
            //      pick them all up
            while (karel.canPickThing()) {
                karel.pickThing();

            //stop picking up
                    break;

        }
    }
}}