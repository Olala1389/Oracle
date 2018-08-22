/* Write a program called Product1ToN to compute the product of integers 1 to
 * 10 (i.e., 1×2×3×...×10). Try computing the product from 1 to 11, 1 to 12, 1
 * to 13 and 1 to 14. Write down the product obtained and explain the results.
 */

 public class Product1ToN {

    public static void main(String[] args) {
        long product = 1;
        for (int number = 1; number <14; number++){
            product = product * (number+1);
            }
        System.out.println("the product of numbers from 1 through 14 is " + product);
    }
}
        
