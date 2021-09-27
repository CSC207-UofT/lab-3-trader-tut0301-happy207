import org.junit.*;

import static org.junit.Assert.*;


public class LamborghiniTest {

    Lamborghini car;

    @Before
    public void setUp() throws Exception {
        car = new Lamborghini();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("VROOM!", car.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(350, car.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        car.upgradeSpeed();
        assertEquals(360, car.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        car.downgradeSpeed();
        assertEquals(340, car.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(2000000, car.getPrice());
    }

}
