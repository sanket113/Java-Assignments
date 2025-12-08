import java.util.Scanner;

class Counter {
    public static int count;
    Counter(){
        count++;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many objects u want to create?");
        int objects=sc.nextInt();
        Counter []objArr=new Counter[objects];
        for(int i=0;i<objects;i++){
            objArr[i]=new Counter();
        }

        System.out.println("The count is : "+count);
    }
}