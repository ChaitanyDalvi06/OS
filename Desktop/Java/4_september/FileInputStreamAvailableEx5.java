import java.io.*;

public class FileInputStreamAvailableEx5 {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream(
                "/Users/chaitanyadalvi/Desktop/Java/4_september/OutFile1.txt");) {
            System.out.println("Available bytes at the beginning: " + input.available());
            input.read();
            input.read();
            input.read();
            
            System.out.println("Available bytes at the end: " + input.available());
        } catch (FileNotFoundException e) {
            System.out.println("File not found exc");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}