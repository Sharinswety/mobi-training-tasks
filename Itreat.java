package mobitaining.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Itreat {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 30, 40, 23));
        list.stream().forEach(i -> System.out.println(i + ""));
    }
}
