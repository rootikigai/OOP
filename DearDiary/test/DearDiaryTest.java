import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DearDiaryTest{
    @BeforeEach
    public void setUp(){
        DearDiary diary = new DearDiary("Kelvin", "fakeasspassword1234");
    }
    @Test
    public void testThatDiaryCanBeCreated(){
        DearDiary diary = new DearDiary("Kelvin", "fakeasspassword1234");
        String username = diary.getUsername();
        String password = diary.getPassword();
        assertEquals("Kelvin", username);
        assertEquals("fakeasspassword1234", password);
    }

    @Test
    public void testThatDiaryCanBeLockedAndUnlocked(){
        DearDiary diary = new DearDiary("Kelvin", "fakeasspassword1234");
        assertTrue(diary.isLocked());
        diary.unlockDiary("fakeasspassword1234");
        assertFalse(diary.isLocked());
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }
    @Test
    public void testThatEntryCanBeMadeIntoDiary(){
        DearDiary diary = new DearDiary("Kelvin", "fakeasspassword1234");

    }

}
