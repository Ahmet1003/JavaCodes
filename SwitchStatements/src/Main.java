//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // We use switch statements to execute different parts of code depending on the value of an expression. It's similar to if statements.
        // Let's check it with a program that checks the role of the current user. And then we're going to print different messages.
        // Or we give them different features depending on their role.

        String role = "Admin";

        switch (role) {
            case "admin" :
                System.out.println("You are an admin");
                break;
            case "moderator" :
                System.out.println("You are a moderator");
                break;
            default : // We do not need to use 'break' statement because we're at the end of the switch block. So we will automatically jump out of the switch block.
                      // In contrast, if we didn't use the break statement, Java will continue executing these other lines. So if the role is admin Java; first it will execute
                      // this line and, then it will jump to the next case block. It will execute the other line and then after it executes the break stetement, it will jump out
                      // of this switch block.
                System.out.println("You are a guest");
        }
    }
}