import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 10 == 0) {
            System.out.println(number / 10);
        } else {
            System.out.println(number / 10 + 1);
        }
    }
}
