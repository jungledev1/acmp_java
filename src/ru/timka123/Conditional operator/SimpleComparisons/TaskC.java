import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int b = first / 1000;
        int c = first % 1000;
        if (b / 100 + (b / 10) % 10 + b % 10 == c / 100 + (c / 10) % 10 + c % 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}