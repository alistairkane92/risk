import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestCountry {
    Country country;

    @Before
    public void setUp() throws Exception {
        Map<Piece, Integer> army = new HashMap();
        army.put(Piece.INFANTRY, 1);
        army.put(Piece.CAVALRY, 2);
        army.put(Piece.ARTILLERY, 3);
        country = new Country("Spain", army);
    }

    @Test
    public void testCountryHasInfantry(){
        assertEquals(1, country.getInfantry());
    }

    @Test
    public void testCountryHasCavalry(){
        assertEquals(2, country.getCavalry());
    }

    @Test
    public void testCountryHasArtillery(){
        assertEquals(3, country.getArtillery());
    }





}
