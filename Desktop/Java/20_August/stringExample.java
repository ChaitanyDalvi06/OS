public class stringExample {
    public static void main(String[] args) {
        String s1="java";
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);
        String s3=new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Hello".substring(2, 5));

        String s4 = "Hello";
        String s5 = "World";
        System.out.println(s4.concat(s5));

        String s6="Learn Share Learn";
        System.out.println(s6.indexOf("Share"));

        System.out.println("Play");

        System.out.println(s6.indexOf("ea",3));

        Boolean out ="world".equals("world");
        System.out.println(out);
        Boolean out1 ="World".equals("world");
        System.out.println(out1);

        Boolean out3= "World".equalsIgnoreCase("world");
        System.out.println(out3);
        int outs=s1.compareTo(s2);
        System.out.println(outs);

        String s11="hello";
        String s12="hello";
        String s13="meklo";
        String s14="hemlo";
        String s15="flag";
        System.out.println(s11.compareTo(s12));
        System.out.println(s11.compareTo(s13));
        System.out.println(s11.compareTo(s14));
        System.out.println(s11.compareTo(s15));
        
        String s16="hello";
        String s17="";
        String s18="me";
        System.out.println(s16.compareTo(s17));
        System.out.println(s17.compareTo(s18));

        String string1="Book";
        String string2="book";
        String string3="look";
        String string4="abc";
        String string5="BEEN";
        System.out.println(string1.compareToIgnoreCase(string2));
        System.out.println(string1.compareToIgnoreCase(string3));
        System.out.println(string1.compareToIgnoreCase(string4));
        System.out.println(string1.compareToIgnoreCase(string5));

        String word1="Hello";
        String word3=word1.toLowerCase();
        String word2=word1.toUpperCase();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        String s20=" Learn Share Learn ";
        System.out.println(s20.trim());

        String s21="fadaf";
        System.out.println(s21.replace('f','r'));

        String s22="Hello";
        char[]cha=s22.toCharArray();
        for(int i=0;i<cha.length;i++){
            System.out.println(cha[i]);
        }



        


     
    }  
}
