import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestFizzBuzz {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {3, "Fizz"},
                {4, "4"},
                {5, "Buzz"},
                {6, "Fizz"},
                {7, "Whizz"},
                {10,"Buzz"},
                {12,"Fizz"},
                {15,"FizzBuzz"},
                {17, "Whizz"},
                {23,"Fizz"},
                {25,"Buzz"},
                {105,"FizzBuzzWhizz"}
        });
    }

    private int tInput;
    private String tExpected;

    public TestFizzBuzz(int input, String expected) {
        tInput = input;
        tExpected = expected;
    }

    @Test
    public void testReturnForInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(tExpected, fizzBuzz.result(tInput));
    }
}
