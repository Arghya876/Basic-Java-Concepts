/*
Type Casting: Converting one datatype to another datatype is called type casting

There are two types of type casting:
    1. Implicit Type Casting: It is a type of casting where the compiler automatically performs the casting. To convert the small datatype
    in to the large datatype.

    2. Explicit Type Casting: It is a type of casting where the programmer explicitly performs the casting. To convert the large dattype 
    in to the small datatype.
 */
class typeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting 
        int a = 10; // 4 Bytes
        double b = a; // 8 Bytes
        System.out.println("Value of b: "+b); 

        // Explicite Type Casting
        double c = 10.5; // 8 Bytes
        int d = (int)c; // 4 Bytes
        System.out.println("Value of d: "+d);
    }
}
