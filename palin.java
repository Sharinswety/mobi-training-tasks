package mobitaining.day1;

import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        int x, number, y = 0, temp = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        number = s.nextInt();
        x = number;
        
        while (number > 0) {
            x = number % 10;
            number = number / 10;
            temp = temp * 10 + x;
        }
        
        if (temp == number) {  // Change 'y' to 'number' for correct comparison
            System.out.println("it is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
