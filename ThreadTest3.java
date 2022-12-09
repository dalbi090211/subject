import java.awt.*;
	import java.applet.*;

	// 애플릿이면서 쓰레드를 이용하는 클래스
	public class ThreadTest3 extends Applet implements Runnable {
	 int X = 1, Y = 1, width = 1, height = 1;
	 // 쓰레드 변수 선언
 	 Thread t1;

	 public void init() {
		 // this를 Runnable로 사용하여 쓰레드 생성
		 t1 = new Thread(this);
 	 }
	 public void start() {
		 // 쓰레드의 동작이 없는 상태이면 즉, 쓰레드가 끝난(dead) 상태이면
		 // 쓰레드를 정의하고 실행을 시작시킨다.
		 if(!t1.isAlive()) {
		
			 // 쓰레드를 정의한다.
			 t1 = new Thread(this);
	 	 }
		 // 쓰레드 실행을 시작시킨다.
		 t1.start();
	 }

	 public void stop() {
		 // 쓰레드의 동작이 있는 상태이면 쓰레드의 동작을 끝낸다.
		 if(t1.isAlive()) {
		
			 // 쓰레드를 종료한다.
			 t1.stop();
		 }
	 }

	 public void paint(Graphics g) {
		 int c1, c2, c3;

		 // 애플릿의 크기를 구한다.
	 	 Dimension d = getSize();
		 width = d.width;
		 height = d.height;

		 c1 = (int)(Math.random() * 1000) % 256;
		 c2 = (int)(Math.random() * 1000) % 256;
		 c3 = (int)(Math.random() * 1000) % 256;

		 g.setColor(new Color(c1, c2, c3));
		 g.fill3DRect(X, Y, 20, 20, true);
	 }
	 public void update(Graphics g) {
		 paint(g);
	 }

	 public void run() {
		 while(true) {
			 try {
		 	 X = (int)(Math.random() * 1000) % width;
		 	 Y = (int)(Math.random() * 1000) % height;

			 repaint();

			 // 애플릿 쓰레드의 동작을 지연시킨다.
			 Thread.sleep(100);
			 } catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		 }                     
	 }
	}