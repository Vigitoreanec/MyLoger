package Loger;
package com.vigitoreanec.logger;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class MyLoger {
    private static final DateTimeFormatter formTime =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    // Запись в консоль
    public abstract void getLog(String text);

    protected String formatMessage(String text) {
        return "[" + LocalDateTime.now().format(formTime) + "] " + text;
    }
}
