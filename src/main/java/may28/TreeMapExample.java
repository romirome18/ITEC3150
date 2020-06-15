package may28;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Multimap;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        //LinkedHashMap puts them in as is
        Map<Integer,String> studentsMap = new TreeMap<Integer,String>();
        studentsMap.put(90001, "johnny");
        studentsMap.put(90002, "sally");
        studentsMap.put(80001,"ezekiel");
        System.out.println(studentsMap);
        Set<String> names = new TreeSet<String>();
        names.add("zach");
        names.add("tim");
        names.add("julie");
        names.add("aaron");
        System.out.println(names);

        BiMap<Integer,String> studentsBiMap =HashBiMap.create();
        studentsBiMap.put(90001, "johnny");
        studentsBiMap.put(90002, "sally");
        System.out.println(studentsBiMap.inverse().get("sally"));
        //research multimap and multiset
        //how do you use it and what are the concrete implementation and multiset
    }
}
