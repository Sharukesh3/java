import java.util.Scanner;

public class palendrome {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        scanner.close();
        boolean falg = true;
        for (int i=0;i<x.length()/2;i++)
        {
            if (x.charAt(i) != x.charAt(x.length()-i-1))
            {
                falg = false;
            }
        }
        if (falg == false)
        {
            System.out.println("Not a palendrome");
        }
        else 
        {
            System.out.println("It is a palendrome");
        }
    }
}
