import java.util.Scanner;
public class fizz {
    public static void main(String[] args){
        System.out.printf("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number%3==0 && number%5==0)
            System.out.printf("\nFizzBuzz");
        else if (number%5==0) {
            System.out.println("\nFizz");
        } else if (number%3==0) {
            System.out.printf("\nBuzz");
        }
        else
            System.out.println(number);
    }
}