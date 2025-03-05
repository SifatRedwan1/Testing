import javax.xml.crypto.Data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Datawriter writer = new Datawriter("outputfile.txt");

        writer.writeText("You can output a string quite easily");
        writer.writeText("Adding another line for output");

        System.out.println("File written successfully");
        }

    }
