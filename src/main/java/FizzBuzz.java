public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String  WHIZZ = "Whizz";
    private static final String EMPTY_STRING = "";

    private boolean isFizz (int input) {
        return input % 3 == 0 || getIntegerAsString(input).contains("3");
    }

    private boolean isBuzz (int input) {
        return input % 5 == 0;
    }

    private boolean isWhizz (int input) {
        return input % 7 == 0 || getIntegerAsString(input).contains("7");
    }

    private boolean isResultEmpty (String result) {
        return result.equals(EMPTY_STRING);
    }

    private String getIntegerAsString(int input) {
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
        if (isWhizz(input)) {
            resultBuilder.append(WHIZZ);
        }

        if (isResultEmpty(resultBuilder.toString())) {
            resultBuilder.append(getIntegerAsString(input));
        }

        return resultBuilder.toString();
    }
}
