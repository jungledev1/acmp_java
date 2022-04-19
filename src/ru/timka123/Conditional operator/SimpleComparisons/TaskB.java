import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        if (first * second == third) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}