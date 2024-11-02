//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String message = new String("HelloWorld"); // We do not have an import statement to import the 'java.lang' package or import the String class. Because this package is automatically imported.
                   // So we can use any classes that are defined in this package.
                    // Because this is a reference type we should instantiate this variable which is 'message' using the 'new' operator.
                    // Warning : The code above warns us that the 'new String'. Because in Java there is shorter way initialize string variables.
                    // Instead ıf using the 'new' operator we simply set the message to what we want to say. Here the message is "Hello World".
        String message = "Hello World";
                    // Although this look like a primitive type because we are not using the 'new' operator. But this is just a shorthand to initialize a string valuable.
                    // IMPORTANT : Strings are reference type in Java.
        System.out.println(message);

        // We can also concatenate or join a string with another one using '+' operator.

        String message2 = "Hello World" + "I am the Kindest human in the world.";
        System.out.println(message2);

        // Because string is a class it has members that we can access using the dot operator. Let's see.

        String message3 = "Hello World" + "I am the Kindest human in the world.";
        //message3.endsWith(".");
        System.out.println(message3.endsWith(".")); // This 'endsWith' method returns a boolean value which can be true or false.
        System.out.println(message3.startsWith("H"));
        System.out.println(message3.length());
        System.out.println(message3.indexOf("sky")); // This returns index of the first occurrence of the character or the string we pass here in double-quotes.
        System.out.println(message3.replace(".", "!")); // Here, target and replacement are parameters; while the "." and "!" are arguments.
        System.out.println(message3); // We printed the original message3 here to show that our original message was not changed. It is because the strings are immutable(cannot change) in Java.
        System.out.println(message3.toLowerCase());
        System.out.println(message3.toUpperCase());
        String message4 = "  Hello World   ";
        System.out.println(message4);
        System.out.println(message4.trim()); // With this method we can get rid of extra white spaces that can be at the beginning or end of a string.

    }
}