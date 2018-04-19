import models.Dice;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class TestDice {
    Dice dice;
    ArrayList<Integer> pos;

    public void testDiceRoll(){
        int roll = Dice.roll() ;
        pos = new ArrayList();
        pos.add(1);
        pos.add(2);
        pos.add(3);
        pos.add(4);
        pos.add(5);
        pos.add(6);

        assertTrue(pos.contains(roll));
    }
}
