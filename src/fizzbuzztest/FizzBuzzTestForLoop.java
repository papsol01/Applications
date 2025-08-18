public class FizzBuzzTestForLoop {

    public void runFizzBuzzTestForLoop() {
        System.out.println();
        System.out.println("This is the FizzBuzzTest");
        System.out.println();

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzztest");
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
}
