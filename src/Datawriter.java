import javax.xml.crypto.Data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Datawriter {
     private String filename;

     public Datawriter(String filename) {
         this.filename = filename;
     }

    public void writeText(String text){
    try(
    BufferedWriter writer = new BufferedWriter(new FileWriter(filename)))
    {
        writer.write(text);
        writer.newLine();
    } catch(IOException e)
    {
        e.printStackTrace();
    }

    }
}
