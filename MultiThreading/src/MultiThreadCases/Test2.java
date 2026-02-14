package MultiThreadCases;
 class Thread0 extends Thread{
	public void run() {
		System.out.println("hii");
	}
	
}

public class Test2 {
	public static void main(String[] args) {
		Thread0 t1=new Thread0();
		t1.run();
		
	}

}
