package concept_implementations;

import java.io.FileWriter;
import java.io.IOException;

public class IOoperations {

    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("assignment_output.txt");
            fw.write("This is a sentence");
            fw.write("Sanket");
            fw.append(" appended word");
        
            fw.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    
}
