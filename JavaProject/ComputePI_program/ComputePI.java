/* Write a program called ComputePI to compute the value of π, using the
 * following series expansion. You have to decide on the termination criterion
 * used in the computation (such as the number of terms used or the magnitude
 * of an additional term). Is this series suitable for computing π? */
 
 public class ComputePI {

    public static void main(String[] args) {
        
        int maxDenominator = 10000;
        double sum1 = 0.0;
        double sum2 = 0.0;
        double pi;
     for (int denominator = 1; denominator <=maxDenominator; denominator +=2) 
        {
            if (denominator%4==1) {
                sum1+=1.0/denominator;
            System.out.println("sum1 = " + sum1); 
            }
                else if (denominator%4==3) {
                    sum2-=1.0/denominator;
                    System.out.println("sum2 = " + sum2); 
                }
                    else {
                    System.out.println("The computer got crazy");
                    }
        }
        pi = 4*(sum1 + sum2);
        System.out.println("pi = " + pi);
        
    }
}
