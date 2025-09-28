import java.util.*;

public class HashSetEX1 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("BB");
        h.add("AA");
        h.add("DD");
        h.add("CC");

        System.out.println(h.add("BB"));
        System.out.println(h);
        System.out.println("List contains DD or not : " + h.contains("DD"));
        h.remove("AA");
        System.out.println("List after removing AA : " + h.contains("AA" + h));
        System.out.println("Iterating over list : ");

        Iterator<String> itr = h.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        System.out.print("Using enhanced for loop: ");
        for (String element : h) { // Changed 'hs' to 'h'
            System.out.print(element + ", ");

        }

    }

}
