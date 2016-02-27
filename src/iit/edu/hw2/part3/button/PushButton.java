package iit.edu.hw2.part3.button;

import iit.edu.hw2.part2.button.ButtonService;

/**
 * Created by Parth on 2/25/2016.
 */
public class PushButton implements ButtonService {

    private boolean isButtonPushed = false;

    private void pushButton() {
        isButtonPushed = (!isButtonPushed) ? true : false;
        System.out.println("Button Pushed");
    }

    @Override
    public void switchOn() {
        pushButton();
    }

    @Override
    public void switchOff() {
        pushButton();
    }
}
