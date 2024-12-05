import java.util.Scanner;

public class NumberReversal {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scan.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
	}
	public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int rem = num % 10;
            reversedNum = reversedNum * 10 + rem;
            num /= 10;
        }       
        return reversedNum;
    }

}
