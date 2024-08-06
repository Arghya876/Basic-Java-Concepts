import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int number, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to display its multiples up to 10: ");
        number = sc.nextInt();
        sc.close();

        for(i=1; i<=10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
