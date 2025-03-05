import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String filename = "outputfile.txt";

        System.out.println("Hello world");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.write("You can output a string quite easilty");
            writer.newLine();
            writer.write("Adding another line for output");

            System.out.println("File written successfully");
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}