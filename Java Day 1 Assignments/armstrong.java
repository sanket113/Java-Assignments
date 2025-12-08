import java.util.Scanner;

public class armstrong {

    public static boolean checkArmstrong(int n){
        int number=n;
        int length=String.valueOf(n).length();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=Math.pow(digit,length);
            n=n/10;
        }
        if(sum==number) return true;    
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        if(checkArmstrong(n)==true){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
