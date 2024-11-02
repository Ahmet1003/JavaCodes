//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // int income = 120_000;
        // boolean hasHighIncome = true;
        /*if (income > 100_000) { // If the income is more than 100.000 $, we will set this 'hasHighIncome' to true. Otherwise, we set this to false.
           hasHighIncome = true; // This variable that we defined here is scoped to this block. It's only available here. We cannot access it outside of this block.
        }*/
        /*else
            hasHighIncome = false;
        System.out.println(hasHighIncome);*/ // As we can see here we got a compilation error. Because this variable is not available outside of the block in which it's declared.
                                           // To solve this problem we can declare this 'boolean hasHighIncome = true' variable outside of this block.
                                            // We do not need this println method anymore.
        // So this is one way to implement this scenario.
        // But this code looks very amateurish.
        // A professional programmer doesn't write code like this. Let's improve it step by step.
        // One way to improve this code is to give the boolean variable an initial value. For example, we set it to 'false' initially. And then we implement the first 'if' condition.
        // So if the income is more than 100.000$ then we set this 'hasHighIncome' variable to true. With this, we no longer need the 'else' clause.

        // This is one improvement. But it is still not ideal.
        // In situations like this we can completely get rid of the if statement.

        // Instead of hard-coding false here >> 'boolean hasHighIncome = true', we type our expression on the right side of the equation. As follows;

        int income = 120_000;
        boolean hasHighIncome = income > 100_000; // If this boolean expression 'income > 100_000' evaluates to true, this boolean variable 'hasHighIncome' is going to be true.
                                                  // Otherwise, it is going to be false.
        // So this is the simplest, the most elegant and the most professional way to implement this scenario.
    }
}