//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Math. // In Java we have this Math class that is defined in 'java.lang' package. So it's always there, we don't need to explicitly import it.
              // And this class has a number of useful methods. We will look at the 'round' method first as follows:
        int result = Math.round(1.1F); // With this method we can round a floating point number to a whole number.
                      // As we can see when we type dot operator after Math class, this method is overloaded which means it's implemented twice.
                      // So we pass 1.1 as a float to this method. And we store the result in an integer.
        System.out.println(result);

        // Another useful method is 'ceil' which returns smallest integer that is greater than or equal to this number.
        // So the ceiling of 1.1 is 2. Let's see that in an example.

        // int output = Math.ceil(1.1); // Now here we have a compilation error. Because this method returns a double, but we're storing the output in an integer.
                                     // So here we need to explicitly cast the right side of the equation to an integer as follows:
        int output = (int) Math.ceil(1.1);
        System.out.println("Value of output : " + output);

        // Another useful method is 'Floor'. So the floor of a number is the largest integer that is smaller or equal to this number.

        int result2 = (int)Math.floor(1.1F); // In this case the floor of 1.1 is going to be 1.
        System.out.println("Value of result2 : " + result2);

        // Another useful method is 'max' which returns the greater of two values.
        // And once again this method is overloaded as we can see after using dot operator after typing Math class.

        int result3 = (int) Math.max(2,5);
        System.out.println("Greater value is : " + result3);

        // Similar to this max method, we have 'min' method. It is pretty straightforward. It returns the smallest of two values.
        int result4 = (int) Math.min(2,5);
        System.out.println("Smallest value is : "+ result4);

        // Another useful method is 'random'. It's used for generating a random value between 0 and 1. Let's see this.
        // int result5 = Math.random(); // Here, we have a compilation error because this method returns a double. So we change the type of variable to double.
        double result5 = Math.random();
        System.out.println(result5); // Every time we run this program we get a different number. And this number is a floating point number between 0 and 1.
        // Now what if we want a number between 0 and 100 instead of between 0 and 1 ?
        // We simply multiply the method by 100. As follows:
        double result6 = Math.random() * 100;
        System.out.println("Result6 : " + result6);

        // If we don't want the digits after the decimal point in random methods, we can either round the number or cast it to an integer. Let's see that in an example:
        // So we can call Math.round and pass it the result of this expression which is (Math.random() * 100).
        double result7 = Math.round(Math.random() * 100);
        System.out.println("Result7 : " + result7);

        // In last example we still have fraction which is '.0' after the actual number. So we can change the type to an int. After doing this we get a compilation error
        // because the round method returns a long but we have declared an integer.
        // This is one of those cases where implicit casting cannot happen because we have a value that is represented in 8 bytes of memory and we want to store that in a
        // variable that has only 4 bytes of memory. So implicit casting doesn't work.
        // But we can use explicit casting because we know the result of this expression which is here 'Math.round(Math.random() * 100)' is a number between 0 and 100.
        // So we can definitely store it in an integer as follows;

        int result8 = (int)Math.round(Math.random() * 100);
        System.out.println("Result8 : " + result8);

        // What if we don't use the 'round' method in the last example ? Let's see what happens.
        // We're going to remove the 'call to the round method'. And simply apply this '(int)' casting again.

        // int result9 = (int) Math.random() * 100;
        // System.out.println("Result9 : " + result9); // Every time we run this program we get zero. Because we are applying this (int) casting to the result of the random
                                                    // method call 'Math.random()', not the entire expression which is 'Math.random() * 100'.
                                                    // As we saw earlier every time we call 'random method', it generates a number between 0 and 100.
                                                    // So when we cast that number to an integer, we will lose the fraction which is in Turkish 'kesir', we always get zero.
                                                    // And (zero times 100) equals zero. To solve this problem we need to wrap the expression 'Math.random() * 100' in parenthesis.
        int result9 = (int) (Math.random() * 100);
        System.out.println("Result9 :" + result9);


    }

}