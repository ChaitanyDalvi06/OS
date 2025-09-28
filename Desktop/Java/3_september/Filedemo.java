import java.io.File;
import java.io.IOException;

class FileDemo {

    public static void main(String args[]) throws IOException { File f1 = new File("/Users/chaitanyadalvi/Desktop/Java/3_september"); 
    if (f1.exists()) {
        System.out.println("File Name: " + f1.getName());
        System.out.println("Path: " + f1.getPath());
        System.out.println("Abs Path: " + f1.getAbsolutePath());
        System.out.println("Parent: " + f1.getParent());
        System.out.println(f1.exists() ? "exists" : "does not exist");
        System.out.println("is" + (f1.isDirectory() ? "" : " not") + " a directory");
        System.out.println("File last modified: " + f1.lastModified());
        System.out.println(f1.isFile() ? "is file" : "is not a file");
        System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute");
        System.out.println("File size: " + f1.length() + " Bytes");

        if (f1.isDirectory()) {
            for (File subFile : f1.listFiles()) {
                System.out.println(" " + subFile);
            }
        }

        File obj = new File("/Users/chaitanyadalvi/Desktop/Java/3_september/I0File/Try123.txt");
        obj.createNewFile(); // throws IOException
        // return boolean
        // obj.delete();

        File obj1 = new File("/Users/chaitanyadalvi/Desktop/Java/3_september/I0File/mkdirTry1.txt");
        System.out.println(obj1.mkdir()); // return boolean

        File obj2 = new File("/Users/dr.ritujain/java/java_prg_vs/Module_3/I0File/MkdirTry1/Sub");
        System.out.println(obj2.mkdirs()); // return boolean

        File obj3 = new File("/Users/dr.ritujain/java/java_prg_vs/Module_3/I0File/MkdirTry1/Sub111");
        System.out.println(obj2.renameTo(obj3));

        File obj4 = new File("/Users/dr.ritujain/java/java_prg_vs/Module_3/10File/Try321.txt");
        System.out.println(obj.renameTo(obj4));
    }
}
}