public class ForEachLoop {
    // for each loop mainly used to fetch the values from a collection like Array
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};

        // for each loop
        System.err.println("This is for each loop: ");
        for (int b : a){
            System.out.print(b+" ");
        }

        // for loop
        System.err.println("\nThis is for loop: ");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
