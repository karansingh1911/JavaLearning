
@FunctionalInterface
interface Add {

    // till java 7, public abstract method were only allowed - only one
    // from java 8, default and static methods are allowed + abstract method
    public abstract int sum(int a, int b);
}

public class LambdaExpression {

    // public static int sum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }
    public static void main(String[] args) {
        Add add = (a, b) -> {
            return (a + b);
        };

    }

}

// Anonymous function with no name, no return type and no modifier
// Steps to make any function lambda expression: 1. Remove identifier 2. Remove return type 3. Remove method name 4. Place arrow
// For this to work the method must belong to the functional Interface
// Benefits of Lambda Expression:
//1. To enable functional programming.
//2. JAR file size reduction.
//3. TO make code more readable, maintainable and concise.
//4. To enable parallel processing.
            //5. Elimination of shadow variables.
