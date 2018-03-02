/* Write a program called CheckOddEven which prints "Odd Number" if the int
 * variable “number” is odd, or “Even Number” otherwise. The program shall
 * always print “BYE!” before exiting.*/

public class CheckOddEven{

    public static void main(String[] args) {
        int number = 5;

        if(number%2==0){
            System.out.println("Even Number");
            }
                else {
                    System.out.println("Odd Number");
                    }
        System.out.println("Bye!");
    }
}
