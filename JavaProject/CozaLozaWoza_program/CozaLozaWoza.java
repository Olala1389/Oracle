/* Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11
 * numbers per line. The program shall print "Coza" in place of the numbers
 * which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of
 * 7, "CozaLoza" for multiples of 3 and 5, and so on. The output shall look
 * like:
 1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 
 Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22 
 23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
 ...... */

public class CozaLozaWoza {

    public static void main(String[] args) {

        int upperbound = 110, lowerbound = 1;
        for(int number = 1; number <= 110; ++number)
        { 
            

            if(number%5==0 && number%3==0) {
                System.out.print("CozaLoza" + " ");
                }
            else if(number%3==0 && number%11==0) {
                System.out.print("Coza" + "\n") ; 
            }

            else if(number%3==0) {
                System.out.print("Coza" + " ");
            }
            
            else if(number%5==0 && number%11 ==0) {
                System.out.print("Loza" + "\n");
            }
            else if(number%5==0){
                System.out.print("Loza" + " ");
            }
            
            else if(number%7==0 && number%11 ==0) {
                System.out.print("Woza" + "\n");
                }
            else if(number%7==0) {
                System.out.print("Woza" + " ");
                }
    
            else if(number%11==0) {
                System.out.print(number +"\n");
                }
            else if(number%5 !=0 || number%3 !=0 || number%7 !=0){
                System.out.print(number + " ");
                }

             else {
                System.out.println(" ");
                }
        }
    }
}




