import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void addTest() {
        assertEquals(SkillDemo.add(1, 1), 2);
    }
}
