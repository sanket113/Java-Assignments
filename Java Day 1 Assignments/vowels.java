import java.util.Scanner;

public class vowels {

    public static int countVowels(String str){
        String lowerStr=str.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(lowerStr.charAt(i)=='a'||lowerStr.charAt(i)=='e'||lowerStr.charAt(i)=='i'||lowerStr.charAt(i)=='o'||lowerStr.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=new String(sc.nextLine());
        
        System.out.println("The total vowels in given string are: "+countVowels(str));
    }
    
}
