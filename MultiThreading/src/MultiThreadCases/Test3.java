package MultiThreadCases;

class Thread3 extends Thread {
    public void run() {
        System.out.println("hii");
    }

    public void run(int a) {
        System.out.println(a);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        t1.start();
        t1.run(10);
    }
}

		