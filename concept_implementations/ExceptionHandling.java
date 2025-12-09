package concept_implementations;

public class ExceptionHandling {
    
    public int division(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by 0 Exception");
            return -1;
        }
    }
    public static void main(String[] args) {
        ExceptionHandling e=new ExceptionHandling();
        e.division(5, 0);
    }
}
