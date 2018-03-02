
/* Modify the program to find the "sum of the squares" of all the numbers from
1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100. */

 public class NumberCount{
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;
        double average;
        int sum = 0;
        int count = 0;
        for (int number = 1; number<=100; number++){ 
            sum+=number*number;
            ++count;
            }
            
            System.out.println("sum = " + sum + ", " +  "count = " + count );
    }
}
