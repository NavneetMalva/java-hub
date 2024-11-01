package info;

import java.util.HashMap;
import java.util.Map;

public class HashMapQ {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"John");
        map.put(2,"Jane");
        map.put(null,"Rick");
        map.put(null,"Mary");
        map.put(null, null);

        /**
         * Even though map can only have one null key, it will compile and run fine
         * just that in output we will get only one output will null key with the last entry
         * null null
         * 1 John
         * 2 Jane
         */

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
