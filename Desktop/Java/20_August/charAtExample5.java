public class charAtExample5 {
    public static void main(String[] args) {
        String str="Welcome to Java world";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='o')
            {
                count++;
            }
        }
        System.out.println("Frequency of t is: "+count);
    }
    
}
