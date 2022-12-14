//스레드를 상속받아 생성하는 방식
class MyThread1 extends Thread {
    int sequence;
    MyThread1(int sequence){
        super();
        this.sequence = sequence;
    }
    public void run() {
         try{
            System.out.println(sequence + "번 스레드 실행입니다.");
            Thread.sleep(1000);
        }
         catch(InterruptedException e){};
    }
}
//runnable객체를 만들어 스레드를 만드는 방식
class MyThread2 implements Runnable {
	int sequence;
    MyThread2(int sequence){
        super();
        this.sequence = sequence;
    }
    public void run() {
         try{
            System.out.println("3번 스레드 실행입니다.");
            Thread.sleep(1000);
        }
         catch(InterruptedException e){};
    }
}
    	
public class Threadtest {
    Thread t1, t2, t3;
    Thread t4, t5, t6;
    public Threadtest(){      
        int thread_dead_point = 0;  
        t1 = new MyThread1(1);
        t2 = new MyThread1(2);
        Runnable r3 = new MyThread2(3);
        t3 = new Thread(r3, "Runnable_Class");

        //스레드의 동작순서는 작성순서와는 상관없음
        t1.start();
        t2.start();
        t3.start();
        //isAlive()를 통해 스레드가 죽었는지를 확인
        while(thread_dead_point != 3){
            thread_dead_point = 0;
            if(!t1.isAlive()){
                thread_dead_point += 1;
            }
            if(!t2.isAlive()){
                thread_dead_point += 1;
            }
            if(!t3.isAlive()){
                thread_dead_point += 1;
            }
        }
        System.out.println("1~3번 스레드가 죽었습니다.");
    }

    public static void main (String args[]){
        Threadtest tt1 = new Threadtest();
        tt1.restart();
    }

    public void restart(){
        t4 = new MyThread1(4);
        t5 = new MyThread1(5);
        t6 = new MyThread1(6);
        t4.start();
        t5.start();
        t6.start();
        //join메소드를 통해 죽을때까지 기다림
        try{
            t4.join();
            t5.join();
            t6.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("스레드가 다 죽었습니다.");
    }

    
}
 