package tools;
import java.io.*;

public class OutFile {

    private static FileWriter fw = null;

    public static void openWriter() throws IOException {
        fw = new FileWriter("simulation.txt");
    }

    public static void writeToFile(String msg) throws IOException{
            fw.write(msg);
    }

    public static void closeWriter() throws IOException {
        fw.close();
    }
}
