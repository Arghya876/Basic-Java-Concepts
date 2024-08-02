import java.util.Scanner;
/*
    Arithmetic Operators: 
    1. + (Addition)
    2. - (Subtraction)
    3. * (Multiplication)
    4. / (Division)
    5. % (Modulus or Remainder)
 */
class arithmeticOperator {
    public static void main(String []arg){
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = sc.nextInt();
        sc.close();
        
        System.out.println("The Sum is: "+(num1+num2));
        System.out.println("The Subtraction is: "+(num1-num2));
        System.out.println("The Multiplication is: "+(num1*num2));
        System.out.println("The Division is: "+(num1/num2));
        System.out.println("The Remainder is: "+(num1%num2));
    }
}
