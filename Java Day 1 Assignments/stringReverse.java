import java.util.Scanner;

public class stringReverse {
    
    public static String reverseString(String input){
        int left=0;
        int right=input.length()-1;
        
        char characters[]=input.toCharArray();
        while(left<right){
            char temp=characters[left];
            characters[left]=characters[right];
            characters[right]=temp;
            left++;
            right--;
        }
        
        return new String(characters);

    }
    public static void main(String[] args) {
        String input=new String();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        input=sc.nextLine();
        System.out.println("Reverse String: "+reverseString(input));
    }
}
