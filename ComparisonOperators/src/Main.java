//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // We use the comparison operators to compare primitive values.
        int x = 1;
        int y = 2;

        System.out.println(x == y); // Here we have two equal signs. This is the 'Equality Operator' which is '=='. We shouldn't confuse this with the single equal sign that
                                    // we use for assignment. So, two equal signs represents the 'Equality Operator'.
                                    // When we run the program above, we get 'true'. Because these values are equal.
                                    // This 'x==y' expression is a boolean expression.

                                    // We also have 'Inequality Operator' which is ''='.
        System.out.println(x != y); // When we run this program we get 'false'. Because x and y are equal.

                                    // We also have 'Greater than' which is >
                                    // We also have 'Greater Than or Equal To' which is >=;

                                    // We also have 'Less Than or Equal To' which is <;
                                    // We also have 'Less Than or Equal To' which is <=. If we change the value of y to two, and use this operator, we get 'true'.
        System.out.println(x <= y);
    }
}