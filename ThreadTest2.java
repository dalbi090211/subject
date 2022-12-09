// Runnable을 상속받은 쓰레드 클래스
	class MyThread2 implements Runnable {
	
	 public void run() {
 		 for(int i = 0; i < 5; i++) {
			 // 현재 실행되고 있는 쓰레드의 이름을 출력
			 System.out.println("Thread Name is " + 
				 Thread.currentThread().getName());
		
			 try {
				 // 쓰레드의 지정한 시간만큼 sleep()시킴
			 	 Thread.sleep(100);	
			 } catch(InterruptedException e) {}
		 }
	 }	
	}

	public class ThreadTest2 {
	 // Runnable 객체 선언
	 Runnable r1, r2, r3;
	 // 쓰레드 객체 선언
 	 Thread t1, t2, t3;

	 public void doRun() {
		
		 // Runnable 객체 생성
		 r1 = new MyThread2();
		 r2 = new MyThread2();
		 r3 = new MyThread2();
		
		 // Runnable 객체와 이름을 이용하여 쓰레드 객체 생성
		 t1 = new Thread(r1, "T1");
		 t2 = new Thread(r2, "T2");
		 t3 = new Thread(r3, "T3");
	
		 // 쓰레드 실행 시작
		 t1.start();
		 t2.start();
		 t3.start();
		 
		 try {
			 // t1 쓰레드가 종료되기까지 대기한다.
			 t1.join();
			 // t2 쓰레드가 100ms 안에 종료되기까지 대기한다.
			 t2.join(100);
			 // t3 쓰레드가 종료되기까지 대기한다.
			 t3.join();
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		
		 System.out.println("All Threads are dead!!");		
	 }
	
	 public static void main(String args[]) {
		 ThreadTest2 tt2 = new ThreadTest2();
		 tt2.doRun();
	 }
	}