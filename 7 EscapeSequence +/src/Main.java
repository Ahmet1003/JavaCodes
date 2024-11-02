//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // There are times that we want to include special characters in our strings like a tab, or a new line, or a backslash, or double quotes.

        String message = "Hello Ahmet"; // Let's say we want to surround Ahmet with double quotes. To do this we add backslash before and after the new double quotes.
                                          // Double quote is one those special characters that we should be aware of.
        String message1 = "Hello \"Ahmet\"";

                                          // Another special character is backslash.
        // Example: c: \Windows\...
        String message2 = "c:\\Windows\\..."; // Even though we have two backslashes in our code we actually see one backslash in terminal window.
                                          // Another escape sequence is '\n'. And we use that to add a new line to our string.
        String message3 = "c:\nWindows\\...";
                                          // Also we can add a tab in our string using '\t'.
        String message4 = "c:\t\tWindows\\..."; // The more we add \t in our code the more we get tab n the result.

        System.out.println(message4);

        // There are a few more escape sequences but they are hardly used. So we skip those ones. It is enough to know the one that we used here.
    }
}