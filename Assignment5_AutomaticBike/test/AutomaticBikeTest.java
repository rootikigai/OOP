import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest{
    AutomaticBike bike;

    @BeforeEach
    public void setUp() {
        bike = new AutomaticBike();
    }

    @Test
    public void testThatBikeCanBeTurnedOn() {
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testThatBikeCanBeTurnedOff() {
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThatBikeAcceleratesInGearOne() {
        bike.turnOn();
        bike.setSpeed(15);
        bike.accelerate();
        assertEquals(16, bike.getSpeed());
    }

    @Test
    public void testThatBikeMovesFromGearOneToGearTwo() {
        bike.turnOn();
        bike.setSpeed(20);
        bike.accelerate();
        assertEquals(21, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testThatBikeAcceleratesInGearTwo() {
        bike.turnOn();
        bike.setSpeed(24);
        bike.accelerate();
        assertEquals(26, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testThatBikeMovesFromGearTwoToGearThree() {
        bike.turnOn();
        bike.setSpeed(30);
        bike.accelerate();
        assertEquals(32, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void testThatBikeAcceleratesInGearThree() {
        bike.turnOn();
        bike.setSpeed(35);
        bike.accelerate();
        assertEquals(38, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void testThatBikeMovesFromGearThreeToGearFour() {
        bike.turnOn();
        bike.setSpeed(40);
        bike.accelerate();
        assertEquals(43, bike.getSpeed());
        assertEquals(4, bike.getGear());
    }

    @Test
    public void testThatBikeDeceleratesInGearOne() {
        bike.turnOn();
        bike.setSpeed(15);
        bike.decelerate();
        assertEquals(14, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testThatBikeMovesFromGearTwoToGearOneWhenDecelerating() {
        bike.turnOn();
        bike.setSpeed(22);
        bike.decelerate();
        assertEquals(20, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testThatBikeMovesFromGearThreeToGearTwoWhenDecelerating() {
        bike.turnOn();
        bike.setSpeed(32);
        bike.decelerate();
        assertEquals(29, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testThatBikeMovesFromGearFourToGearThreeWhenDecelerating() {
        bike.turnOn();
        bike.setSpeed(44);
        bike.decelerate();
        assertEquals(40, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void testThatBikeDoesNotAccelerateWhenOff() {
        bike.setSpeed(10);
        bike.accelerate();
        assertEquals(10, bike.getSpeed());
    }

    @Test
    public void testThatBikeDoesNotDecelerateWhenOff() {
        bike.setSpeed(10);
        bike.decelerate();
        assertEquals(10, bike.getSpeed());
    }

    @Test
    public void testThatBikeSpeedDoesNotGoBelowZero() {
        bike.turnOn();
        bike.setSpeed(0);
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }
}
