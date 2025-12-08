import java.util.*;

class Prime{

    public static boolean checkPrime(int n){
        if(n<=1) return false;
        else if(n==2) return true;
        else if(n%2==0) return false;
        else{
            for(int i=3;i*i<=n;i+=2){
                if(n%i==0) return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        System.out.println("Enter number: ");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();

        if(checkPrime(number)==true){
            System.out.println("The given number is Prime");
        }
        else{
            System.out.println("The given number is not Prime");

        }
    }
}