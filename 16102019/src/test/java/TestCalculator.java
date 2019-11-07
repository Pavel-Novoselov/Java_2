import Lesson_6.Calculator;
import org.junit.*;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void init() {
        System.out.println("init");
        calculator = new Calculator();
    }

    @Test
    public void testAdd1() {
        Assert.assertNotEquals(4, calculator.add(2,2));
    }

    @Test(expected = ArithmeticException.class, timeout = 100)
    @Ignore(value = "это интеграционный тест который работет правильно")
    public void testAdd2() {
        Assert.assertEquals(5, calculator.div(10,0));
    }

    @Test
    public void testAdd3() {
        Assert.assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testAdd4() {
        Assert.assertEquals(5, calculator.add(2,2));
    }

    @After
    public void shutdown() {
        System.out.println("down");
    }
}
