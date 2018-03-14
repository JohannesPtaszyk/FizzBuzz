public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String EMPTY_STRING = "";

    private boolean isFizz (int input) {
        return input % 3 == 0;
    }

    private boolean isBuzz (int input) {
        return input % 5 == 0;
    }

    private boolean isResultEmpty (String result) {
        return result.equals(EMPTY_STRING);
    }

    private String returnIntegerAsString(int input) {
        return Integer.toString(input);
    }

    public String result (int input) {
        StringBuilder resultBuilder = new StringBuilder();

        if (isFizz(input)) {
            resultBuilder.append(FIZZ);
        }
        if (isBuzz(input)) {
            resultBuilder.append(BUZZ);
        }
        if (isResultEmpty(resultBuilder.toString())) {
            resultBuilder.append(returnIntegerAsString(input));
        }
        return resultBuilder.toString();
    }
}
