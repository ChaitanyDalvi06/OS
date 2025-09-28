import java.io.*;

class Address implements Serializable {
    String flatNo;
    String society;

    Address(String f, String s) {
        flatNo = f;
        society = s;
    }

    public String toString() {
        return "Flat No: " + flatNo + " & Society " + society;
    }
}

class Person implements Serializable {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "id " + id + "& name " + name;
    }
}

class Student extends Person {
    int rollno;
    String course;
    Address addr;

    public Student(int id, String name, int rollno, String course, Address ad) {
        super(id, name);
        this.rollno = rollno;
        this.course = course;
        this.addr = ad;
    }

    public String toString() {
        System.out.println(super.toString());
        return "Roll no: " + rollno + ", Course: " + course + ", Address: " + addr;
    }
}

public class SerialiationEX1Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Chaitanya", 19, "AI", new Address("123", "Kharghar"));
        System.out.println(s1);

        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/Users/chaitanyadalvi/Desktop/Java/13_september/Aggregation.ser"))) {
            os.writeObject(s1);
        } catch (IOException e) {
            System.out.println("Exception in Serialization");
        }

        try (ObjectInputStream os = new ObjectInputStream(
                new FileInputStream("/Users/chaitanyadalvi/Desktop/Java/13_september/Aggregation.ser"))) {
            Student s2 = (Student) os.readObject();
            System.out.println(s2);
        } catch (IOException e) {
            System.out.println("Exception in Deserialization " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Exception in deserialization " + e.getMessage());
        }
    }
}
