public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max_between_two = (a > b) ? a : b;
        int max_between_three = (a>b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max_between_two);
        System.out.println(max_between_three);
    }
}
