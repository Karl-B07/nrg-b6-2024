import java.util.*;
public class Task117 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>numbers = new ArrayList<>();
        System.out.println("Enter three number");
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        Collections.sort(numbers);
        System.out.println(numbers);
        String result = numbers.get(0).equals(numbers.get(2)) ? "All numbers are equal" : "Numbers are sorted";
        System.out.println(result);
    }
}