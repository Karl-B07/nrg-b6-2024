public class Tasksheet114 {
    public static void main(String[] args){
        int check_number = 10;
            String message;
    for (int i = 1; i <= check_number; i++) {

        message = (i % 2 == 0) ? i + " even number" : i + " odd number";
            System.out.println(message);
        }
    }
}
