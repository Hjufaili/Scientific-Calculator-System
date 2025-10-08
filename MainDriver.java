import java.util.Scanner;

public class MainDriver {

    public static Integer menuOption = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (menuOption != 13) {
            showAllMenu();
            menuOption = scanner.nextInt();
            if (menuOption == 1) {
                System.out.println("Add two numbers");
                System.out.println("Enter fist number");
                double a = scanner.nextDouble();
                System.out.println("Enter second number");
                double b = scanner.nextDouble();
                System.out.println(ScientificCalculator.add(a, b));

            } else if (menuOption == 2) {
                System.out.println("Subtract two numbers");
                System.out.println("Enter fist number");
                double a = scanner.nextDouble();
                System.out.println("Enter second number");
                double b = scanner.nextDouble();
                System.out.println(ScientificCalculator.subtract(a,b));

            } else if (menuOption == 3) {
                System.out.println("multiply two numbers");
                System.out.println("Enter fist number");
                double a = scanner.nextDouble();
                System.out.println("Enter second number");
                double b = scanner.nextDouble();
                System.out.println(ScientificCalculator.multiply(a,b));

            } else if (menuOption == 4) {
                System.out.println("divide two numbers");
                System.out.println("Enter fist number");
                double a = scanner.nextDouble();
                System.out.println("Enter second number");
                double b = scanner.nextDouble();
                System.out.println(ScientificCalculator.divide(a,b));

            } else if (menuOption == 5) {
                System.out.println("power ");
                System.out.println("Enter base number");
                double a = scanner.nextDouble();
                System.out.println("Enter exp. number");
                double b = scanner.nextDouble();
                System.out.println(ScientificCalculator.power(a,b));

            } else if (menuOption == 6) {
                System.out.println("Square root ");
                System.out.println("Enter the value");
                double a = scanner.nextDouble();
                System.out.println(ScientificCalculator.squareRoot(a));

            } else if (menuOption == 7) {
                System.out.println("Sine ");
                System.out.println("Enter the angleInDegrees");
                double a = scanner.nextDouble();
                System.out.println(ScientificCalculator.sine(a));

            } else if (menuOption == 8) {
                System.out.println("cosine ");
                System.out.println("Enter the angleInDegrees");
                double a = scanner.nextDouble();
                System.out.println(ScientificCalculator.cosine(a));

            } else if (menuOption == 9) {
                System.out.println("tangent ");
                System.out.println("Enter the angleInDegrees");
                double a = scanner.nextDouble();
                System.out.println(ScientificCalculator.tangent(a));

            } else if (menuOption == 10) {
                System.out.println("logarithm ");
                System.out.println("Enter the value");
                double a = scanner.nextDouble();
                System.out.println(ScientificCalculator.logarithm(a));

            } else if (menuOption == 11) {
                System.out.println("naturalLog");
                System.out.println("Enter the value");
                double a = scanner.nextDouble();
                System.out.println(ScientificCalculator.naturalLog(a));

            } else if (menuOption == 12) {
                System.out.println("Show Last Result");
                System.out.println(ScientificCalculator.lastResult);

            } else if (menuOption == 13) {
                System.out.println("Exit from menu");


            } else {
                System.out.println("Please enter a number from the menu");
            }

        }

    }

    public static void showAllMenu() {
        System.out.println("""
                ===== Scientific Calculator Menu =====
                1. Add
                2. Subtract
                3. Multiply
                4. Divide
                5. Power
                6. Square Root
                7. Sine
                8. Cosine
                9. Tangent
                10. Logarithm (base 10)
                11. Natural Log (ln)
                12. Show Last Result
                13. Exit
                ======================================
                Please enter your choice:
                """);
    }


}
