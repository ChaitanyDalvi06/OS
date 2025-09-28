import java.io.*; 
import java.io.IOException;

public class FileInputStreamEx3 {
    public static void main(String [] args) {
        FileInputStream fin = null; 
        try {
            fin = new FileInputStream("/Users/chaitanyadalvi/Desktop/Java/4_september/File123.txt"); 
            int b;
            while ((b = fin.read()) != -1) { 
                System.out.println((char) b); 
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception"); 
        } catch (IOException e) {
            System.out.println("IO Error"); 
        } finally {
            try {
                if (fin != null) 
                    fin.close(); 
            } catch (IOException e) {
                System.out.println("Error closing file"); 
            }
        }
    }
}
