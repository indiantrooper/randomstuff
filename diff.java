public class diff {
    
    public static void main(String[] args) {
        // Declare two integer variables
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Add the variables
        int sum = num1 - num2;

        // Print the result
        System.out.println("The diff of " + num1 + " and " + num2 + " is " + sum + ".");
    }
}
