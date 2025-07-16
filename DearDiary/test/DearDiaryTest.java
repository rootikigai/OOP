import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DearDiaryTest{
    @Test
    public void testThatDiaryCanBeCreated(){
        DearDiary diary = new DearDiary("Kelvin", "fakeasspassword1234");
        String username = diary.getUserName();
        String password = diary.getPassword();
        assertEquals("Kelvin", username);
        assertEquals("fakeasspassword1234", password);
    }
}
