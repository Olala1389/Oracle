public class DivisibleBy7 {
    public static void main(String[] args)
    {
    int lowerbound = 1;
    int upperbound = 1000 ;
    int sum = 0;
    int number = lowerbound + 6;
    while(number <= upperbound)
        {
        sum = sum + number;
        number = number + 7;
        }
System.out.println("The sum of numbers from " +lowerbound + " to " + upperbound
+ " that are divisible by 7 is  " +
sum);
    }
}
