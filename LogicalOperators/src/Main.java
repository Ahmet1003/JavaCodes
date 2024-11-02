//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // There are times that we want to combine multiple boolean expressions.
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // If both these conditions are true, the result of this boolean expression is going to be true.
                                                               // Otherwise, if at least one of these is false, the result will be false.
                                                               // We used 'AND' logical operator here.
                                                               // Java evaluates this 'temperature > 20 && temperature < 30;' expression from left to right.
                                                               // If first condition is true, Java checks the other condition if it's true or false.
                                                               // But if first condition is false, Java will ignore the other condition. And the result will be false.
        System.out.println(isWarm);

        // Let's look at another operator which is 'OR' operator.

        boolean hasHighIncome = false;
        boolean hasGoodCredit = false;
        // So let's say we're building an application for processing loans. We want to see if a new applicant is eligible for a loan or not.
        // So we declare another boolean below.

        boolean isEligible = hasHighIncome || hasGoodCredit;
        // So, here's the rule : An applicant is eligble if they have high income or good credit.
        // If one of these conditions is true, they are eligible.
        System.out.println(isEligible);

        // And we have another logical operator called 'NOT'. Let's see how it works. We're going to use it on the last example.
        boolean hasHighIncome2 = false;
        boolean hasGoodCredit2= false;
        boolean hasCriminalRecord = false;
        boolean isEligible2 = (hasHighIncome2 || hasGoodCredit2) && !hasCriminalRecord;

        // Here's the rule we want to implement. In order someone to be eligible for a loan, they should either have highIncome2 or goodCredit2 and they
        // should not have criminalRecord.
        // Let's see how we can implement this rule. We have implemented the first part.
        // They should either have highIncome or highCredit. Now we want to make sure that they don't have any criminalRecord.
        // So we need to combine the result of this 'hasHighIncome2 || hasGoodCredit2;' expression with this 'hasCriminalRecord = false;' boolean value using the 'AND' operator.
        // So first we wrap this 'hasHighIncome2 || hasGoodCredit2;' expression with parenthesis. Then we apply the AND operator
        // So we want to make sure they don't have criminalRecord. And this is where we use 'NOT' operator.
        // NOT operator will reverse the value of this 'boolean hasCriminalRecord' variable or expression.
        System.out.println(isEligible2);

    }
}