import java.util.Scanner;

public class TaskD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int f = Math.max(Math.max(first, second), third);
        int d = Math.min(Math.min(first, second), third);
        System.out.println(f - d);
    }
}