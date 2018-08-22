/* Write a program called ExtractDigits to extract each digit from an int, in the reverse order. For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.

Hints: Use n % 10 to extract the least-significant digit; and n = n / 10 to
discard the least-significant digit. */

public class ExtractDigits {
    public static void main(String[] args) {

    int digit = 1389;
    int remainder;
    
    while(digit > 0) {
        remainder = digit % 10;
        digit = (digit  - remainder) /10;
        System.out.print(remainder + " ");
        }
    }
}

