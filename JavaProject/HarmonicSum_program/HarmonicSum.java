/* Write a program called HarmonicSum to compute the sum of a harmonic series,
 * as shown below, where n=50000. The program shall compute the sum from
 * left-to-right as well as from the right-to-left. Obtain the difference
 * between these two sums and explain the difference. Which sum is more
 * accurate? */

public class HarmonicSum {
    public static void main(String[] args) {
    int maxDenominator = 5000;
    int minDenominator = 1;
    double sumL2R = 0.0;
    double sumR2L = 0.0;
        for(int denominator = 1; denominator <=5000; ++denominator) {
        sumL2R = sumL2R + 1.0 / denominator;
        }
    System.out.println("the HarmonicsSum for denominators from 1 through 5000 equals " + sumL2R);
    
        for(int denominator = 5000; denominator >=1; --denominator) {
        sumR2L = 1.0 / denominator + sumR2L;
        }
    System.out.println("the HarmonicsSum for denominators from 5000 through 1 equals " + sumR2L);
    }

}


