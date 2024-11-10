public class GCD {
    public static void main(String[] args){

        int num1 = 27;
        int num2 = 9;
        int gcd = findGCD(num1, num2);

        System.out.println("The Greatest Common Divisor for " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b){

        int small, big;

        if(a < b){
            small = a;
            big = b;
        }else{
            small = b;
            big = a;
        }
      
        int i = small;

        while(small % i != 0 || big % i != 0){
            
            i--;
        }
        return i;
    }
}
