import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {
    @Test
    public void testThatProblemCanBeCreated(){
        String name = "Semicolon Loan";
        String type = "FINANCIAL";

        Problem problem = new Problem(name, description, type);

        assertEquals(name, problem.getName());
        assertEquals(type, problem.getType());
    }
}
