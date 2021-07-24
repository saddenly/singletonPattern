import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка\n" +
                "Введите размер списка и границу для значении:");

        int size = scanner.nextInt();
        int top = scanner.nextInt();

        List<Integer> source = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            source.add((int) (Math.random() * (top + 1)));
        }

        logger.log("Создаем и наполняем список\n" +
                "Вот случайный список: " + source);
        logger.log("Просим пользователя ввести входные данные для фильтрации\n" +
                "Введите порог для фильтра:");
        int boundary = scanner.nextInt();

        Filter filter = new Filter(boundary);
        filter.filterOut(source);
        logger.log("Завершаем программу");
    }
}