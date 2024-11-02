import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // We use arrays to store a list of items, or like a list of numbers, a list of people, or a list of messages. Let's see how we use arrays.

        int number =  1; // We want to convert this to an integer array.
                         // Right after 'int' we add square brackets at the left of the equation. At the right of the equation we use 'new' operator because arrays are reference types.
                         // Then we repeat the type 'int' one more time.
        int [] numbers = new int[5]; // In here the square brackets that we specify is the size or length of this array.

        // We can access individual items in this array using an index. As following;

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers); // The reason we get a weird result from this code is, by default when we print an array Java returns the string whcih is calculated based on the address of this object on memory.
                                     // How can we see the actual items in this array ?
                                     // We have a class whose name is Arrays. This class is defined in java.util package. Once we select Arrays 'java.util.Array' class is going to be imported to this project.
                                     // After that, we use dot operator to access the members of the class. As following;

        Arrays.toString(numbers);   // Here we have a method called 'toString'. After typing this method we see that this method is implemented multiple times. This is what we call 'method overloading'.
                                    // This piece of code will return the string representation of the array. So we cut it and paste into the print method like this. >>System.out.println
        System.out.println(Arrays.toString(numbers));


        // Above, the syntax we used is an older syntax. There is a newer wat to initialize an array if we know the items ahead of time like in this case.
        // We will define the array as following;

        int[] numbers2 = { 2, 3, 4, 1, 7 };
        //numbers2.length;   // This returns the number of items in this array. Let's print it using 'print' method.
        System.out.println(numbers2.length);

        // Note : Arrays have fixed lengths.
        // The last array was not sorted. The numbers of that array were in some kind of random order. We can easily sort this array using the 'sort' method.
        int numbers3 [] = {1, 5, 8, 4, 6};
        Arrays.sort(numbers3);  // Once again, we can see this method is overloaded because it is implemented with different parameter types.
        System.out.println(Arrays.toString(numbers3));
    }

}