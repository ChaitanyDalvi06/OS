public class MultiThrEx3Createthr {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Class " + i);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Class1 thread interrupted");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Class " + i);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Class2 thread interrupted");
                }
            }
        });
        t1.start();
        t2.start();
    }
}