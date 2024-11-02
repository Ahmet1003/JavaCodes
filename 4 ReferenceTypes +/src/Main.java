import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // In this example, we are going to use reference types to store complex objects like date, mail message, etc.
        byte age = 30;
        //Date // Once we select this Date class, Intellij automatically adds 'import java.util.Date;' for us. Here, Date is a class and java.util is a package. In order to use a class from a different package, we need to import it.

        Date now = new Date(); // Here, we use 'new' operator to allocate memory for this variable. And this is one of the difference between the primitive and reference types.
                               // When declaring the primitive types such as int, byte, boolean,etc. we do not need to allocate memory. Memories allocated and released by Java Runtime Environment.
                               // But when dealing with reference types, we should always allocate memory.
                               // After using 'new' operator, we should repeat the name of class. After name of the class we use parenthesis.
                               // In this example the variable that we defined here which is 'now' is an instance of the Date class.
                               // These classes define template or blueprints for creating new objects, new instances.
                               // As another example, we can have a class called Human and we can objects like John, Bob, Mary and so on.
                               // So, an object is an instance of a class.
                               // These objects or these classes have members that we can access using the '.'(dot operator). As following;

        //now.getTime();

                               // At this point we need to say that primitive types do not have members.

        System.out.println();  // Here, instead of typing all these we can use a short cut. 'sout' and then pressing tab, we will get the same result.
        System.out.println(now);

    }
}