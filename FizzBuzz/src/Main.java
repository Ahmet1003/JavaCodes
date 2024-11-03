import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // We should enter a number. If this number is divisible by five, we get 'Fizz'.
        // If we run the program again and enter 10, we get 'Fizz' again. Because it is divisible by five.
        // If this number is divisible by three, we get 'buzz'.
        // If this number is divisible both five and three, we get 'FizzBuzz'.
        // If this number is not divisible by five  or three, we get the same number on the terminal.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else
            System.out.println(number);
    }
}

// In examples like this we should write the most specific conditions on the top and the most generic ones on the bottom.
// So in this example we displace the condition in line 22 and put it on the top as first condition.