import java.util.Scanner;
public class ifelseStatement {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        age = sc.nextInt();
        sc.close();

        if(age >= 18){
            System.out.println("You are Eligible to Vote");
        }
        else{
            System.out.println("You are not Eligible to Vote");
        }
        System.out.println("Thank You...");
    }
}
