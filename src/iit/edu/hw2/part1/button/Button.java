package iit.edu.hw2.part1.button;

import iit.edu.hw2.part1.lightbulb.Lightbulb;

/**
 * Created by Parth on 2/25/2016.
 */
public class Button{

    Lightbulb lightlbl;

    public Button(){
        lightlbl = new Lightbulb();
    }

    public void switchOn() {
        System.out.println("Button switched to ON");
        lightlbl.on();
    }

    public void switchOff() {
        System.out.println("Button switched to OFF");
        lightlbl.off();
    }

}
