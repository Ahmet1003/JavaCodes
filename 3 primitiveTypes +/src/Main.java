//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte age = 30; // We declared this variable in type byte. Because it takes less space in memory.
        int viewCouunts = 123456789; // We can use underline between every three digits to separate the number.
        int viewCouunts1 = 3_123_456_789; // First, we defined this variable in int type. But once it overflow the border it gives us an error. So we change the type to long.
        long viewCouunts2 = 3_123_456_789; // Here, we still get the same error. Because Java compiler sees this value as an integer. And it thinks this value is too large for an integer. So we add an 'L' or 'l' end of the value.
        long viewCouunts3 = 3_123_456_789L;
        float price = 10.99F; // Even though we declared the variable in float, by default Java sees these numbers with a decimal point as double. We use 'f' or 'F' to solve this error as we solve the same error in integer type.
        char letter = 'A';
        boolean isEligible = true;

        // In these example we used primitive types to store simple values such as numbers, boolean values, single characters.
    }

}