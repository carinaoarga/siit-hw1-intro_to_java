import java.util.Scanner;

public class Algorythms {

    public static int getSumOfFirstNIntegers(int a){

        int sum  = 0;

        if(a >= 0 ) {

            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
        } else{
            System.out.println("The number must be greater or equal to 0!");
            sum = -1;
        }
        return sum;
    }

    public static int[] setIntegersArray(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the integer elements of the array[delimited by space]: ");
        String arrayString = scan.nextLine();

        String[] arrayOfStrings = arrayString.trim().split("\\s+");
        int[] array = new int[arrayOfStrings.length];
        for (int i =0; i < arrayOfStrings.length; i++){
            array[i] = Integer.parseInt(arrayOfStrings[i]);
        }
        return array;
    }

    public static int getSmallestFromArray(int [] arr){
        int smallest = arr[0];

        for(int x : arr){
            smallest = Math.min(x, smallest);
        }
        return smallest;
    }

    public static int getMaxDigit(int a){
        int max=0;

        if(a < 0){
            a *= (-1);
        }

        while(a !=0){
            int r = a%10;
            max = Math.max(max, r);
            a /= 10;
        }
        return max;
    }

    public static boolean isPalindrome(int a){
        if (a < 0){
            a *= (-1);
        }

        int initialNumber = a;
        int reversedNumber=0;

        while (a != 0){
            reversedNumber = reversedNumber * 10 + (a%10);
            a = a/10;
        }
        return initialNumber == reversedNumber;
    }

    public static boolean isPrime(int a){
        boolean isPrime = true;

        for (int i = 2; i <= a/2; i++){
            if (a%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static String primeNumbersSmallerThan(int a){
        String s = "";
        for (int i = 2; i < a; i++){
            if (isPrime(i)){
                s = s.concat(i + "; ");
            }
        }
        return s;
    }
}
