import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int first = k / n;
        int second = k % n;
        if (second > 0) {
            System.out.println(first + " " + second + " " + (n - second));
        } else {
            System.out.println(first + " " + second + " " + 0);
        }
    }
}
