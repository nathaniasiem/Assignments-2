
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

        //create loop(karel continues to move since Street is greater than 0)
        while (!(karel.getDirection() == Direction.NORTH)) {
            karel.turnLeft();
        }


        while (karel.getStreet() >= 0) {
            if (karel.getStreet() == 0) {
                karel.turnLeft();
                break;
            }
            karel.move();

        }
        while (karel.getAvenue() > 0) {
            karel.move();

        }


    }
}
