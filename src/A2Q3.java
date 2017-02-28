
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simon7323
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new city
        City kw = new City();

        //create new robot in city
        Robot karel = new Robot(kw, 2, 2, Direction.EAST);

        //create loop(while karel is not facing North, turn left)
        while (!(karel.getDirection() == Direction.NORTH)) {
            karel.turnLeft();
        }

        // create loop (while the street karel is on is less than equal to zero) 
        while (karel.getStreet() >= 0) {
        // if the street karel is on equals to zero, turn left and stop
            if (karel.getStreet() == 0) {
                karel.turnLeft();
                break;
            }
            karel.move();

        }
        // create loop (while the avenue karel is on is greater than zero, karel moves)
        while (karel.getAvenue() > 0) {
            karel.move();

        }


    }
}
