package com.multiThread;

		public class Demo2 {

		    public static void main(String[] args) {

		        // MyThread mt1 = new MyThread();
		        // mt1.start();

		        MyThread mt1 = new MyThread();
		        Thread t1 = new Thread(mt1);
		        t1.setName("Thread-01");
		        t1.start();

		        // Anonymous Inner Class
		        Runnable runnable = new Runnable() {
		            @Override
		            public void run() {

		            }
		        };
		        // runnable.run();

		        // Lambda Expression
		        Runnable runnable1 = () -> {
		            for (int i = 1; i <= 10; i++) {
		                System.out.println(i);
		            }
		        };

		        Thread th1 = new Thread(runnable1);
		        th1.start();
		    }
		}
		
	


