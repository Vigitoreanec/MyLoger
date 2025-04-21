package Loger;

import java.io.FileWriter;

public class FileLoger extends MyLoger {
    @Override
    public void getLog(String text) {
        try (FileWriter writer = new FileWriter("logfile.txt", true)) {
            writer.write("FILE LOG: " + formatMessage(text) + "\n");
        } catch (Exception e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
