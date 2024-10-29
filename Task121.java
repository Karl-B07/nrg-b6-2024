import static java.lang.Math.*;
import java.util.*;
public class Task121{

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b); 
    }

    public static int floorDiv(int a, int b) {
        return Math.floorDiv(a, b); 
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input two number ");
	    int a = input.nextInt();
	    int b = input.nextInt();

        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + subtract(a, b));
        System.out.println("Product: " + multiply(a, b));
        System.out.println("Quotient: " + floorDiv(a, b));
    }
}