import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeTest {

    private Coffee emptyCoffee;
    private Coffee actualCoffee;

    private double deltaValue = 0.000001;

    @Before
    public void setup() {
        actualCoffee = new Coffee("The Bean-i-nator", "espresso", 5.99);
    }

    @Test
    public void testCoffeeConstructor(){
        actualCoffee = new Coffee();


        //assert that emptyCoffee is null
        assertNull(emptyCoffee);
        //assert tha actualCoffee is NOT null
        assertNotNull(actualCoffee);
    }

    @Test
    public void testCoffeeThreeArgConstructor(){
    }

    @Test
    public void testCoffeeGetters() {
        assertEquals(actualCoffee.getName(), "The Bean-i-nator");
        assertEquals(actualCoffee.getRoast(), "espresso");
        assertEquals(actualCoffee.getPrice(), 5.99, deltaValue);
    }

    @Test
    public void testCoffeeSetters(){
        actualCoffee.setName("The Bean-i-nator Too");
        assertEquals(actualCoffee.getName(), "The Bean-i-nator Too");

        actualCoffee.setRoast("dark");
        assertEquals(actualCoffee.getRoast(), "dark");

        actualCoffee.setPrice(6.49);
        assertEquals(actualCoffee.getPrice(), 6.49, deltaValue);
    }
}
