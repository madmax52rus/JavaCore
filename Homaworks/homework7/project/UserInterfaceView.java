package lesson7.project;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения прогноза на 1 день; " +
                    "Введите 5 для получения прогноза на 5 дней; " +
                    "Введите 0 для завершения.");
            String command = scanner.nextLine();

            //TODO* Сделать метод валидации пользовательского ввода

            if("0".equals(command)) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
