package iit.edu.hw2.part2.factory;

import iit.edu.hw2.part2.button.Button;
import iit.edu.hw2.part2.lightbulb.Lightbulb;
import iit.edu.hw2.part2.lightbulb.LightbulbService;

/**
 * Created by Parth on 2/25/2016.
 */
public class LightbulbWithSwitchButton implements LightblbButtonInjector {

    @Override
    public LightbulbService getLightblbWithButton() {
        return new Lightbulb(new Button());
    }
}
