import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addTest() {
        Calculator c = new Calculator(1,3);
        assertEquals(4, c.add());
        assertEquals(3, c.sub());
    }

}