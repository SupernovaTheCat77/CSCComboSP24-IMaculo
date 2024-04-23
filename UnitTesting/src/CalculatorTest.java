import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {
	
	private Calculator calc;
	
	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(2, 3), "2+3 failed");
	}
	
	@Test
	public void testMultiply() {
		assertTrue(calc.multiply(2, 3) == 6, "2*3 failed");
	}
	
	@Test
	public void testSubtract() {
		assertEquals(1, calc.subtract(4, 3), "4-3 failed");
	}
	
	@Test
	@Disabled("Code not implemented yet")
	public void testDivide() {
		assertEquals(4, calc.divide(10, 2), "10/2 failed");
	}
}
