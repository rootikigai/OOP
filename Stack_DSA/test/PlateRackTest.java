import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlateRackTest {
    PlateRack rack;

    @BeforeEach
    public void setUp() {
        rack = new PlateRack();
    }

    @Test
    public void testRackStartsEmpty() {
        assertTrue(rack.isRackEmpty());
        assertEquals(0, rack.plateCount());
    }

    @Test
    public void testAddPlateIncreasesCount() {
        rack.addPlate("glassPlate");
        assertFalse(rack.isRackEmpty());
        assertEquals(1, rack.plateCount());
    }

    @Test
    public void testRemovePlateDecreasesCount() {
        rack.addPlate("glassPlate");
        rack.addPlate("ceramicPlate");
        assertEquals("ceramicPlate", rack.removePlate());
        assertEquals(1, rack.plateCount());
    }

    @Test
    public void testPeekPlateWithoutRemoving() {
        rack.addPlate("plasticPlate");
        assertEquals("plasticPlate", rack.peekPlate());
        assertEquals(1, rack.plateCount());
    }

    @Test
    public void testRemoveFromEmptyRackReturnsNull() {
        assertNull(rack.removePlate());
    }

    @Test
    public void testPeekFromEmptyRackReturnsNull() {
        assertNull(rack.peekPlate());
    }
}
