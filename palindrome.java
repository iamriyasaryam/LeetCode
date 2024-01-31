import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : " );
        int number = sc.nextInt();
        int reversenumber= reverseNumber(number);
        if (isPalindrome(number, reversenumber)) {
            System.out.println("The original number is a palindrome.");
        } else {
            System.out.println("The original number is not a palindrome.");
        }
     
}
    public static int reverseNumber(int number){
        int reversenumber = 0;
        while(number !=0){
            int digit = number%10;
            reversenumber = reversenumber*10 + digit;
            number/=10;
        }
        System.out.println("reverse number : "+reversenumber);
        return reversenumber;
    }

     public static boolean isPalindrome(int number,int reversenumber){
        return number == reversenumber;
    }
    System.out.println(0+5);
}

