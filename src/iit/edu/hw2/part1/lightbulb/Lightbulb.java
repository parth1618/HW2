package iit.edu.hw2.part1.lightbulb;

/**
 * Created by Parth on 2/25/2016.
 */
public class Lightbulb{

    private String status = "off";

    public Lightbulb(){
    }

    public void on() {
        if(status.equals("off")) {
            System.out.println("Lightbulb on");
            status = "on";
        }
    }

    public void off() {
        if(status.equals("on")){
            System.out.println("Lightbulb off");
            status = "off";
        }

    }
}
