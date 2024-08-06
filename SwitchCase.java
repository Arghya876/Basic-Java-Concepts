import java.util.Scanner;

class SwitchCase{
    public static void main(String[] args) {
        double num1, num2;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter 2nd Number: ");
        num2 = sc.nextDouble();
        System.out.print("Enter Operator (+, -, *, /): ");
        op = sc.next().charAt(0);

        sc.close();

        switch (op) {
            case '+':
                System.out.println("The Sum is: "+ (num1+num2));
                break;
            case '-':
                System.out.println("The Difference is: "+ (num1-num2));
                break;
            case '*':
                System.out.println("The Product is: "+ (num1*num2));
                break;
            case '/':
            if(num2 != 0){
                System.out.println("The Quotient is: "+ (num1/num2));
            }
            else{
                System.out.println("Error! Division by zero is not allowed.");
            }
            default:
                System.out.println("Invalid Operator");
                break;
        }        
    }
}
