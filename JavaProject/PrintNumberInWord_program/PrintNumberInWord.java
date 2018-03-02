/* Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other,
 * respectively. Use (a) a "nested-if" statement; (b) a "switch-case"
 * statement.*/

    public class PrintNumberInWord {
    public static void main(String[] args) {

        int number = 5; 
        if(number==1) {
            System.out.print("ONE");}
            else if(number==2) {
                System.out.print("TWO");}
                    else if(number==3) {
                    System.out.print(number + ""); }
                        else{ System.out.println("Other"); }
    }
}
    
