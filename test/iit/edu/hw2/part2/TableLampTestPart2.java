package iit.edu.hw2.part2;

import iit.edu.hw2.part2.factory.LightbulbWithSwitchButton;
import iit.edu.hw2.part2.lightbulb.LightbulbService;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Parth on 2/27/2016.
 */
public class TableLampTestPart2 {

    LightbulbWithSwitchButton lightbulbWithSwitchButton;

    @BeforeClass
    public static void start(){
        System.out.println("---------Part 2 Test----------");
        System.out.println();
    }

    @AfterClass
    public static void close(){
        System.out.println("--------Part 2 Test End-------");
        System.out.println();
    }

    @Before
    public void setup(){
        lightbulbWithSwitchButton = new LightbulbWithSwitchButton();
    }

    @Test
    public void test_getLightbulbWithSwitchButton(){
        assertTrue(lightbulbWithSwitchButton.getLightblbWithButton() instanceof  LightbulbService);
    }
    @Test
    public void test_tableLamp_on_off(){
        LightbulbService lightbulbsrvc = lightbulbWithSwitchButton.getLightblbWithButton();

        lightbulbsrvc.on();
        lightbulbsrvc.off();

    }

}