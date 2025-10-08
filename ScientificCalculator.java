public class ScientificCalculator {

    public static double lastResult;

    public static double add(double a, double b) {
        lastResult = a + b;
        return lastResult;
    }

    public static double subtract(double a, double b) {
        lastResult = a - b;
        return lastResult;
    }

    public static double multiply(double a, double b) {
        lastResult = a * b;
        return lastResult;
    }

    public static double divide(double a, double b) {
        lastResult = a / b;
        return lastResult;
    }

    public static double power(double base, double exp) {

        double result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        lastResult = result;

        return result;
    }

    public static double squareRoot(double value) {
        double guess = value / 2;
        double prev = 0;

        while (guess != prev) {
            prev = guess;
            guess = (value / guess + guess) / 2;
        }
        lastResult = guess;

        return guess;
        //return Math.sqrt(value);
    }

    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        lastResult = result;
        return result;
    }

    public static double sine(double angleInDegrees) {
        double sum = 0;
        int sign = 1;

        for (int i = 1; i <= 10; i++) {
            int termPower = 2 * i - 1;
            double term = power(angleInDegrees, termPower) / factorial(termPower);
            sum += sign * term;
            sign *= -1;
        }
        lastResult = sum;

        return sum;
        //return Math.sin(angleInDegrees);
    }

    public static double cosine(double angleInDegrees) {
        double sum = 0;
        int sign = 1;
        for (int i = 0; i < 10; i++) {
            int termPower = 2 * i;
            double term = power(angleInDegrees, termPower) / factorial(termPower);
            sum += sign * term;
            sign *= -1;
        }
        lastResult = sum;
        return sum;
        //return Math.cos(angleInDegrees);
    }


}

