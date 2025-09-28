import java.io.File;
import java.io.IOException;

class FileDemo {
    public static void main(String[] args) throws IOException {
        String desktopPath = "/Users/chaitanyadalvi/Desktop";
        File F1 = new File("/Users/chaitanyadalvi/Desktop/File123.txt");
        F1.createNewFile();
        if (F1.exists()) {
            System.out.println("File exists");
            System.out.println("File name: " + F1.getName());
            System.out.println("File path: " + F1.getPath());
            System.out.println("File length: " + F1.length());
            System.out.println("File parent: " + F1.getParent());
            System.out.println("File absolute path: " + F1.getAbsolutePath());
            System.out.println("File is directory: " + F1.isDirectory());
            System.out.println("File is file: " + F1.isFile());
            System.out.println("File last modified: " + F1.lastModified());

        }
        File f2 = new File("/Users/chaitanyadalvi/Desktop/File456.txt");
        f2.createNewFile();
        File dir1 = new File(desktopPath+"/Dir1");
        dir1.mkdir();
        File dir2 = new File("/Users/chaitanyadalvi/Desktop/Dir2/SubDir1");
        dir2.mkdirs();
        File f3 = new File("/Users/chaitanyadalvi/Desktop/File456.txt");
        f3.renameTo(new File("/Users/chaitanyadalvi/Desktop/File654.txt"));
        File f4 = new File("/Users/chaitanyadalvi/Desktop/Dir2/File11.txt");
        f4.createNewFile();
        File f5 = new File("/Users/chaitanyadalvi/Desktop/Dir2/File22.txt");
        f5.createNewFile();
        File dir3 = new File("/Users/chaitanyadalvi/Desktop/Dir2");
        File[] files = dir3.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        System.out.println("Length of File123.txt: " + F1.length());

    }

}
