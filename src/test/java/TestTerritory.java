import models.Territory;
import models.Piece;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestTerritory {
    Territory territory;

    @Before
    public void setUp() throws Exception {
        Map<Piece, Integer> army = new HashMap();
        army.put(Piece.INFANTRY, 1);
        army.put(Piece.CAVALRY, 2);
        army.put(Piece.ARTILLERY, 3);
        territory = new Territory("Spain", army);
    }

    @Test
    public void testCountryHasInfantry(){
        assertEquals(1, territory.getInfantry());
    }

    @Test
    public void testCountryHasCavalry(){
        assertEquals(2, territory.getCavalry());
    }

    @Test
    public void testCalculateInfantry(){
        assertEquals(1, territory.totalInfantry());
    }

    @Test
    public void testCalculateCavalry(){
        assertEquals(10, territory.totalCavalry());
    }

    @Test
    public void testCountryHasArtillery(){
        assertEquals(30, territory.totalArtillery());
    }

    @Test
    public void testCountryTotalValue(){
        assertEquals(41, territory.total());
    }











}
