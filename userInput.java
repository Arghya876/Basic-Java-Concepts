import java.util.Scanner;

/* 
    Scanner Class Methods:
    1. nextLine(); // String
    2. nextInt(); // Integer
    3. nextDouble(); // double
    4. nextFloat(); // float
    5. nextBoolean(); // True or False
*/
class userInput {
    public static void main(String[] args) {
        int intNum;
        double doubleNum;
        boolean boolNum;
        String strNum;
        float floatNum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        intNum = sc.nextInt();
        System.out.print("Enter a double: ");
        doubleNum = sc.nextDouble();
        System.out.print("Enter a boolean: ");
        boolNum = sc.nextBoolean();

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter a string: ");
        strNum = sc.nextLine();
        System.out.print("Enter a float: ");
        floatNum = sc.nextFloat();
        
        sc.close();

        // Output the entered values to verify correctness
        System.out.println("Integer entered: " + intNum);
        System.out.println("Double entered: " + doubleNum);
        System.out.println("Boolean entered: " + boolNum);
        System.out.println("String entered: " + strNum);
        System.out.println("Float entered: " + floatNum);
    }
}
