// Do While Loop is a Post Test Loop

import java.util.Scanner;
public class DoWhileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number, i = 1;

        System.out.print("Enter a number to display its multiples up to 10: ");
        number = sc.nextInt();
        sc.close();

        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++; 
        } while (i <= 10);
    }
}
