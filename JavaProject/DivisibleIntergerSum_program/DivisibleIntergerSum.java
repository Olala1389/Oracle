public class DivisibleIntergerSum{
    public static void main(String[] args) {
        
        int lowerbound = 1, upperbound = 1000;
        int sum = 0;
        int num = lowerbound;
             while(num<= upperbound) {
                if(((num % 13 == 0) | (num % 15 == 0) |
                (num % 17 == 0)) && (num % 30 != 0)){
                    sum = sum + num;
                    }
                    ++num;
                }
            System.out.println("The sum of intergers divisible by 13, " + "\n" +
            "15, or 17, but not 30 is " + sum);
            }
        }


