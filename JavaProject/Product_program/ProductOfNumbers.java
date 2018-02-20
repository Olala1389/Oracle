public class ProductOfNumbers {
    public static void main(String[] args) {
        int product = 1;
        int num = 2;
        while(num <=10) {
            product= product*num;
            ++num;
        }   
    System.out.println("the product of numbers from 1 through 10 is " + product);
    }
}
