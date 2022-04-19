import java.util.Scanner;
 
public class TaskD {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first = number % 10;
        int second = (number % 100) / 10;
        int third = number / 100;
        System.out.println(first + second + third);
 
    }
}
