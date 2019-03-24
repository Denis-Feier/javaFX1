package fileinputoutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class FileInputOutput {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            BufferedReader r =
                    new BufferedReader(new InputStreamReader(
                        new FileInputStream("newfile.txt")));
            
            String value = r.readLine();
            
            System.out.println(value);
            
            PrintStream file_complex_stream =
                new PrintStream(new FileOutputStream("newfile.txt"));
            
            file_complex_stream.print(value + "ceva");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
