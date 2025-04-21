import Loger.ConsoleLoger;
import Loger.FileLoger;
import Loger.MyLoger;

public class Main {
    public static void main(String[] args) {
        MyLoger loger = new ConsoleLoger();
        MyLoger fileLoger = new FileLoger();
        loger.getLog("Начало работы программы");
        fileLoger.getLog("Начало работы программы");
        loger.getLog("Попытка выполнить операцию");
        fileLoger.getLog("Попытка выполнить операцию");
        int a = 10, b = 0;
        try {
            int result = a / b;
            loger.getLog("Результат: " + result);
            fileLoger.getLog("Результат: " + result);
        } catch (Exception e) {
            loger.getLog("Ошибка: " + e);
            fileLoger.getLog("Ошибка: " + e);
        }

    }
}