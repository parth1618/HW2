package iit.edu.hw2;

import iit.edu.hw2.part1.button.Button;

import iit.edu.hw2.part2.factory.LightblbButtonInjector;
import iit.edu.hw2.part2.factory.LightbulbWithSwitchButton;
import iit.edu.hw2.part2.lightbulb.LightbulbService;

import iit.edu.hw2.part3.factory.LightbulbWithPushButton;

/**
 * Created by Parth on 2/25/2016.
 */
public class TableLamp {

    public static void main(String args[]){

        System.out.println("------------Table Lamp Part I------------");
        Button btn = new Button();
        btn.switchOn();
        btn.switchOff();
        System.out.println("----------Table Lamp Part I End----------");

        System.out.println("------------Table Lamp Part II------------");
        LightblbButtonInjector tablelampPart2 = null;
        LightbulbService lightbulbPart2 = null;

        tablelampPart2 = new LightbulbWithSwitchButton();
        lightbulbPart2 = tablelampPart2.getLightblbWithButton();
        lightbulbPart2.on();
        lightbulbPart2.off();
        System.out.println("----------Table Lamp Part II End----------");

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
