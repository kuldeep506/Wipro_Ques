package factorial;

/**
 * 3. Write a program to print factorial of N ( without using any loop).
 */

public class Factorial {
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}

