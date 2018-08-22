/* Write a program called TimeTable to produce the multiplication table of 1 to
 * 9 as shown using two nested for-loops: 


 * |  1  2  3  4  5  6  7  8  9
 -------------------------------
1 |  1  2  3  4  5  6  7  8  9
2 |  2  4  6  8 10 12 14 16 18
3 |  3  6  9 12 15 18 21 24 27
4 |  4  8 12 16 20 24 28 32 36
5 |  5 10 15 20 25 30 35 40 45
6 |  6 12 18 24 30 36 42 48 54
7 |  7 14 21 28 35 42 49 56 63
8 |  8 16 24 32 40 48 56 64 72
9 |  9 18 27 36 45 54 63 72 81
*/


public class TimeTable {
    public static void main(String[] args) {
        int prod;
        System.out.print("* |   ");
        
        for(int heading = 1; heading <=9; ++heading) {
        System.out.print(heading + "   ");
        }
        System.out.println(" ");          
        for(int line = 1; line <=9; ++line) {
        System.out.print("_____");
        }
        
        System.out.println();

        for(int row = 1; row<=9; ++row) {
        System.out.print(row + " | ");

            for(int column = 1; column <=9; ++column) {
            prod = column * row;
                if(prod>9) {
                System.out.print(" " + prod + " ");
                }   
                else {
                System.out.print("  " + prod + " ");
                }
            }
        System.out.println();
        }   
    }   
}



