public class LeapYearCount {
    public static void main(String[] args) {
    int AD1 = 1752;
    int count = 0;
    int year = AD1;
    while(year <= 2018) {
        if ((year%400 ==0) | ((year%4 ==0) && (year%100 !=0))) {
            ++count;
            }
        ++year;
        }
    System.out.println("The number of Leap Years from 1752AD through 2018 is " + count);
    }
}


