class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Logical AND Operator: ");
        System.out.println((10 > 5) && (2 > 1)); // true && true => true
        System.out.println((10 > 5) && (2 < 1)); // true && false => false
        System.out.println(10 < 5); // false && false => false

        System.out.println("Logical OR Operator: ");
        System.out.println(10 > 5); // true || true => true
        System.out.println(10 > 5); // true || false => true
        System.out.println((10 < 5) || (2 < 1)); // false || false => false

        System.out.println("Logical NOT Operator: ");
        System.out.println(!(10 > 5)); // !true => false
        System.out.println(!(10 < 5)); // !false => true
    }
}
