import Lesson_6.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class CalcMassAndTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0,0,0},
                {1,1,2},
                {2,2,4},
                {2,2,5},
        });
    }

    private int a;
    private int b;
    private int c;

    public CalcMassAndTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Calculator calculator;

    @Before
    public void init() {
        System.out.println("init");
        calculator = new Calculator();
    }

    @Test
    public void testAdd1() {
        Assert.assertEquals(c, calculator.add(a,b));
    }

}
