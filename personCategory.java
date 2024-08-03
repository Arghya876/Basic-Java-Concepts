import java.util.Scanner;

public class personCategory {
    public static void main(String[] args) {
        int age;
        char gen;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your gender (M/F): ");
        gen = sc.next().charAt(0);
        
        sc.close();

        if(age>0){
            if(gen == 'M' || gen == 'm'){
                if(age < 18){
                    System.out.println("You are a boy");
                }
                else{
                    System.out.println("You are a man");
                }
            }
            else if(gen == 'F' || gen == 'f'){
                if(age < 18){
                    System.out.println("You are a girl");
                }
                else{
                    System.out.println("You are a woman");
                }    
            }
            else{
                System.out.println("Invalid gender");
            }
        }    
        else{
            System.out.println("Invalid age");
        }

    }
}
