import java.util.concurrent.atomic.AtomicInteger;

public class Food {
    public static void main(String[] args) {
        A a = new A();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                a.makePizza();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.eatPizza();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}


class A{
    private boolean pizzaAvailable = false;
    private final Object ali = new Object();
    Integer i = 0;
    AtomicInteger atomicI;

    void makePizza(){
        synchronized (ali){
            pizzaAvailable = true;
            ali.notifyAll();
        }
    }

    void eatPizza() throws InterruptedException {
        synchronized (ali) {
            while (!pizzaAvailable) {
                ali.wait();
            }
            System.out.println("I'm eating...");
            pizzaAvailable = false;
        }
    }

    void increaseI(){
        synchronized (i){
            i++;
        }
    }

    void f() {
        synchronized (i){
            if (this.i == 5) {
                this.i = 0;
            }
        }

        atomicI.compareAndExchange(5, 0);
        int a = atomicI.addAndGet(7);

    }

    synchronized void outer(){
        inner();
    }

    synchronized void inner(){
        innerInner();
    }

    synchronized void innerInner(){
        i++;
    }

}

