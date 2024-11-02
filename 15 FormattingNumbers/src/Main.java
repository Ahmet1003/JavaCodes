import java.text.NumberFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Whenever we work with numbers, we need to format them as currency values.
        // 1234567 >> For example we might have number like this. Imagine this is the price of a product. To display this to the user,
        // we want to add a $ sign at the beginning of the number like this $1234567. And we separate every three digits with a comma.

        // 0.1 >> Or we might have a number like this. And we want to represent this as a percentage value. So instead of 0.1, we want to display 10%.

        // NumberFormat  // We have this 'NumberFormat' class defined in 'java.text' package. In this package we have a lot of classes for handling text,
                     // dates, numbers and so on. When we press ENTER it's imported on the top.

        // NumberFormat currency = new NumberFormat(); // We want to declare a variable as 'currency'. Now we want to instantiate(belirli bir sınıfta nesne oluşturmak) this by typing
                                // 'new NumberFormat()' on the right side of the equation.

        // However, we get a compilation error. 'NumberFormat is abstract; it cannot be instantiated'. So in Java we have a concept of abstract classes. So some classes are abstract.
        // And they are basically like a half-baked cake. We cannot use the 'new' operator to create an instance of them.
        // We will see what abstract classes are and why they exist later.
        // So, for now remember that we cannot create an instance of the 'NumberFormat' class because it's abstract.
        // Since, we make the code above 'NumberFormat currency = new NumberFormat();' a comment line.
        // So here, there is another way.

        // This 'NumberFormat' class has a bunch of methods that starts with 'get'.
        // For example we have 'getCurrencyInstance' method. When we call this method it will create an instance of the NumberFormat class and return it.
        // So instead of using 'new' operator, we are going to use this method here.
        // This is what we call a 'Factory Method'. Because it's like a real factory. It creates new objects.

        NumberFormat currency = NumberFormat.getCurrencyInstance(); // We get the return value and store it in a variable of type of 'NumberFormat' and named 'currency'.
        // So when we look at the code above, on the right of the assignment operator '=', we're calling the 'getCurrencyInstance' method. We get the result which is a 'NumberFormat'
        // object and store it in this 'currency' variable.

        // currency.format(); // This object has a method for formatting values. Once again this method is overloaded because it's implemented for multiple times.
                           // We will call this 'format' method and pass a value like '1234567.891'. So we have three digits after decimal point.
                           // Now this method will return a string representation of this number formatted as a currency.
                           // So let's get that and store it in a string variable.
        String result = currency.format(1234567.891);
        System.out.println(result);

        // We have another method for formatting a number as a percent and that is 'get.PercentInstance' as follows;
        // NumberFormat percent = NumberFormat.getPercentInstance();

        // We could rename the name of the variable above and did our work easily. To rename the variable that is already defined, we don't change it manually because there are multiple
        // references to this variable. If we try to change it, other references will not be updated.
        // So would right click on the name of the variable and see the 'Refactor' menu. And here we have 'Rename' option. After selecting Rename option we change the first name, and the
        // other references will be updated automatically too.

        // Now we will use the code in line 43 and make it a comment line.
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);

        // After we run the code like this, there is actually a cool technique.
        // We could have written the code above like this;
        // In this program we don't really need the 'percent' object because we have used it in a single place.
        // It would make sense to have this as a separate variable if we have multiple references to it.
        // So, we can completely get rid of the 'percent' object.
        // We're basically calling this method of the NumberFormat class 'NumberFormat.getPercentInstance();'. As we know this method returns a NumberFormat object.
        // So, right after calling this 'NumberFormat.getPercentInstance()' method, we can use the 'dot operator' to access the methods or the members of the NumberFormat objects. As follows;

        NumberFormat.getPercentInstance().format(0.1); // So here we call the format method straight away and pass our value.
        // This is what we call 'Method chaining'. We're chaining multiple methods together. Now this returns a string so we can store it in another variable called result3.
        // We cut the expression of 'NumberFormat.getPercentInstance().format(0.1);' and put it on the right side of assignment operator after defined result3.
        // As follows;

        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);

    }
}