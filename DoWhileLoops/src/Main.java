import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}
// Compared to the 'while loops', with while loops we check the condition '(!input.equals("quit"))' first. So if the condition is false the first time, this loop will never get executed.
// In contrast, with do-while loops, we check the condition last. So do-while loops always get executed at least once.(Even if the condition is false).
// That is the only difference between 'while' and 'do-while' loops.
// In reality most of the time we use 'while loops'.
// Do-while loops are rarely used.