import java.io.*;

class FileMarkResetSkip {
    public static void main(String[] args) throws IOException {
        try (BufferedReader is = new BufferedReader(
                new FileReader("/Users/chaitanyadalvi/Desktop/Java/6_september/markText.txt"))) {
            System.out.println((char) is.read());

            System.out.println("Is mark supported: " + is.markSupported());

            if (is.markSupported()) 
            {
                is.mark(100);
                System.out.print((char) is.read());
                System.out.print((char) is.read());
                is.reset();
            }

            System.out.print((char) is.read());
            System.out.print((char) is.read());
            System.out.print((char) is.read());

            is.skip(2);
            System.out.print((char) is.read());
            System.out.print((char) is.read());
            System.out.print((char)is.read());
        }
    }
}
