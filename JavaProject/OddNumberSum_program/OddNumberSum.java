
public class OddNumberSum {
    public static void main(String[] args)
    {
    int lowerbound = 1;
    int upperbound = 1000 ;
    int sum = 0;
    int number = lowerbound;
    while(number <= upperbound)
        {
        sum = sum + number;
        number = number + 2;
        }
System.out.println("The sum of odd numbers from " +lowerbound + " to " + upperbound + " is  " +
sum);
    }
}
