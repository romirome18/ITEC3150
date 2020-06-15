package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       String[] lines = CityCSVReader.getLines();
        List<City> cities = CityCSVReader.getCities();
        System.out.println(cities);

        City salem = null;
        City austin = null;
        City atlanta = null;
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getState().equals("Oregon")){
                salem = cities.get(i);
            }else if(cities.get(i).getState().equals("Texas")){
                austin = cities.get(i);
            }else if(cities.get(i).getState().equals("Georgia")){
                atlanta = cities.get(i);
            }

        }
        assert salem.getState().equals("Oregon");
        assert austin.getState().equals("Texas");
        assert atlanta.getState().equals("Georgia");
        WeatherHelper.setWeatherInfo(salem);
        WeatherHelper.setWeatherInfo(austin);
        WeatherHelper.setWeatherInfo(atlanta);
        System.out.println(salem);
        System.out.println(austin);
        System.out.println(atlanta);
        List<City> favCities = new ArrayList<City>();
        favCities.add(salem);
        favCities.add(austin);
        favCities.add(atlanta);
        Collections.sort(favCities);
        Collections.sort(favCities, new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) { return o1.getUvIndex()-o2.getUvIndex(); }
        });
        System.out.println(favCities);
        }

}



