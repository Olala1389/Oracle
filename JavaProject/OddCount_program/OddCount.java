

/* Modify the program to sum only the odd numbers from 1 to 100, and compute
 * the average.*/

 public class OddCount:wq
 {
    public static void main(String[] args) {
        int lowerbound = 111;
        int upperbound = 8899;
        double average;
        int sum = 0;
        int count = 0;
        int number = lowerbound;
            do {
            sum+=number;
            ++number;
            ++count;
            }
            while (number <=8899);
            average = ((double)sum)/(8899-111+1);
            System.out.println("sum = " + sum + ", " +  "average = " +
            average + ", " +  "count = " + count );
        }
}
