import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit"))      // If this condition is true then we're going to print the input.
                System.out.println(input);
        } */
//-------------------------------------
        /*Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit"))
                break;              // If the user types 'quit' we are going to break out of the loop. When Java sees the break statement, it will ignore everything else after. And it will terminate the loop.
            System.out.println(input);
        }*/
//-----------------------------------

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}

// When we run this program we enter a couple of numbers. These numbers get echoed back.
// But if we type 'quit', the program terminates but the word 'quit' also echoed back. This is weird.
// One way to solve this problem, is to check the input before printing it.


// Another way to solve this problem is to use 'break' statement. Before using break statement, we reverse this condition '(!input.equals("quit"))'. So if the user types 'quit' we can immediately jump out of the loop.
// ** To show this way to solve the problem I am going to make the whole block of code above a comment line.


// We also have the 'continuous' statement that moves control to the beginning of a loop.
// Let's imagine if the user types 'pass', we don't want to echo that, but also we don't want to terminate the loop. We want to ask the user to try one more time.
// After we read the input, we can check to see if input equals to 'pass'. Right after that we use 'Continue' statement.
// When Java sees this, it will move control to the beginning of the loop. So all the other statements are going to get ignored. And what the user types is not going to get printed on the terminal.



// To recap; 'break statement' terminates a loop, 'continue statement' moves control to the beginning of a loop.
