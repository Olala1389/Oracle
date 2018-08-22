/* Tribonacci numbers are a sequence of numbers T(n) similar to Fibonacci
 * numbers, except that a number is formed by adding the three previous
 * numbers, i.e., T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2. Write a
 * program called Tribonacci to produce the first twenty Tribonacci numbers.*/


 public class Tribonacci {
    
    public static void main(String[] args) {

    int n1 = 1, n2=1, n3 = 2, n4;
    int count = 20;
    System.out.print("The first " + count + " Tribonacci numbers are: " + n1 +
    " " + n2 + " " + n3 + " ");
    
    for(int i = 3; i<=count; ++i) {
    n4 = n1 + n2 + n3;
    System.out.print(" " + n4 + " ");
    n1 = n2;
    n2 = n3;
    n3 = n4;
    }
    System.out.print("\n");
}
}


