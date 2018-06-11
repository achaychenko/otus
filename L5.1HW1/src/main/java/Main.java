import ru.otus.achaychenko.tests.MySource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {


        ArrayList<Integer> x = new ArrayList<>();

        x.add(4);
        x.add(16);
        x.add(9);

        System.out.println(x.stream().reduce(0, (a, b) -> a + b));
    }
}
