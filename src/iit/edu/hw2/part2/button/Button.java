package iit.edu.hw2.part2.button;

/**
 * Created by Parth on 2/25/2016.
 */
public class Button implements ButtonService {

    @Override
    public void switchOn() {
        System.out.println("Button switched to ON");
    }

    @Override
    public void switchOff() {
        System.out.println("Button switched to OFF");
    }

}
