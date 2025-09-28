import java.io.*;

class Student implements Serializable{
    int rollno;
    String name;
    public Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public String toString(){
        return "rollno "+rollno+" name "+name;
    }
}

public class SerializationEx1 {
    public static void main(String []args){
        Student s=new Student(111, "AAA");
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("/Users/chaitanyadalvi/Desktop/Java/12_september/SerialStud.ser"));){
            os.writeObject(s);
        }catch(IOException e){
            System.out.println("Exception in Serialization");
        }

        try(ObjectInputStream is=new ObjectInputStream(new FileInputStream("/Users/chaitanyadalvi/Desktop/Java/12_september/SerialStud.ser"));){
            Student s2=(Student)is.readObject();
            System.out.println(s2);
        }catch(IOException e){
            System.out.println("Exception in Deserialization");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found Exception");
        }

    }
}