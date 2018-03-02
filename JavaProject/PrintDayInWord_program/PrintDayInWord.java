/* Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ...
 * “Saturday” if the int variable "day" is 0, 1, ..., 6, respectively.
 * Otherwise, it shall print “Not a valid day”. Use (a) a "nested-if"
 * statement; (b) a "switch-case" statement. */

 public class PrintDayInWord{
    public static void main(String[] args) {
        int day = 77777773;
            switch(day) {
                case 1: System.out.println("Monday"); 
                break;
                case 2: System.out.println("Tusday"); 
                break;
                case 3: System.out.println("Wednesday"); 
                break;
                default: System.out.println("out of range");
                }
    }
}

