import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 0) {
            System.out.println("only positive numbers");
        }
        if (n == 1) {
            System.out.println("pleas dont even start");
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("nie pierwsza");
                return;
            }
        }
        System.out.println("pierwsza");
    }
}
