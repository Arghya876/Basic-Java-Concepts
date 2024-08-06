class Variable {
    static int b = 20; // Static Variable

    int c = 30; // Instance Variable
    public static void main(String[] args) {

        int a = 10; // Local Variable

        System.out.println(a);

        System.out.println(Variable.b); // We can directly use the Static Variable by useing the class name

        Variable ref = new Variable();  // We can't use Instance Variable without creating an object
        System.out.println(ref.c);
    }    
}

/*
    There are mainly three types of variables in Java.
    
    1. Local Variables: A variable which is defined inside a Method, Constructor or Block and they are only accessible within that 
    Method, Constructor or Block.

    2. Instance Variable: A variable which is defined inside a class but outside any Method, Constructor or Block and they are unique
    to each instance of a class

    3. Static Variable: A variable which is defined with the Static Keyword inside a class but outside any Method, Constructor or Block
    and they are shared by all instances of a class.

*/
