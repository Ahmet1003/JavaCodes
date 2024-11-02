//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // If statements are extremely important in Java. Because they allow us to build programs that can make decisions based on certain conditions.
        int temperature = 12;
        if (temperature > 30)
            System.out.println("It's a hot day\nDrink plenty of water");
         else if (temperature > 20 && temperature < 30 )  // Here, we have not added the braces which is '{}'. Because we have a single statement.
             // So braces are only required if we have multiple statements. This is a little bit controversial. Some people believe we should always
             // have to add braces whether we have a single statement or not. But actually this creates unnecessary noise in the code.
            System.out.println("It's a nice day");
        else {
            System.out.println("It's cold");
        }
    }
}