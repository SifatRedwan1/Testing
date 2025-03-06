import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class DataWriter {

    private String filename;

    ArrayList<DataRecord> myData;

    public DataWriter() {
        myData = new ArrayList<>();
        Random prng = new Random();
        for (int i = 0; i < 4; i++) {
            DataRecord d = new DataRecord();
            d.i0 = prng.nextInt(-2, 5);
            d.i1 = prng.nextInt(0, 12);
            d.i2 = prng.nextInt(10, 15);
            d.i3 = prng.nextInt(20, 35);
            d.f0 = prng.nextFloat(-2.0f, 21.3f);
            d.f1 = prng.nextFloat(10.f, 16.5f);

            myData.add(d);
        }
    }

        public void writeData(String filename){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
                for ( DataRecord d: myData) {
                    writer.write(d.i0 + " " + d.i1 + " " + d.i2 + " " + d.i3 + " " + d.f0 + " " + d.f1);
                    writer.newLine();
                }
                } catch ( IOException e){
                e.printStackTrace();
            }
        }
    }


