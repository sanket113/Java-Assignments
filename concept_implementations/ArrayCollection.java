package concept_implementations;

import java.util.*;
class ArrayCollection {
    
    public static void printNames(ArrayList<String>names){
        System.out.println("The names starting with S are");
        for (String s : names) {
            if(s.charAt(0)=='S'||s.charAt(0)=='s'){
                System.out.println(s);
            }
        }
        
    }

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 names");
        for(int i=0;i<5;i++){
            names.add(sc.nextLine());
        }

        printNames(names);
    }
}
