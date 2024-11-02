//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // There are times that we don't want the value of a variable to change. For example;

        float pi = 3.14F; // We add at the end of value to represent this as float because by default Java compiler sees this number as a decimal.
                          // We know that we use pi to calculate the area of a circle. But what if before we calculate the area of a circle we type pi = 1 ? Then all our calculations are gonna get messed up.
                          // We do not want this to happen. That's when we use constants.
                          // Here's how we use constants:
        final float pi2 = 3.14f; // Here, Java compiler will treat this as a constant. So once we initialize this, we cannot change this value later on.
        pi2 = 1; // For example here we get an error says that 'Cannot assign a value to final variable 'pi''.
                 // So pi2 is a final variable or a constant.

        // By convention we use all capital letters to name constants. So in this example it should be 'PI'. As follows;

        final float PI = 3.14F;
    }
}