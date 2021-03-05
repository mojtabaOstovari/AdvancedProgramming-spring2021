package ir.sharif.math;

import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDateTime;


public class MyLogger {
    static String add = "./log.txt";
    static MyLogger myLogger;
    PrintStream printStream;

    public static MyLogger getLogger() {
        if (myLogger == null) {
            myLogger = new MyLogger();
        }
        return myLogger;
    }


    private MyLogger() {
        try {
            printStream = new PrintStream(add);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void log(String log) {
        printStream.println(LocalDateTime.now() + "  " + log);
        printStream.flush();
    }
}
