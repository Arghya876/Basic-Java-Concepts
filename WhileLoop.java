// While Loop is a Pre Test Loop

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to display its multiples up to 10: ");
        int number = sc.nextInt();
        sc.close();

        int i = 1; 

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }
}
