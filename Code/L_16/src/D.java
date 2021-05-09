import java.time.LocalDateTime;

public class D {
    public static void main(String[] args) throws InterruptedException {
        In in = new In();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    in.increaseI();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    in.increaseJ();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(in.i + " " + in.j);

    }
}

class In {
    Integer i = 0;
    Integer j = 0;
    private final Object lockI = new Object();
    private final Object lockJ = new Object();

    Lock lock0 = new Lock();
    Lock lock1 = new Lock();
    Lock lock2 = new Lock();
    Lock lock3 = new Lock();


    void increaseI(){
        synchronized (lockI){
            i++;
        }
        decreaseJ();

    }
    void increaseJ(){
        synchronized (lockJ){
            j++;
        }
        decreaseI();
    }

    void decreaseI(){
        synchronized (lockI){
            i--;
        }
    }
    void decreaseJ(){
        synchronized (lockJ){
            j--;
        }
    }

    void f(){
        lock0.lock();
        i+=5;
        lock0.release();
    }
}

class Lock{
    void lock(){
    }

    void release(){
    }
}
