public class Date {
    int day;
    int month;
    int year;

    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    String dayOfWeek(){
        // ---
        return "";
    }
    boolean isWeekend(){
        // ---
        return true;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    int distance(Date date1){
        // ---
        return 0;
    }

    void f(){
        System.out.println("Im in Date");
    }


}
