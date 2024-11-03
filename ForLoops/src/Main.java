//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // There are times that we want to repeat one or more statement.
        // In Java we have a few different types of loops. First, we will look at the 'for loop'.
        // After typing the 'for' keyword followed by parenthesis, we write three things inside the parenthesis.
        // First we need to declare a loop or a ccounter variable. Quite often we use variables like i, j, k for loop counters.
        // Then we write the boolean expression that determines how many times this loops is going to be executed.
        // Finally, we increment i or j or k.

        String message = "Hello World ";
        int i = 0;
        for (i = 1; i < 5; i++){
            System.out.println(message + i);
        }
    }
}
// Let's explain how this code gets executed.
// When Java sees the for loop, first it execute the first statement which is 'i = 1'.
// Then Java evaluates the following condition which is 'i < 5'. Like 'is this condition true ?'
// If it's true then the control moves to next line and this line gets executed.
// And then the next iteration or at the end of this loop, the control moves to the increment statement which is 'i++'.
// So i is incremented by 1.
// Now we are at the beginning of the second iteration.
// Once again the condition 'i < 5' is evaluated. And once again the next line gets executed.
// Fast-forward, at the end of the fifth iteration, i will become 5; 5 is not less than 5. So the loop condition will be false. And control moves outside of this loop.
//
