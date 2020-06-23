import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.SocketHandler;

public class Apple {

    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;
        Apple apple = (Apple) o;
        return Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
        //return 1;
    }

    public static void main(String[] args) {
        Apple a1 = new Apple("green");
        Apple a2 = new Apple("red");

        Map<Apple, Integer> apples = new HashMap<>();
        apples.put(a1, 10);
        apples.put(a2, 15);

        Integer integer = apples.get(a1);
        System.out.println(apples.get(a2) - apples.get(a1));

        System.out.println(apples.get(new Apple("green")));
    }
}
