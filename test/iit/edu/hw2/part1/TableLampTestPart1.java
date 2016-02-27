package iit.edu.hw2.part1;

import iit.edu.hw2.part1.button.Button;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Parth on 2/27/2016.
 */
public class TableLampTestPart1 {

    Button btn;

    @BeforeClass
    public static void start(){
        System.out.println("---------Part 1 Test----------");
        System.out.println();
    }

    @AfterClass
    public static void close(){
        System.out.println("--------Part 1 Test End-------");
        System.out.println();
    }

    @Before
    public void setup(){
        btn =  new Button();
    }

    @Test
    public void test_button_switchOn_switchOff(){
        btn.switchOn();
        btn.switchOff();
    }

}