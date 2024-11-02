//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // We have the income variable. Imagine this is the income of our customers. Depending on their income, we want to put these customers in different classes.
        // If their income is more than 100.000$, we will put them in the first class. Otherwise, we will put them in the economy class.
        // Here's one way to implement this scenario.

        // int income = 120_000;
        // String className;
        /* if (income > 100_000) {
            className = "First";
        } */
        /*else
            className = "Economy"; */
        // So far, this code looks very amateurish. A professional programmer doesn't write code like this.
        // So one way to simplify this is to give this variable an initial value. As follows;

        /*int income = 120_000;
        String className = "Economy"; // We assume they are in the economy class. And then we check the condition. So with this we can get rid of 'else'.
        if (income > 100_000) {
            className = "First";
        }*/

        // We're going to use 'ternary operator' to simplify this code. As follows;
        // So we are going to write the code one more time below.

        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy"; // This question mark and colon is the ternary operator here. Ternary operator has three pieces;
                                                                    // first we have a condition which is 'income > 100_000'. If the condition is true the value 'First'
                                                                    // will be returned and assigned to our 'className' variable. Otherwise ':' the other value 'Economy'
                                                                    // will be returned.
                                                                    // Now we can completely get rid of this 'if statement'.



    }
}