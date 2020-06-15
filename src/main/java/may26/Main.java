package may26;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<String>();
        cities.add("Lawrenceville");
        cities.add("San Francisco");
        cities.add("Seoul");
        List<Double> temperatures = new ArrayList<Double>();
        temperatures.add(70.0);
        temperatures.add(59.0);
        temperatures.add(75.0);
        System.out.printf("%-20s %.2f\n", cities.get(0),temperatures.get(0));
        System.out.printf("%-20s %.2f\n", cities.get(1),temperatures.get(1));
        System.out.printf("%-20s %.2f\n", cities.get(2),temperatures.get(2));

        Map<String,Double> map = new HashMap<String, Double>();
        map.put("Lawrenceville", 70.0);
        map.put("San Francisco", 75.0);
        System.out.println("Lawrenceville is currently " + map.get("Lawrenceville"));
        System.out.println("San Francisco is currently " +map.get("San Francisco"));

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String city: map.keySet()){
            System.out.println("key: " + city + "valued: " + map.get(city));
        }

        map.remove("San Francisco");
        System.out.println("Current Size " + map.size());
        System.out.println(map.containsKey("Los Angeles"));

        //what is a set? is like a list but with unique elements
        Set<String> names = new HashSet<String>();
        names.add("John");
        names.add("Jane");
        names.add("John");
        System.out.println(names);

        String name = "Oscar";
        System.out.println(name.hashCode());

       Map<Integer, String> strings = new HashMap<Integer,String>();
       Set<Integer> set = new HashSet<Integer>();

       Map<String,int[]> scores = new HashMap<String, int[]>();
       scores.put("Bill", new int[]{90,70,50});
       scores.put("Mary", new int[]{50,34,50});


        /*while(true){
           String str =  RandomStringUtils.randomAlphabetic(3);
           if(strings.containsKey(str.hashCode())){
               System.out.println("Collision Detected");
               System.out.println(str + "" + str.hashCode());
               System.out.println(strings.get(str.hashCode()) + "" + str.hashCode());
           }
            strings.put(str.hashCode(),str);

         */
        }



    }

