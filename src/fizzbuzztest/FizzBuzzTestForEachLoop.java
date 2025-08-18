import java.util.*;

public class FizzBuzzTestForEachLoop {

    public void runFizzBuzzTestForEachLoop() {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        for (Integer i : numbers) {
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
