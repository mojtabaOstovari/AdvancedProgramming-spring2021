public class App {
    public static void main(String[] args) throws InterruptedException {
        Point point = new Point();
        MyThread thread0 = new MyThread(point);
        MyThread thread1 = new MyThread(point);

        thread0.start();
        thread1.start();

        thread0.join();
        thread1.join();

        System.out.println(point);

    }

}

class MyThread extends Thread {
    Point point;

    MyThread(Point point) {
        this.point = point;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000 ; i++) {
            point.addBy0(1, 1);
        }
    }
}

class Point{
    Integer x;
    Integer y;
    Object ali = new Object();
    Object sara = new Object();

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    synchronized void addBy0(int xDirection, int yDirection){
            x += xDirection;
            y += yDirection;
    }

    void addBy1(int xDirection, int yDirection){
        synchronized (this.x){
            x += xDirection;
        }
        synchronized (this.y){
            y += yDirection;
        }
    }

    synchronized void addByTwo(){
            x += 2;
            y += 2;
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y;
    }
}

