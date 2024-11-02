//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         short x = 1;
         int y = x + 2; // Here, we are adding a short to an integer.
                        // Because we are dealing with two different types of values: One is a short(x), the other is an integer(y). One of these values should be converted
                        // to the other type so that they are equal. We have two bytes in a short variable. And we have four bytes in an integer variable.
                        // So, any values that we store in a short variable can also be stored in an integer variable.
                        // So when this piece of code get executed, first Java looks at the value of 'x' and sees that it is 1. Then it's going to allocate another variable
                        // (an anonymous variable) somewhere in memory-we don't know where that is- we don't know the name of that variable. It doesn't have a name it's anonymous.
                        // That variable is going to be an integer. Then Java is going to copy the value of x into that memory space. And then it will add these two numbers(here, these numbers are 'x and 2') together.
                        // This is what we call 'implicit casting'. That means 'automatic casting' or 'Automatic conversion'.
                        // Whenever we have a value and that value can be converted to a data type that is bigger, casting or(in other words) conversion happens implicitly(or automatically).
                        // So byte can be automatically converted to short. And short can be converted to integer. And integer can be converted to long. And long can be converted to float. And float can be converted to double.


        System.out.println(y);

                        // What about floating point numbers. Let's look at an example.
        double a = 1.1;
        double b = a + 2;
        System.out.println(b); // In this case we are dealing with a double and an integer. An integer is less precise than a double because in a double we can have digits after the decimal points.
                               // So Java is going to automatically cast this integer(which is '2') to a double so that would be '2.0'. And then 2.0 will be added to 1.1.

        // Now, what if we want y to be an integer ? So let's show it in an example.

        double d = 1.1;
        int e = (int)d + 2;  // In this example we do not care about the digits after the decimal points. We will see 3 on the terminal. But how should we do this ?
                        // This is where we should 'explicitly' cast the result. So we should cast 'e' to an integer. As in the example ((int)d + 2).
                        // We convert d to an integer so the result would be 1 without a decimal point. 1 will be added to 2. So e would be 3.
        System.out.println("Value of e : " + e);

        // Note: This explicit casting can only happen between compatible types. As we mentioned above;
        // byte > short > integer > long > float > double. All these types are compatible because they're all numbers.
        // But we cannot cast a string to a number.

        // In other words if m was a string as in the example below;

        String m = "1"; // We cannot cast m to an integer because they are not compatible.
                        // So how do we do this ?
                        // For all these primitive types that we have learned we have 'wrapper classes'.

        int n = Integer.parseInt(m) + 2; // So in Java we have class which is a reference type called integer.
                            // And in this Integer class we have a method called 'parseInt'. So this method takes a string and returns an integer.
                            // So integer is the wrapper class for the 'int primitive type'.
                            // We also have short wrapper class. And in this class we have method called 'parseShort'. And similarly it takes a string and return a short.
                            // Similarly, we have 'float', 'double' and the name of methods for each of these wrapper classes obviously change accordingly.
        System.out.println("Value of n : " + n);


        // Why all this matters ? Why should we parse or convert a string to a number to add it to something else ?
        // Well, pretty much in most frameworks, for building user interfaces whether you're building a desktop or a mobile application or web application, we always receive input
        // from the user as a string. So if we have form with a bunch of text boxes or dropdown list, almost always we get values as a string.
        // So that's why we need to convert these string to their numeric representation.
    }
}