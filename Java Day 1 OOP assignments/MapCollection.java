import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCollection {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<String,String>captialCities=new HashMap<>();
        for(int i=1;i<=3;i++){
            System.out.println("Enter Country "+i+" and its captial : ");
            captialCities.put(sc.nextLine(),sc.nextLine());
        }

        for (Map.Entry<String,String> entry : captialCities.entrySet()) {
            System.out.println("The country is "+entry.getKey()+" and capital is "+entry.getValue());
        }
    }
}
