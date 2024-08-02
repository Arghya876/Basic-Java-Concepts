class IncrDecrOperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); // 10
        System.out.println("Post Increment: "+ (a++)); // 10 (11)
        System.out.println("Pre Increment: "+ (++a)); // 12 (12)
        
        System.out.println("Post Decrement: "+ (a--)); // 12 (11)
        System.out.println("Pre Decrement: "+ (--a)); // 10
    }
}
