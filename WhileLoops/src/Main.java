import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // While loops are very similar to for loops in terms of their functionality.
        // But they are different in terms of syntax.

        /* int i = 0; // First, we declare a loop variable. And initialize it to zero.
        while (i > 0) { // It means, while i is greater than zero.
            System.out.println("Hello World " + i);
            i--;
        }  */

        // For example; let's say we want to write a program and ask the user to continuously enter something until they type 'quit'.
        // The moment they type 'quit', we're going to terminate program.
        // In that situation, we don't know how many times the user is going to enter something.

        String input = "";
        Scanner scanner = new Scanner(System.in); // We use a scanner object to read something from the terminal.
                                                  // If we declare this Scanner object inside of the while loop, in every iteration we were going to create a new Scanner object.
                                                  // So if the user enters ten numbers, we were going to create ten Scanner objects in memory. This is unnecessary.
                                                  // And it's actually a bad practise. Because it's going to pollute our memory.
        while (!input.equals("quit")) { // We don't have a counter variable in this example. Instead, we want to check to see if the user entered 'quit' or not.
                                        // So we can declare a string called input. And initialize it to an empty string.
                                        // We used in while loop 'equals' method of string objects.
                                        // And we need to apply the 'NOT' operator so as long as the input does not equal to 'quit' we're going to continuously as the user to enter something.
                                        // Also, we're assuming that the user is typing everything in lower case. So if they type quit in uppercase or ant combinations of lowercase and uppercase characters, this logic((input.equals("quit"))) iis not going to work the way we want.
                                        // So right after reading something from the terminal, we're going to call 'toLowerCase' method of String objects to convert it to lowercase.
            System.out.print("Input: "); // Here, we print a label called 'Input'.
            input = scanner.next().toLowerCase(); // This will return a string. So we stored it in the input variable.
            System.out.println(input); // With this line, we echo back whatever the user enters.
        }


    }
}