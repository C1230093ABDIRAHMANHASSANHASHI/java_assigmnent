import java.util.Scanner;

public class primeNUmb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i, isPrime = 1;

        System.out.print("enter the number: ");
        num = input.nextInt();

        if (num <= 1) {
            isPrime = 0;
        }

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = 0;
                break;
            }
        }

        if (isPrime == 1) {
            System.out.println(num + " it'sPrime Number.");
        } else {
            System.out.println(num + " it's  Not Prime Number .");
        }

    }
}
