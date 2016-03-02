package iit.edu.hw2.part2;

import iit.edu.hw2.part1.button.Button;
import iit.edu.hw2.part2.factory.LightblbButtonInjector;
import iit.edu.hw2.part2.factory.LightbulbWithSwitchButton;
import iit.edu.hw2.part2.lightbulb.LightbulbService;

/**
 * Created by Parth on 3/1/2016.
 */
public class PartTwo {

    public static void main(String args[]){
        System.out.println("------------Table Lamp Part II------------");
        LightblbButtonInjector tablelampPart2 = null;
        LightbulbService lightbulbPart2 = null;

        tablelampPart2 = new LightbulbWithSwitchButton();
        lightbulbPart2 = tablelampPart2.getLightblbWithButton();
        lightbulbPart2.on();
        lightbulbPart2.off();
        System.out.println("----------Table Lamp Part II End----------");
    }
}
