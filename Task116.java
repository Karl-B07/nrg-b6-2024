import java.util.Scanner;
public class Task116{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a palindrome");
        String palindrome = scanner.nextLine();
                    
        StringBuilder reversed = new
        StringBuilder(palindrome).reverse();
                                
        String message;
        message = (palindrome.equals(reversed.toString())) ? "A palindrome" : "not a palindrome";
        System.out.println(message);
        System.out.println(""); 
        System.out.println("Do you want to continue? Yes/No");
                                                            
        while (scanner.next().equalsIgnoreCase("Yes")){
        scanner.nextLine();
    System.out.println("Enter a palindrome");
    String palindrome1 = scanner.nextLine();
                                                                                
    StringBuilder reversed1 = new
    StringBuilder(palindrome1).reverse();
                                                                                            
    String message1;
        message1 = (palindrome1.equals(reversed1.toString())) ? "A palindrome" : "not a palindrome";
        System.out.println(message1);
        System.out.println();
        System.out.println("Do you want to continue? Yes/No");
         }                                                                                                                               
    }
}