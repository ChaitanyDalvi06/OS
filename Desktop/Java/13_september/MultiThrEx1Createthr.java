//Write a program to create three threads in your program 
//below only two threads are given .

//1st Thread will print "Hello" 5 times.
//2nd Thread will print "Hi" 5 times.
//And 3rd Thread will print "Bye " 5 times.
// In main method you have to print begin and end between which you have to invoke main methods.


class Class1Ex1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class1 thread interrupted");
        }
    }
}

class Class2Ex1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class2 thread interrupted");
        }
    }
}

class Class3Ex1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Bye");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class3 thread interrupted");
        }
    }
}

public class MultiThrEx1Createthr {
    public static void main(String[] args) {
        Class1Ex1 t1 = new Class1Ex1();
        Class2Ex1 t2 = new Class2Ex1();
        Class3Ex1 t3 = new Class3Ex1();
        System.out.println("Begin");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End");
    }
}