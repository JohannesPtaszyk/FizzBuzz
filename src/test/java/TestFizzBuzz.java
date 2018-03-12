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
                {6, "Fizz"}
        });
    }

    private int tInput;
    private String tExpected;

    public TestFizzBuzz(int input, String expected) {
        tInput = input;
        tExpected = expected;
    }

    @Test
    public void testReturnFor(){
        Assert.assertEquals(tExpected,FizzBuzz.result(tInput));
    }
}
