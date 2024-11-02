import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[5]; // Here we have a single dimensional array.
                                     // To convert this to a two-dimensional array we need to add another pair of square brackets. As follows,
        int [][] numbers2 = new int[2][3]; // Here we have two rows and three columns.
                                           // To access individual items in this array we need to supply two indexes. As follows;
        numbers2[0][0] = 1;
        System.out.println(Arrays.toString(numbers2)); // Once again we get weird string. Because here we are dealing with a multi-dimensional array.
                                     // To solve this problem we need to use another method in this class called 'deepToString'.
                                     // We use this for printing multidimensional arrays.
        System.out.println(Arrays.deepToString(numbers2));

        // We can also create a three-dimensional array. All we have to do is to add another pair of square brackets. As follows,
        int [][][] numbers3 = new int[1][2][3];

        // What about the curly brace syntax ? We can use this syntax too. Let's see how we use curly brace when defining a multidimensional arrays.

        int [][] numbers4 = { {1,2,3}, {4,5,6} }; // Here we got rid of the 'new' operator. Again we will have two rows and three columns in this array.
        System.out.println(Arrays.deepToString(numbers4));
    }
}