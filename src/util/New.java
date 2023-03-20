package util;

import java.util.*;

public class New {
    public static <K,V> Map<K,V> map() {
        return new HashMap<>();
    }
    public static <T> List<T> list() {
        return new ArrayList<>();
    }
    public static <T> LinkedList<T> linkedList() {
        return new LinkedList<>();
    }
    public static <T> Set<T> set() {
        return new HashSet<>();
    }
    public static <T> Queue<T> queue() {
        return new LinkedList<>();
    }

    public static void main(String[] args) {
        System.out.println(New.map());
        Map<String,List<String>> sls = New.map();
        sls.put("first",new ArrayList<>());
        System.out.println(sls);
        Map<String,List<String>> slss = new HashMap<>();
    }
}
