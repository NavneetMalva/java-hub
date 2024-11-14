package info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 4, 3, 2, 8, 1, 22, 4};
        Map<Integer, Integer> mp = new HashMap<>();

        for (int e : arr) {
            if (mp.containsKey(e)) {
                mp.put(e, mp.get(e) + 1);
            } else {
                mp.put(e, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        System.out.println("Unique elements which are not repeated in arr :"+ list);


    }
}
