public class Task120 {
    public static void main(String[] args) {
       int total = calculateParameters(4, 5, 10); 
       System.out.println("Total sum of all parameters: " + total);
    }
    
    public static int calculateParameters(int... numbers) {
        int nums = 0;
        for (int number : numbers) {
        int parameter = calculateParameters(number);
    System.out.println("Cumulative sum for " + number + ": " + parameter);
        nums += parameter;
     }
    
      return nums;
     }
    public static int calculateParameters(int n) {
       int sum = 0;
       for (int i = 1; i <= n; i++) {
       sum += i;
     }
      return sum;
     }
    }