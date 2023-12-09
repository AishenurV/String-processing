import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] ignoredArgs, int @NotNull [] String) {
        int StringProcessor = 0;
        int ignoredI = String[StringProcessor];
        {
            var processor = new StringProcessor();

            System.out.println(processor.isStrongPassword("Password!")); // true
            System.out.println(processor.calculateDigits("Hello123")); // 3
            System.out.println(processor.calculateWords("This is a sample sentence.")); // 5
            System.out.println(processor.calculateExpression("2 * (3 + 4)")); // 14.0
        }

    }
}