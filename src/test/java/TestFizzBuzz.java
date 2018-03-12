import org.junit.Assert;
import org.junit.Test;

public class TestFizzBuzz {

    @Test
    public void for1Return1() {
        String actual = FizzBuzz.result(1);
        Assert.assertEquals("1", actual);
    }

    @Test
    public void for2Return2() {
        String actual = FizzBuzz.result(2);
        Assert.assertEquals("2", actual);
    }

    @Test
    public void for3ReturnFizz() {
        String actual = FizzBuzz.result(3);
        Assert.assertEquals("Fizz", actual);
    }

    @Test
    public void for5ReturnBuzz() {
        String actual = FizzBuzz.result(5);
        Assert.assertEquals("Buzz", actual);
    }
}
