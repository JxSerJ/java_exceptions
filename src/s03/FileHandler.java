package s03;

import java.io.*;

public class FileHandler {

    public void writeData(String name, String data) throws IOException {
        name = name + ".txt";
        File f = new File(name);
        if (f.isFile()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(name, true));
            writer.write(data);
            writer.close();
        } else {
            BufferedWriter writer = new BufferedWriter(new FileWriter(name));
            writer.write(data);
            writer.close();
        }
    }
}
