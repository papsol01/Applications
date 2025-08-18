public class FizzBuzzTestWhileLoop
{

    public void runFizzBuzzTestWhileLoop() {

        int i = 1;
        while (i <= 100) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzztest");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
