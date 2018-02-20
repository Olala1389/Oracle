public class SquareSum{
    public static void main(String[] args)
    {
    int lowerbound = 1;
    int upperbound = 100;
    int sum = 0;
    int number = lowerbound;
    while(number <= upperbound)
        {
        sum =  sum + number*number;
        ++ number;
        }
System.out.println("The sum of the square of all numbers from 1 to 100 is " +
sum);
    }
}
