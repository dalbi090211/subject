// 쓰레드 클래스 정의
	class MyThread extends Thread {
	 String name;

	 public MyThread(ThreadGroup tg, String name) {
		 // 쓰레드를 그룹에 연결시키고 자신의 이름을 지정한다. 
		 super(tg, name);
	
 	 	 this.name = name;
	 }
	
	 // 무한 루프를 도는 쓰레드의 내용
	 public void run() {
	
		 while(true) {
			 try {
				 sleep(100);
			 } catch(InterruptedException e) {
			   System.out.println("InterruptedException");
			 }
		 }
 	 }
	}

	public class ThreadGroupTest {
	 // 쓰레드 객체 선언
	 MyThread mt1, mt2, mt3;
	 // 쓰레드 그룹 객체 선언
 	 ThreadGroup tg;
	 // 쓰레드의 배열
 	 MyThread list[];
	
	 public ThreadGroupTest() {
		 // 쓰레드 그룹 객체 생성
		 tg = new ThreadGroup("TG");
		
		 // 쓰레드 객체를 "tg" 쓰레드 그룹하에 지정한 이름으로 연결한다.
		 mt1 = new MyThread(tg, "one");
		 mt2 = new MyThread(tg, "two");
		 mt3 = new MyThread(tg, "three");
		
		 // 각 쓰레드를 활성화시킨다.
		 mt1.start();
		 mt2.start();
		 mt3.start();
	 }
	
	 public static void main(String args[]) {
		 ThreadGroupTest tgt = new ThreadGroupTest();
		
		 tgt.go();
	 }
	
	 public void go() {
		 // 쓰레드 그룹의 이름을 출력한다.
		 System.out.println("getName() = " + tg.getName());
		 // 쓰레드 그룹의 최대 우선순위를 출력한다.
		 System.out.println("getMaxPriority() = " + tg.getMaxPriority());
		 // 쓰레드 그룹에 있는 쓰레드의 수를 구한다.
		 System.out.println("activeCount() = " + tg.activeCount());
		 // 쓰레드 그룹의 정보를 스트링으로 출력한다.
		 System.out.println("toString() = " + tg.toString());
		
		 int ac = tg.activeCount();
		 list = new MyThread[ac];
		
		 // 쓰레드 그룹의 쓰레드들을 쓰레드 배열로 만든다.
		 tg.enumerate(list, false);
		
		 // 쓰레드 배열의 쓰레드 이름을 출력한다.
		 for(int i = 0; i < list.length; i++) {
			 System.out.println("list[" + i + "].getName() = " +
				  list[i].getName());
		 }
	 }
	}