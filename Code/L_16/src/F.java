public class F {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new MyRunnable());
        thread.start();
        thread.join();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();

    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("hi");
    }
}
