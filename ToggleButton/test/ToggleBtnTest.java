import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToggleBtnTest {
    private ToggleBtn toggleBtn;

    @Test
    public void testThatToggleBtnIsOn() {
        togg.turnOn();
        assertTrue(ac.isOn());
    }
}
