import java.io.*;

public class FileInputOutputStreamEx1 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream(
                "/Users/chaitanyadalvi/Desktop/File123.txt");
                FileOutputStream fout = new FileOutputStream(
                        "/Users/chaitanyadalvi/Desktop/File654.txt");) {
            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b);
            }
            System.out.println("File copied successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exc");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}