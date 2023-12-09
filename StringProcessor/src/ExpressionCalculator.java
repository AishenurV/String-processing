import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExpressionCalculator {

    public static double calculateExpression(String expression) {
        double result = 0.0;

        // Create a script engine
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        try {
            // Evaluate the expression
            Object evalResult = engine.eval(expression);
            result = Double.parseDouble(evalResult.toString());
        } catch (ScriptException e) {
            e.printStackTrace(); // Handle script evaluation errors
        }

        // Return the result
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        String exampleExpression = "2 * (3 + 4)";
        var result = calculateExpression(exampleExpression);
        System.out.println("Result of the expression: " + result); // Output: 14.0
    }
}

