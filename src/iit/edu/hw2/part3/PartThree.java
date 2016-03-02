package iit.edu.hw2.part3;

import iit.edu.hw2.part2.factory.LightblbButtonInjector;
import iit.edu.hw2.part2.factory.LightbulbWithSwitchButton;
import iit.edu.hw2.part2.lightbulb.LightbulbService;
import iit.edu.hw2.part3.factory.LightbulbWithPushButton;

/**
 * Created by Parth on 3/1/2016.
 */
public class PartThree {

    public static void main(String args[]){

        System.out.println("------------Table Lamp Part III------------");
        LightblbButtonInjector tablelampPart3 = null;
        LightbulbService lightbulbPart3 = null;

        tablelampPart3 = new LightbulbWithPushButton();
        lightbulbPart3 = tablelampPart3.getLightblbWithButton();
        lightbulbPart3.on();
        lightbulbPart3.off();
        System.out.println("----------Table Lamp Part III End----------");
    }
}
