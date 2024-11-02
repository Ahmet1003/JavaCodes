import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // In Java we have 'Scanner' class defined in 'java.util' package. We import this class.
        // Scanner scanner = new Scanner(); // We created a scanner object. Inside this parenthesis we need to specify where we're going to read data from.
                                         // Are we going to read it from the terminal window or are we going to read it from a file or etc.
                                         // To work with the terminal window we type 'System.in' in the parenthesis. This is one of the fields in the 'System class'.
                                         // A field is like a variable that we define in a class.
        Scanner scanner = new Scanner(System.in);
        // Now this object has a bunch of methods for reading data and all these methods start with 'next'.
        // For example we have nextByte() for reading a byte, we have nextLine() for reading a line, we have nextBoolean() for reading a boolean and so on.
        // So here let's call the 'nextByte()' method and see what we get. This method returns a byte value so we can store it in a byte variable. And let's say
        // someone's age.
        // byte age = scanner.nextByte();
        // System.out.println("You are " + age);  // Here, we are concatenating a string with a byte. And in this scenario we're going to have implicit casting or implicit
                                              // type conversion. So Java will automatically convert this byte variable (here which is 'age') in this example to a string.
                                              // So they can be added together.
        // But this program is pretty boring. Let's add a label here and ask the user to type something.
        // Before reading data, we are going to call the println() method. (I am creating a new object to show it clearly)
        // *** And I am making the previous program a comment line to see the new program clearly.

         Scanner scanner1 = new Scanner(System.in);
         // System.out.println("Age : ");
         System.out.print("Age : ");
         byte age1 = scanner1.nextByte();
         System.out.println("You are : " + age1); // When we run this program the number we type will appear on the next line. This is because the println() method adds a new line
                                                 // after the label 'Age :'. To solve this issue we call the 'print()' method. As we can see above. I made the println method a comment line.

        // What if we type a floating point number like 20.1 ? Answer : WE get an exception.
        // Because this 'nextByte()' method can only parse byte values.
        // If we want to get a floating point number we need to call 'nextFloat()' or 'nextDouble()' methods. As follows;

        // float age2 = scanner1.nextFloat();
        // double age3 = scanner1.nextDouble();

        // What if we want to read a string ? We don't have 'nextString()'. Instead we have 'next()' and 'nextLine()'.
        // For example;

        // *** To run this program I made the previous lines a comment line.

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scanner2.next();
        System.out.println("You are " + name);

        // Now let's type our lastname too.
        // But we will not get the lastname. Here's the reason. Our name and lastname are called 'tokens'.
        // Every time we called the 'next()' method, it reads one token. And when we type name and lastname, we type two tokens. We need to call 'next()' method two times to
        // get the full name. The first time we call it returns name, second time we call it, it returns the lastname. Then we need to combine these two methods together.
        // This is not ideal.

        // So that's when we use 'nextLine()' method. With this method we get the interline that the user enters. No matter how many spaces or tabs are there.
        // Let's take a look.

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Name : ");
        String name2 = scanner3.nextLine().trim();
        System.out.println("You are" + name2);

        // Now what if we type a few spaces before our name ? The result will be appeared a little bit odd.
        // In this case we use the 'trim()' method. With trim() method we can get rid of all these white spaces(spaces) before our name or after any string.
        // So this nextLine() method returns a string that we are storing in the 'name2' variable. Just before storing, right after the 'nextLine()' method we can
        // use the dot operator ro access the members of this String object. So we call the 'trim()' method. And then store the result in this 'name2' variable.
        // We showed this 'trim()' method above.
        // Once again we are chaining multiple methods here like 'scanner3.nextLine().trim()'.
    }
}