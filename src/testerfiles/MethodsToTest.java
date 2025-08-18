package testerfiles;

public class MethodsToTest {

    public void testMethod () {
        System.out.println("This is my first test");
    }

    public void loopUntil(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.println("i = " + i);
        }
    }

    public void fizzBuzzTest() {
        int i = 1;
        while(i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
            System.out.println(i);
            }
            i++;
        }
    }

    public void forLoopFizzBuzzTest() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    public void forEachLoopFizzBuzzTest() {
        int[] numbers = new int [100];

        // Fill the array with 1 to 100
        for(int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }

        // Enhanced for-loop (for-each)
        for (int number : numbers) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (number % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (number % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(number);
            }
        }
    }
}
