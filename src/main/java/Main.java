import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.generate(()->(int)(Math.random()*100)).limit(30).collect(Collectors.toList());

    }

}
