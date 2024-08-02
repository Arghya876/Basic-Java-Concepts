class helloWorld {
    public static void main(String []arg){
        System.out.println("Hello World");
    }
}
/*
    1. Class: The main building blocks of Java Program. Java file generally contains one public class with the same name
    as the file. Here, the class keyword declare the class.

    2. Methods: Functions defined within classes to perform actions.

    3. Main Method: The entry point of a Java application.

    4. public: An access modifier that means the method is accessible from anywhere.

    5. static: Indicates that this method belongs to the class, rather than instances of the class. This allows the java runtime
    to call this method without creating an instance of the class.

    6. void: The return type of the method. Void means the method does not return any value.

    7. main: The name of the method. This is the entry point of any Java application. 

    8. String [] arg: The parameter of the main method. It is an array of string objects and allows the program to accept command-line argoment.

    9. System: A final class in the java.lang package that contains several usefull class fields and methods. One of this fields is out,
    which is a static member of the System class.

    10. out: A static member of the System class, which is an instance of printstream class. It is used to print text to the console.

    11. println: A method of the printstream class, used to point a line of text to the console. It appends a newline character at the end.

 */