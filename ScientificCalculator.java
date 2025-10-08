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

    public static double tangent(double angleInDegrees) {
        double sinValue = sine(angleInDegrees);
        double cosValue = cosine(angleInDegrees);
        double result = sinValue / cosValue;

        if (cosValue == 0) {
            System.out.println("Tangent is undefined for this angle (cos = 0).");
            return Double.NaN;
        }

        lastResult = result;

        return result;
        //return Math.tan(angleInDegrees);

    }

    public static double logarithm(double value) {
        double result = naturalLog(value) / naturalLog(10);
        lastResult = result;
        return result;
        //return Math.log10(value);
    }

    public static double naturalLog(double value) {
        if (value <= 0) {
            System.out.println("Logarithm undefined for non-positive numbers.");
            return Double.NaN;
        }


        int adjust = 0;
        while (value > 2) {
            value /= 2;
            adjust++;
        }

        double y = value - 1;
        double result = 0;
        int sign = 1;

        for (int n = 1; n <= 20; n++) {
            double term = power(y, n) / n;
            result += sign * term;
            sign *= -1;
        }

        result += adjust * 0.69314718056; // ln(2) ≈ 0.6931
        lastResult = result;
        return result;

        //return Math.log(value);
    }


}

