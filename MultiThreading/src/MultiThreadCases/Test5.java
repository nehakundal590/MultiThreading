package MultiThreadCases;

class Thread5 extends Thread {
   /* public void run() {
        System.out.println("hii");
    }

    public void run(int a) {
        System.out.println(a);
    }
}*/

public class Test5 {
    public static void main(String[] args) {
        Thread5 t1 = new Thread5();
        t1.start();
    }
}
}
		