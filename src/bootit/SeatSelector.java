package bootit;

import javax.naming.InvalidNameException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SeatSelector {

    Scanner scanner = new Scanner(System.in);

    public void seatSelector() {
        int count = 0;
        int rows = 0;

        System.out.println("How many rows?");

        try {
            while (true) {
                try {
                    rows = getInput();
                    if (rows == 0) {
                        System.out.println("Please enter a valid row number.");
                    } else {
                        System.out.println("Coolio! I’ve computed which rows that must be free now!");
                        break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("Give me a number!");
                    scanner.nextLine();
                }
            }


            while (true) {
                System.out.println("Which row would the student like to sit in?");
                try {
                    int row = getInput();
                    if (row % 3 == 0 && row < rows) {
                        System.out.println("That’s an invalid row! That row must be free! Try another one..");
                    } else if (row > rows) {
                        System.out.println("Sorry, there is only " + rows + " rows Please try another.");
                    } else if (row < 0) {
                        System.out.println("Negative numbers?! Creative… We are teaching IT here, not how to move through matter. Please pick another seat.");
                    } else if (row == 0) {
                        System.out.println("Really? The floor? Well maybe try to select another");
                    } else {
                        count++;
                        System.out.println("That’s a brilliant choice. Please take a seat an enjoy the smooth voice of Niek");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Give me a number!");
                    scanner.nextLine();
                }
            }

        } catch (InvalidNameException e) {
            System.out.println("Cool, everyone must be seated then! Please enjoy the lecture. Do you want to know how many free rows there are (y/n)");

            Scanner scanner1 = new Scanner(System.in);
            String response = "";
            while (true) {
                response = scanner1.next();

                if (response.equals("y")) {
                    int freeRows = rows - count;
                    System.out.println("According to my calculations, there should be a total of " + freeRows + " rows there should be free.");
                    break;
                } else if (response.equals("n")) {
                    System.out.println("Okay… Then count it yourself");
                    break;
                } else {
                    System.out.println("Dude!");
                }
            }
        }
    }

    private int getInput() throws InvalidNameException {
        if (scanner.hasNext(Pattern.compile("STOP", Pattern.CASE_INSENSITIVE))) {
            throw new InvalidNameException();
        }

        return scanner.nextInt();
    }
}
