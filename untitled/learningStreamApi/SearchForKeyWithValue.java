package learningStreamApi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// We are given a Map we have to search for the reference key if the value exists
public class SearchForKeyWithValue {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"a");
        integerStringMap.put(2,"b");
        integerStringMap.put(3,"c");
        integerStringMap.put(4,"d");

        String value = "b";
        if(integerStringMap.containsValue(value)){
            Set<Integer> keySet = integerStringMap.keySet();
            Iterator it = keySet.iterator();
            while (it.hasNext()){
                Object nextKey = it.next();
                if (integerStringMap.get(nextKey) == value){
                    System.out.println(nextKey+" : "+value);
                }
            }
        } else System.out.println("Value Dosent Exist");
    }


}
