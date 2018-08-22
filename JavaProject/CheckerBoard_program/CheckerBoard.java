/* Write a program called CheckerBoard that displays the following n×n (n=7)
 * checkerboard pattern using two nested for-loops. */

 public class CheckerBoard {
    public static void main(String[] args) {
        for(int row=1; row<=7; ++row) {
            if((row % 2)==0) {
            System.out.print(" ");
            }
            for(int col=1; col<=7; ++col) {
            System.out.print("# ");
            }
            System.out.println("");
            }
        }
    }
