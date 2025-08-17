import java.util.Scanner;

public class VariablesApp {

    private double age = 0;

    public void printAge(double age){
        System.out.println();
        System.out.println(age);
        System.out.println();
    }

    public void printYear() {
        int year = 2025;
        int age = 24;

        System.out.println();
        System.out.println("The year is: " + year);

        year = year + 1;
        System.out.println("The next year will be " + year);

        System.out.println();
        System.out.println("My age is: " + age);

        age = age + 1;
        System.out.println("Next year I will be: " + age);
    }

    public void printNumber(double abs_null) {
        System.out.println();
        System.out.print(abs_null);
        System.out.println();
    }

    public void printName(String name) {
        System.out.println();
        System.out.println("Hello, my name is: " + name + "!");
        System.out.println();
    }

    public void printHelloWorld() {
        // Prints out "Hello world!"
        /*
        Prints out "Hello World!"
        */
        System.out.println();
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("X    X   XXXX   X       X        XXX");
        System.out.println("X    X   X      X       X       X   X");
        System.out.println("XXXXXX   XXX    X       X       X   X");
        System.out.println("X    X   X      X       X       X   X");
        System.out.println("X    X   XXXX   XXXXX   XXXXX    XXX");
        System.out.println();
    }

    public void equation(int x) {

        int result = (x - 2 * 3 * (x + 1) / 2);

        System.out.println();
        System.out.println("With a x-variable of: 2.");
        System.out.println("The equation = " + result);
    }

    public void helloMyFriend() {

        String first = "Hello ";
        String second = "my";
        String third = " friend";
        String concatenation = first + second + third + "!";

        System.out.println();
        System.out.println(concatenation);
    }

    public void currencyCalcEur() {
        int eur = 100;

        System.out.println();
        System.out.println("The currency is: " + eur);
        System.out.println(" euro corresponds to ");
        double dkk = eur * 7.45;

        System.out.println(dkk + " kr");
        System.out.println();
    }

    public void dkk2eur(double amountDDK) {
        double dkk = amountDDK;
        double eur = dkk / 7.45;
        String corresponds = "dkk corresponds to ";

        System.out.println();
        System.out.print(dkk);
        System.out.print(corresponds);
        System.out.printf("%.2f", eur);

        // Alternative formatting
        System.out.println(" euro");
        System.out.println(dkk + corresponds + String.format("%.2f", eur) + (" euro"));
        System.out.println();
    }

    public void c2f (double celcius) {

        double c = celcius;
        double f = (celcius * 1.8) + 32;

        System.out.println();
        System.out.println(c + " is the same as " + f + "F");
    }

    public void f2c (double fahrenheit) {

        double f = fahrenheit;
        double c = (fahrenheit - 32) / 1.8;

        System.out.println();
        System.out.println(String.format("%.2f", f) + "F" + " is the same as " + c + "C");
    }

    public void askName() {
        Scanner scanner = new Scanner(System.in);

        String first = "Hello my friend!";
        String second = "What is your name?";
        String third = "Nice to meet you";

        String name;

        while (true) {

            System.out.println();
            System.out.println(first);
            System.out.println(second);

            name = scanner.nextLine();

            // Checking for valid name
            if (name.matches("[a-z A-Z ]+")) {
                break;
            } else {
                System.out.println("The given name is not valid. Please try again.");
            }
        }

        scanner.close();

        System.out.println();
        System.out.println(third + " " + name + "!");
    }

}
