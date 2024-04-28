public class CalculatorFeatureTest {
    public static void main(String[] args) {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
    }

    private static void testAddition() {
        CalculatorFeature calculator = new CalculatorFeature();
        int result = calculator.add(2, 3);
        assert result == 5 : "2 + 3 should equal 5, but got " + result;
    }

    private static void testSubtraction() {
        CalculatorFeature calculator = new CalculatorFeature();
        int result = calculator.subtract(5, 3);
        assert result == 2 : "5 - 3 should equal 2, but got " + result;
    }

    private static void testMultiplication() {
        CalculatorFeature calculator = new CalculatorFeature();
        int result = calculator.multiply(2, 3);
        assert result == 6 : "2 * 3 should equal 6, but got " + result;
    }

    private static void testDivision() {
        CalculatorFeature calculator = new CalculatorFeature();
        double result = calculator.divide(6, 3);
        assert result == 2.0 : "6 / 3 should equal 2.0, but got " + result;

        try {
            calculator.divide(5, 0);
            System.out.println("Division by zero did not throw expected exception");
        } catch (IllegalArgumentException e) {
            System.out.println("Division by zero threw expected exception");
        }
    }
}

