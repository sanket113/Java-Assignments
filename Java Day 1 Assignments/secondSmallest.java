import java.util.Scanner;

public class secondSmallest {
    
    public static int findsmall(int [] arr){
        int small=Integer.MAX_VALUE;
        int secondSmall=small;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secondSmall=small;
                small=arr[i];
                
            }
            if(arr[i]<secondSmall&&arr[i]>small){
                secondSmall=arr[i];
            }
        }
        return secondSmall;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second smallest element is: "+findsmall(arr));

    }
}
