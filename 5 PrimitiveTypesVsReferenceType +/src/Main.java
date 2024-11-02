import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // Here, the result of y did not change. Because the variable x and y are completely independent of each other.

        // However, when we use a reference type, this behaviour is different.
        // Let's take a look at how it behaves when used reference type.

        Point point1 = new Point(1,1); // Here, we used Point class. And we passed the initial values for x and y.
        Point point2 = point1; // We set point2 to point1. After this, things get interesting.
                               // When Java Runtime Environment execute line 15,first it's going to allocate some memory to store this Point object.
        point1.x = 2;
        System.out.println(point2);

        // Reference types are copies by the references whereas primitive types are copied by their value (and these values are completely independent of each other.)
    }
}