
    import java.util.*;
    import java.util.function.Predicate;
    import java.util.stream.Collectors;
    
    public class Task124 {
        public static void main(String[] args) {
          
            List<Integer> numbers = Arrays.asList(-13, 2, 1, -4, 5, 12, -7, 18, 9, 10);
    
            Predicate<Integer> isEven = n -> n % 2 == 0;
            Predicate<Integer> isPositive = n -> n > 0;
            Predicate<Integer> isGreaterThan10 = n -> n > 10;
    
            List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
            List<Integer> positiveNumbers = numbers.stream().filter(isPositive).collect(Collectors.toList());
            List<Integer> greaterThan10 = numbers.stream().filter(isGreaterThan10).collect(Collectors.toList());
    
            System.out.println("Even numbers: " + evenNumbers);
            System.out.println("Positive numbers: " + positiveNumbers);
            System.out.println("Numbers greater than 10: " + greaterThan10);
        }
    } 
