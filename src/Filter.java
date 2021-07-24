import java.util.ArrayList;
import java.util.List;

public record Filter(int boundary) {

    public void filterOut(List<Integer> source) {
        int counter = 0;
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();

        for (Integer number : source) {
            if (number < boundary) {
                logger.log("Элемент \"" + number + "\" не проходит");
            } else {
                logger.log("Элемент \"" + number + "\" проходит");
                counter++;
                result.add(number);
            }

        }

        logger.log("Прошло фильтр " + counter + " элемента из " + source.size());
        logger.log("Выводим результат на экран\n" +
                "Отфильтрованный список: " + result);
    }
}