import java.util.*;

public class ConditionsApp {


    public void callWeekday() {
    // Code that is always executed.
        int weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        if (weekday == 5) {
        System.out.println("It is thursday today");
        System.out.println(weekday);
        }
        else {
            System.out.print("It is not thursday today");
            }
        }

        public void isItDayTime() {
        int timeOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if( timeOfDay >= 8 && timeOfDay <= 22 ) {
            System.out.println("It is daytime");
            System.out.println(timeOfDay);
        }
        else {
            System.out.print("It is not daytime");
            }
        }

        public void isItFriday() {
        Calendar now = Calendar.getInstance();
        //int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        int timeOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int dayOfWeek = 6;

        if (dayOfWeek == Calendar.FRIDAY && timeOfDay < 16) {
                System.out.println();
                System.out.println("Relax, weekend is right around the corner!");
                System.out.println("You just need to hold on for " + (16 - timeOfDay) + " more hours and it's weekend!");
                System.out.println();
            }
        else if (dayOfWeek == Calendar.FRIDAY) {
        System.out.println();
        System.out.println("Finally, it's weekend!");
        System.out.println();
        }
        else if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
            System.out.println();
            System.out.println("It is still weekend!");
        }
        else if (dayOfWeek == Calendar.MONDAY || dayOfWeek == Calendar.TUESDAY) {
                System.out.println();
                System.out.println("You still have a long week ahead!");
                System.out.println();
            }
        else {
            System.out.println();
            System.out.println("You're almost there, hang tight!");
            System.out.println();
            }
        }

        private boolean even(int number) {
        return number % 2 == 0;
        }

        public void isEvenNumber(int number) {

        if(even(number)) {
            System.out.println();
            System.out.println(number + " is an even number!");
        }
        else{
            System.out.println();
            System.out.println(number + " is not an even number!");
            }
        }

        public void whileLoop1() {
        int i = 10;
        while(i > 0) {
            System.out.println(i);
            i--;
            }
        }

        public void whileLoop2() {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
                i= i + 2;
            }
        }

        public void whileLoop3() {
        int i = 1;
        while(i < 100) {
            System.out.println(i);
            i= i * 2;
            }
        }

        // 1 times 1 is always 1 == true.
        public void whileLoop4() {
        int i = 1;
        while(i < 42) {
            System.out.println(i);
            i = i * i;
            }
        }

        public void whileLoop5() {
        int i = 0;
        while (i <= 15) {
            System.out.println(i);
            i = i + 3;
            }
        }

    public void whileLoop6() {
        int i = 1;
        while (i <= 10000) {
            System.out.println(i);
            i = i * 10;
        }
    }

    public void whileLoop7() {
        int i = 64;
        while (i >= 2) {
            System.out.println(i);
            i = i / 2;
        }
    }

    public void whileLoop8() {
        int i = 5;
        while(i <= 50) {
            System.out.println(i);
            i = i + 5;
        }
    }

    public void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void forLoop1() {
        for (int i = 10; i > 0; i = i - 2) {
            System.out.println(i);
        }
    }

    public void forLoop3() {
        for (int i = 3; i < 10; i = i + 3) {
            System.out.println(i);
        }
    }
    //Infinite loop
    public void forLoop4() {
        for (int i = 1; i < 10; i = i * i) {
            System.out.println(i);
        }
    }

    public void forLoop5() {
        for (int i = 0; i <= 15; i = i + 3) {
            System.out.println(i);
        }
    }

    public void forLoop6() {
        for (int i = 1; i <= 10000; i = i * 10) {
            System.out.println(i);
        }
    }

    public void forLoop7() {
        for (int i = 64; i >= 2; i = i / 2) {
            System.out.println(i);
        }
    }

    public void guessingGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(100) + 1;
        //int tries = 0;
        int guess = -1;

        System.out.println();
        System.out.println("Guess a number between 1-100");

        while (guess != secret) {
            guess = scanner.nextInt();
            if (guess == secret) {
                System.out.println("You guessed the secret number!");
            }
            else if (guess > secret) {
                System.out.println("Too high, guess lower number.");
            }
            else {
                System.out.println("Too low, guess a higher number.");
            }
        }
    }

    public void nim() {
        Scanner scanner = new Scanner(System.in);
        int matches = 15;
        int currentPlayer = 1;
        int takenMatches;

        while (matches > 0) {
            System.out.println();
            System.out.println("How many matches do you want to remove from the table?");
            System.out.println("Player " + currentPlayer);

            takenMatches = scanner.nextInt();

            if(takenMatches == 1) {
                System.out.println("Removed " + takenMatches + " match from table.");
                System.out.println("There's now " + (matches - takenMatches) + " left.");
            }

            else if(takenMatches >= 2 && takenMatches <= 3) {
                System.out.println("Removed " + takenMatches + " matches from table");
                System.out.println("There's now " + (matches - takenMatches) + " left.");
            }

            if (takenMatches < 1 || takenMatches > 3) {
                System.out.println("Invalid input! - You can only remove 1 - 3 matches");
                continue; // Same player tries again.
            }
            matches -= takenMatches;

            if (matches == 0) {
                System.out.println();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            currentPlayer = (currentPlayer == 1 ? 2 : 1);

        }
    }
}
