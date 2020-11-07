import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Calculate the sum of the first 100 numbers higher than 0");
        System.out.println(Algorythms.getSumOfFirstNIntegers(100));

        System.out.println("2. Display the smallest number from an array of numbers");
        int[] numbersArray;
        numbersArray = Algorythms.setIntegersArray();
        System.out.println("Smallest number of the array is: " + Algorythms.getSmallestFromArray(numbersArray));

        System.out.println("3. Display the max digit from a number");
        System.out.println("Give the number: ");
        int number = scanner.nextInt();
        System.out.println("Max digit of the number is: " + Algorythms.getMaxDigit(number));

        System.out.println("4. Check if a number is palindrome");
        System.out.println("Give the number:");
        int nr = scanner.nextInt();
        if(Algorythms.isPalindrome(nr)){
            System.out.println(nr + " is a palindrome");
        } else{
            System.out.println(nr + " is not a palindrome");
        }

        System.out.println("5. Display all the prime numbers lower than a given number");
        System.out.println("Give the number: ");
        int num = scanner.nextInt();
        System.out.println("Prime numbers smaller than " + num + " are: " + Algorythms.primeNumbersSmallerThan(num));
    }
}
