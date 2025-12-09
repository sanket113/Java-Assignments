package coding_problems;
import java.util.Scanner;

public class binarySearch {
    
    public static int search(int target,int [] arr){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(target==arr[mid]) return mid;
            else if(target<arr[mid]) right=mid-1;
            else{
                left=mid+1;
            }
        }
        return -1;
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
        System.out.println("Enter target element: ");
        int target=sc.nextInt();

        int index=search(target,arr);
        if(index!=-1){
            System.out.print("The index of searched element is :"+index);
        }
        else{
            System.out.println("Not found");
        }
        
    }
}
