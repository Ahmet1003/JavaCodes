//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // In Java we have the same arithmetic operators that we have in math. We have addition, subtraction, multiplication, division and modulus(which is the remainder of a division).
        // Let's look at a few examples.

        int result = 10 + 3;
        System.out.println(result); // We can also use the other operators. But division is an interesting one.

        int result1 = 10 / 3;
        System.out.println(result1); // It gives a result a whole number. In Java the division of two whole numbers is a whole number.
        // If we want to get a floating-point number we need to convert these numbers to a float or a double. Let's take a look:

        //int result2 = (double) 10 / (double) 3; // Now we get a compilation error because on the left side we declared an integer but on the right side the result of the expression is a double.
                                                // By the way an expression is a piece of code that produces a value.
                                                // To fix this problem we need to change 'int' on the left side to double as follows;
        double result2 = (double) 10 / (double) 3;
        System.out.println(result2);

        // We also have increment and decrement operators. As follows;

        int x = 1;
        x++;
        System.out.println("Value of x: " + x);

        // We can also use this increment or decrement operators as a postfix (like this : i++) or prefix(like this ++i). And we get the same result.
        // However if we use this on the right side of an assignment operator we get different result. Let take a look.

        int a = 1;
        int b = a++; // In this case because we have applied the increment operator as a postfix, first the value of a will get copied to b; so b will be 1 and then a will be incremented by 1.
        // Let's see the result.
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        // However if we apply this as a prefix, first m will be incremented by 1, so it will be 2. And then it will be copied to n. Let's see as follows;

        int m = 1;
        int n = ++m;
        System.out.println("Value of m : " + m);
        System.out.println("Value of n : " + n);

        // What if we want to increment the first variable by more than one. Let's see this as follows;

        int y = 1;
        int z = y + 2; // So here first we add two to y. The result will be three and three will be copied into y.

        // The other way to use the 'Augmented' or 'Compound' assignment operator. As follows;

        y += 2; // What we have on this line is exactly identical to what we have on line 46. As we can see this use is shorter. This is one of the augmented assignment operators.

        // We have the Augmented assignment operator for other arithmetic operators as follows;

        x -= 2; // This will reduce the value of x by 2.
        x /= 2; // This will divide the value of x by 2.
        x *= 2; // This will multiply the value of x by 2.








    }
}