import java.util.*;
public class ArrayListEx1 {

    public static void main(String[] args) {
        //List l1 store String Objects
        ArrayList<String> list1 = new ArrayList<String>();

        //*Add element in list1 */

        list1.add("Tom");
        list1.add("Shyam");
        list1.add("Ravi");
        list1.add("Sam");
        list1.add("Pam");
        list1.add("Ram");
        System.out.println("Add elements in list 1 using add(index, element)");
        list1.add(1,"Naina");  //It is used to insert the specified element at the specified position

        //list1.add(10); error, as only string objects are allowed in list1

        System.out.println("Print elements in the list the wat we added");
        System.out.println("List1:"+list1);

        //****Get elements from the list1 */
        System.out.println("***Get (Read) elements from list1***");
        System.out.println("List1(3) "+list1.get(3));

        System.out.println("***Updating elements ***");
        list1.set(2,"Shanoya");
        System.out.println("Updated list1 "+list1);

        System.out.println("***Removing elements***");
        list1.remove(2);
        System.out.println("list1 after removing element at index 2 "+list1);

        list1.remove("Sam");
        System.out.println("List1 after removing element sam "+list1);

        //**clear all elements** */
        //list1.clear();

        System.out.println("****Contains****");
        if (list1.contains("Ravi")) {
            System.out.println("Ravi is in the list");
        }
        else{
            System.out.println("Ravi is not in the list");
        }

        if (list1.contains("Shanoya")) {
            System.out.println("Shanoya is in the list");
        }
        else{
            System.out.println("Shanoya is not in the list");
        }

        System.out.println("***Iterate ArrayList using basic for loop***");

        for(int i=0; i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("Iterate ArrayList using for each loop");

        for(String str: list1){
            System.out.println(str);
        }
        System.out.println("***Iterating with iterator***");
        Iterator <String> itr = list1.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Sam")){
                itr.remove();
            }
        }

        System.out.println("list1 after iterating using iterator "+list1);
        ListIterator <String> listItr = list1.listIterator();
        System.out.println("====Forward====");
        while(listItr.hasNext()){
            System.out.println(listItr.next());
        }

        System.out.println("===Backward");

        while(listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }

        //isEmpty()
        System.out.println("***isEmpty()***");
        if(list1.isEmpty()){
            System.out.println("List1 is empty");
        }
        else{
            System.out.println("List1 is not empty");
        }

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("AAA");
        al1.add("BBB");
        al1.add("CCC");
        al1.add("DDD");
        ArrayList<String> al2 = new ArrayList<String>(al1);
        System.out.println(al2);


    }
    
}