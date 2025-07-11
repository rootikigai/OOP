import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest{
    private AirConditioner ac;

    @BeforeEach
    public void setUp() {
        ac = new AirConditioner();
    }

    @Test
    public void testThatACCanBeTurnedOn() {
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    public void testThatACCanBeTurnedOff() {
        ac.turnOn();
        ac.turnOff();
        assertTrue(ac.isOff());
    }

    @Test
    public void testIncreaseTemperature() {
        ac.turnOn();
        assertEquals(24, ac.getTemperature());
        ac.increaseTemperature();
        assertEquals(25, ac.getTemperature());
    }

    @Test
    public void testDecreaseTemperature() {
        ac.turnOn();
        assertEquals(24, ac.getTemperature());
        ac.decreaseTemperature();
        assertEquals(23, ac.getTemperature());
    }

    @Test
    public void testCannotIncreaseTemperatureBeyond30() {
        ac.turnOn();
        for (int i = ac.getTemperature(); i < 30; i++) {
            ac.increaseTemperature();
        }
        assertEquals(30, ac.getTemperature());

        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void testCannotDecreaseTemperatureBelow16() {
        ac.turnOn();
        for (int i = ac.getTemperature(); i > 16; i--) {
            ac.decreaseTemperature();
        }
        assertEquals(16, ac.getTemperature());

        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }
}
