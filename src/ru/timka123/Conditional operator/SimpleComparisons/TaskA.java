import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        if (first > second) {
            System.out.println(">");
        } else if (first < second) {
            System.out.println("<");
        } else if (first == second) {
            System.out.println("=");
        }
    }
}