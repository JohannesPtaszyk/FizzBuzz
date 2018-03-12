public class FizzBuzz {
    public static String result (int input) {
        String result = null;
        if (input % 3 == 0) {
            result = "Fizz";
        }
        if (input % 5 == 0) {
            result = "Buzz";
        }
        if (result == null) {
            result = Integer.toString(input);
        }
        return result;
    }
}
