import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact =1;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        while (n>1) {
            fact = fact * n;
            n = n-1;
        }
        System.out.println(fact);
    }
}
