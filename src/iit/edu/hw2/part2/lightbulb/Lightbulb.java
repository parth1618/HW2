package iit.edu.hw2.part2.lightbulb;

import iit.edu.hw2.part2.button.ButtonService;

/**
 * Created by Parth on 2/25/2016.
 */
public class Lightbulb implements LightbulbService {

    ButtonService btnsrvc;
    private String status = "off";

    public Lightbulb(ButtonService btnsrvc){
        this.btnsrvc = btnsrvc;
    }

    @Override
    public void on() {
        if(status.equals("off")) {
            btnsrvc.switchOn();
            System.out.println("Lightbulb on");
            status = "on";
        }
    }

    @Override
    public void off() {
        if(status.equals("on")){
            btnsrvc.switchOff();
            System.out.println("Lightbulb off");
            status = "off";
        }

    }
}
