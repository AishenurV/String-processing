import org.jetbrains.annotations.NotNull;

public class DigitCounter {

    public static int calculateDigits(@NotNull String sentence) {
        int digitCount = 0;

        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        return digitCount;
    }

    public static void main(String[] args) {
        String exampleSentence = "This is 2023 and there are 123 digits.";
        int digitCount = calculateDigits(exampleSentence);
        System.out.println("Number of digits: " + digitCount);
    }
}

