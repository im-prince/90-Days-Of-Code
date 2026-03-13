package day13;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfArrayElement {
    public static void main(String[] args) {
        int[] a= {20,20,20,4,5,76,4,65,67,5,4,5,4};

        frequencyOfElement(a);

    }

    static void frequencyOfElement(int[] a){
        Map<Integer,Integer> map = new HashMap<>();
        for (int e : a){
            if (map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }else {
                map.put(e,1);
            }

        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
