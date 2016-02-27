package iit.edu.hw2.part3.factory;

import iit.edu.hw2.part2.factory.LightblbButtonInjector;
import iit.edu.hw2.part2.lightbulb.Lightbulb;
import iit.edu.hw2.part2.lightbulb.LightbulbService;
import iit.edu.hw2.part3.button.PushButton;



/**
 * Created by Parth on 2/25/2016.
 */
public class LightbulbWithPushButton implements LightblbButtonInjector {

    @Override
    public LightbulbService getLightblbWithButton() {
        return new Lightbulb(new PushButton());
    }
}
