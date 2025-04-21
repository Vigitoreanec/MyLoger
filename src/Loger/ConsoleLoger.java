package Loger;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConsoleLoger extends MyLoger {

    @Override
    public void getLog(String text) {
        System.out.println("CONSOLE LOG: " + formatMessage(text));
    }
}
