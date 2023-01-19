import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        AtomicInteger count = new AtomicInteger();
        source.forEach(integer -> {
            if (integer >= treshold) {
                logger.log("Элемент \"" + integer + "\" проходит");
                result.add(integer);
                count.getAndIncrement();
            } else {
                logger.log("Элемент \"" + integer + "\" не проходит");
            }
        });
        logger.log("Прошло фильтр " + count.get() + " из " + source.size());
        return result;
    }
}