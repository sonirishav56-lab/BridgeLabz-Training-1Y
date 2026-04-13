import java.util.Scanner;

public class FriendlyPairr {

   
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumA = sumOfDivisors(a);
        int sumB = sumOfDivisors(b);

     
        if ((double)sumA / a == (double)sumB / b) {
            System.out.println("Yes, they are a friendly pair");
        } else {
            System.out.println("No, they are not a friendly pair");
        }
    }
}