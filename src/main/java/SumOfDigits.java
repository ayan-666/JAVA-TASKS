//Find out sum of digits of a number
//Input: 152
//Output: 8
public class SumOfDigits {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num=152;
        int sum=0;

        while(num!=0) {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("Sum: "+sum);
    }
}
