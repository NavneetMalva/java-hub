package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateCharInString {

    public static void main(String[] args) {
        String str = "banana";
        List<Character> duplicateChar = findDuplicateChar(str);
        System.out.println("Duplicate char : " + duplicateChar);
    }

    public static List<Character> findDuplicateChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }

        List<Character> resultList = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()> 1){
                resultList.add(entry.getKey());
            }
        }
        return resultList;
    }
}
