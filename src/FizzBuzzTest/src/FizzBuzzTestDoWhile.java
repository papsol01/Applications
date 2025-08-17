public class FizzBuzzTestDoWhile {

    public void runFizzBuzzTestDoWhile() {

        int i = 1;
        do {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzzTest");
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

        } while (i <= 100);
    }
}
