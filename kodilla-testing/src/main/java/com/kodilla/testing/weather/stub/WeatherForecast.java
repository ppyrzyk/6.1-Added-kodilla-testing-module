package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;

    }


    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue()); // [1]
        }
        return resultMap;
    }

    public Map<String, Double> calculateTempAverage() {
        Map<String, Double> tempList = new HashMap<>();
        double tempSum = 0.0;
        double tempAverage;
        for (int i = 0; i < tempList.size(); i++) ;
        tempSum += tempList.get(0);
        tempAverage = tempSum / tempList.size();
        return tempList;
    }

    public Map<String, Double> calculateTempMedian() {
        Map<String, Double> medianList = new HashMap<>();
        List<Map.Entry<String, Double>> sortedList = new ArrayList<>(medianList.entrySet());
        Collections.sort(sortedList, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return 0;
            }

            double medianTemp = sortedList.get(2).getValue();

        });
            return medianList;
    }
}