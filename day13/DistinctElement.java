package day13;


import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {

        int[] a = {1,2,2,3,2,1,3,4,5,2,4};
        System.out.println(countElement(a));

    }

    static int countElement(int[] a){

        HashSet<Integer> set = new HashSet<>();
        for(int e :a ){
            set.add(e);

        }
        return set.size();
    }
}
