import java.io.*;

public class FileWriterEx1 {
    public static void main(String[] args){
        String str="We all born with a divine fire in us."+
        "Our efforts should be to give wings to this fire and "+
        "fill the world with the glow of its goodness.";
        int len=str.length();
        char [] buff=new char[len];

        str.getChars(0, str.length(), buff, 0);
        try(FileWriter fout1=new FileWriter("/Users/chaitanyadalvi/Desktop/Java/6_september/FileOut1.txt");
        FileWriter fout2=new FileWriter("/Users/chaitanyadalvi/Desktop/Java/6_september/FileOut2.txt");
        FileWriter fout3=new FileWriter("/Users/chaitanyadalvi/Desktop/Java/6_september/FileOut3.txt");
        FileWriter fout4=new FileWriter("/Users/chaitanyadalvi/Desktop/Java/6_september/FileOut4.txt");
        FileWriter fout5=new FileWriter("/Users/chaitanyadalvi/Desktop/Java/6_september/FileOut5.txt");
        ){
            fout1.write(str);
            fout1.append(str.charAt(0));

            for(int i=0;i<len/4;i++)
                fout2.write(buff[i]);
            fout2.append("\n");
            StringBuilder sb=new StringBuilder("\nAppending to fout2");
            fout2.append(str,len/2,len);
            fout2.append(sb);

            fout3.write(buff);

            fout4.write(buff,len-len/4,len/4);
            fout4.write("Quote by APJ Abdul Kalam");

        }
        catch(IOException e){
            System.out.println("Error in file handling");
        }

    }
}