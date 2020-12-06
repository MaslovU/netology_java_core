package homework1_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> evenList = new ArrayList<>();
        for (int el: intList) {
            if (el > 0 && el % 2 == 0) evenList.add(el);
        }
        for (int i = 0; i < evenList.size(); i++) {
            for (int j = i + 1; j < evenList.size(); j++) {
                if (evenList.get(i) > evenList.get(j)) {
                    int temp = evenList.get(i);
                    evenList.set(i, evenList.get(j));
                    evenList.set(j, temp);
                }
            }
        }
        System.out.println(evenList);
    }
}
