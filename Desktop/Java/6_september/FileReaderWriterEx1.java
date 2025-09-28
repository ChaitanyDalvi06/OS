import java.io.*;

public class FileReaderWriterEx1 {
    public static void main(String[] args) {
        try (
                FileReader fin = new FileReader("/Users/chaitanyadalvi/Desktop/Java/6_september/FileOut1.txt");
                FileWriter fout = new FileWriter("/Users/chaitanyadalvi/Desktop/Java/6_september/FileOut2.txt")) {
            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("Error in file handling: " + e);
        }
    }
}
