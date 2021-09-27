import org.junit.*;

import static org.junit.Assert.*;


public class DragonTest {
    Dragon h;

    @Before
    public void setUp() throws Exception {
        h = new Dragon();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(200, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(210, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(190, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, h.getPrice());
    }

}