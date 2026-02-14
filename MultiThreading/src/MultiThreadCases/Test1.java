package MultiThreadCases;
class  MyThread extends Thread{
	public void start() {
		System.out.println("hii");
		
	}
}

public class Test1 {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.start();
		
	}
}


