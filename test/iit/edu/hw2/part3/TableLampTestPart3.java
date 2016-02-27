package iit.edu.hw2.part3;

import iit.edu.hw2.part2.lightbulb.LightbulbService;
import iit.edu.hw2.part3.factory.LightbulbWithPushButton;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Parth on 2/27/2016.
 */
public class TableLampTestPart3 {

    LightbulbWithPushButton lightbulbWithPushButton;

    @BeforeClass
    public static void start(){
        System.out.println("---------Part 3 Test----------");
        System.out.println();
    }

    @AfterClass
    public static void close(){
        System.out.println("--------Part 3 Test End-------");
        System.out.println();
    }

    @Before
    public void setup(){
        lightbulbWithPushButton = new LightbulbWithPushButton();
    }

    @Test
    public void test_getLightbulbWithPushButton(){
        assertTrue(lightbulbWithPushButton.getLightblbWithButton() instanceof LightbulbService);
    }


    @Test
    public void test_tableLamp_pushButton_on_off(){
        LightbulbService lightbulbsrvc = lightbulbWithPushButton.getLightblbWithButton();

        lightbulbsrvc.on();
        lightbulbsrvc.off();

    }

}