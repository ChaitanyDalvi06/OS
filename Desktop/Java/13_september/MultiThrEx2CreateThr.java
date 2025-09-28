class Class1Ex1 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class1 Thread Interrupted");
        }
    }
}

class Class2Ex1 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class2 Thread Interrupted");
        }
    }
}

class Class3Ex1 implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Bye");
                Thread.sleep(500);
                }
        }catch(InterruptedException e){
            System.out.println("Class3 Thread Interrupted");
        }
    }
}

public class MultiThrEx2CreateThr{
    public static void main(String[] args) {
        Class1Ex1 obj1=new Class1Ex1();
        Class2Ex1 obj2=new Class2Ex1();
        Class3Ex1 obj3=new Class3Ex1();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        t1.start();
        t2.start();
        t3.start();
    }
}
