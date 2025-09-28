import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class animals1 {
    public static void main(String[] args) {
        ArrayList<String> animals1 = new ArrayList<>();

        animals1.add("Cat");
        animals1.add("Dog");
        animals1.add("Cow");
        animals1.add("Lion");

        System.out.println("Initial animals list: " + animals1);

        animals1.add(0, "Tiger");
        animals1.add(3, "Zebra");

        System.out.println("New Animal list " + animals1);

        ArrayList<String> animals2 = new ArrayList<>();
        animals2.add("Kangaroo");
        animals2.add("Donkey");
        animals2.add("Cow");

        animals1.addAll(animals2);

        System.out.println("Element at index 2: " + animals2.get(2));
        System.out.println("Index of first occurrence of Cow: " + animals2.indexOf("Cow"));
        System.out.println("Index of last occurrence of Cow: " + animals2.lastIndexOf("Cow"));

        System.out.println(animals1.contains("Dog"));
        System.out.println(animals1.contains("Rat"));
        System.out.println(animals1.isEmpty());

        animals1.remove("Cow");
        animals2.remove("Cow");

        animals1.remove(2);
        animals1.add(2,"Ant");
        animals1.set(2, "Antelope");
        System.out.println(animals1);

        System.out.println("Using for loop:");
        for (int i = 0; i < animals1.size(); i++) {
            System.out.println(animals1.get(i));
        }

        System.out.println("\nUsing enhanced for loop:");
        for (String animal : animals1) {
            System.out.println(animal);
        }

        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = animals1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing list iterator:");
        ListIterator<String> listIterator = animals1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }

}
