public class DateTime extends Date {
    int hour;
    int minute;
    int second;

    DateTime(int year, int month, int day, int hour, int minute, int second){
        super(year, month, day);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return super.toString() + "  " + hour + ":" + minute + ":" + second;
    }

    int distance(DateTime dt1){
        int s = super.distance(dt1) * 24 * 60 * 60;
        // --
        return 0;
    }

    void f(){
        System.out.println("Im in Date Time");
    }

    void g(){
        System.out.println("Hi");
    }

    public int getHour() {
        return hour;
    }
}
