import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int N = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int M = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> digitals = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            digitals.add(random.nextInt(M));
        }
        System.out.println("Вот случайный список: " + digitals);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(digitals);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}