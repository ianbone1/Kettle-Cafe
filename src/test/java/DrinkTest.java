import Cafe.Drink.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrinkTest {

    Drink softDrink;
    Drink wineDrink;

    @Before
    public void setup(){
        softDrink = new Drink("Coke",1.50, false);
        wineDrink = new Drink("Pinot", 4.80, true);
    }

    @Test
    public void drinkHasName() {
        assertEquals("Coke", softDrink.getName());
    }

    @Test
    public void drinkHasPrice() {
        assertEquals(1.50, softDrink.getPrice(),0.0);
    }

    @Test
    public void hasNoAlcohol() {
        assertFalse(softDrink.containsAlcohol());
    }

    @Test
    public void hasAlcohol() {
        assertTrue(wineDrink.containsAlcohol());
    }

    @Test
    public void canSell() {
        assertEquals("Sold Drink", wineDrink.sell());
    }
}
