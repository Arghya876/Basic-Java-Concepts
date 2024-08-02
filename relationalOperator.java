import java.util.Scanner;
/*
    Relational Operator:
    1. == (equal to)
    2. != (not equal to)
    3. > (greater than)
    4. < (Less than)
    5. >= (greater than or equal to)
    6. <= (less than or equal to)
 */
public class relationalOperator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = sc.nextInt();
        sc.close();

        System.out.println("Less Than <: "+(num1<num2));
        System.out.println("Greater Than >: "+(num1>num2));
        System.out.println("Less Equal <=: "+(num1<=num2));
        System.out.println("Greater Equal >=: "+(num1>=num2));
        System.out.println("Equal ==: "+(num1==num2));
        System.out.println("Not Equal !=: "+(num1!=num2));
    }
}
