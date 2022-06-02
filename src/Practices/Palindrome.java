package Practices;

public class Palindrome {

    static boolean isPalindrome(int number) {
        int temp = number;
        int reverseNumber = 0;
        int lastDigit;
        while(temp != 0){
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }

        if (number == reverseNumber){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
}
