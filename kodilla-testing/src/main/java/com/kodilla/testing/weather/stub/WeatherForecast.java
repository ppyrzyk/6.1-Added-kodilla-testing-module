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
        Map<String, Double> list = new HashMap<>();
        double medianTemp;
        List<Double> tempList = new ArrayList<>();
        for (Map.Entry<String, Double>
                entry :temperatures.getTemperatures().entrySet()) {
            tempList.add(entry.getValue());
        }
        Collections.sort(tempList);
        System.out.println(tempList);

        {
            if (tempList.size() % 2 != 0) {
                medianTemp = tempList.get(tempList.size() / 2);
//                        System.out.println(medianTemp);
            } else {
                medianTemp = (tempList.get(tempList.size() / 2) + tempList.get(tempList.size() / 2 - 1)) /2;
//                        System.out.println(medianTemp + " " + "nie parzyste");
            }
        }
        return list;
    }
}