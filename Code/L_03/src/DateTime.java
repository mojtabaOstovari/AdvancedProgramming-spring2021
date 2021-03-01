public class DateTime extends Date {
    private int hour;
    private int minute;
    private int second;

    public DateTime(int year, int month, int day, int hour, int minute, int second){
        super(year, month, day);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }

    public void setHour(int value){
        if (value>0 && value<24){
            this.hour = value;
        }
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
}
