import Cafe.Customer;
import Cafe.Drink.Drink;
import Cafe.Food.Sandwich;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer cust;
    private Drink softDrink;
    private Drink wineDrink;
    private Sandwich blt;

    @Before
    public void setup(){
        cust = new Customer("Ian", 47, 20.0);
        softDrink = new Drink("Coke",1.50, false);
        wineDrink = new Drink("Pinot", 4.80, true);
        blt = new Sandwich("Bacon Lettuce Tomato", 4.8, true);
    }

    @Test
    public void testHasName() {
        assertEquals("Ian", cust.getName());
    }

    @Test
    public void canBuyDrink() {
        cust.buy(softDrink);
        cust.buy(wineDrink);
        assertEquals(2, cust.purchaseCount());
    }

    @Test
    public void canBuySandwich() {
        cust.buy(blt);
        assertEquals(1, cust.purchaseCount());
    }

    @Test
    public void canBuyFoodAndDrink() {
        cust.buy(blt);
        cust.buy(wineDrink);
        assertEquals(2, cust.purchaseCount());
    }
}
