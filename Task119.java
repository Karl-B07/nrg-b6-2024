import java.util.*;
public class Task119{
	public int addNumbers(int a, int b) {
                return a + b;  
        }
        public int subtractNumbers(int a, int b){
                return a - b;
        }
        public int multiplyNumbers(int a, int b){
                return a * b;
        }
        public int divideNumbers(int a,int b){
                return a / b;
        }
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.println("input two number");
                  int a = input.nextInt();
                  int b = input.nextInt();
                Numbers numbers = new Numbers();

int add = numbers.addNumbers(a, b);
int subtract = numbers.subtractNumbers(a, b);
int multiply = numbers.multiplyNumbers(a, b);
int divide = numbers.divideNumbers(a, b);


//   String c = "difference";
// int result = a - b;
//int resultsum = a + b;
// double result1 = a / b;
System.out.println();
System.out.println("Sum " + add);
System.out.println("Difference "+ subtract);
System.out.println("Product "+ multiply);
        System.out.println("Qoutient "+ divide);
    }
}
