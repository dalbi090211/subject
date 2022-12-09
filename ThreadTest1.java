// Thread 클래스를 상속받아 작성한 쓰레드 클래스
	class MyThread1 extends Thread {
	
	 public MyThread1(String name) {
	 	 // Thread(String)을 호출하여 쓰레드의 이름을 설정함
		 super(name);
	 }
	
	 // 쓰레드의 실행 부분 정의 함수
	 public void run() {
		 for(int i = 0; i < 5; i++) {
			 // 쓰레드의 이름을 출력
		 	 System.out.println("Thread Name is " + 
				 getName());
			
			 try {
				 // 쓰레드의 지정한 시간만큼 sleep()시킴
				 sleep(100);	
			 } catch(InterruptedException e) {}
		 }
	 }	
	}

	public class ThreadTest1 {
	 // 사용자가 정의한 쓰레드 객체 선언	
 	 MyThread1 t1, t2, t3;
	 public void doRun() {
		 // 사용자가 정의한 쓰레드 객체 생성
		 t1 = new MyThread1("T1");
		 t2 = new MyThread1("T2");
		 t3 = new MyThread1("T3");
		
		 // 쓰레드 동작 개시
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
		 ThreadTest1 tt1 = new ThreadTest1();
		
		 tt1.doRun();
	 }
	}