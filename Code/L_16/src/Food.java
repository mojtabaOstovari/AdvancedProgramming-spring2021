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
                a.eatPizza();
            }
        }).start();
    }
}


class A{
    volatile boolean pizzaAvailable = false;

    void makePizza(){
        pizzaAvailable = true;
    }

    void eatPizza(){
        while (!pizzaAvailable){

        }
        System.out.println("I'm eating...");
        pizzaAvailable = false;

    }
}

