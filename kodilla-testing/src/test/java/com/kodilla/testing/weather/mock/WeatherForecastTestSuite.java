package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    private Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    void setup() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testTempAverage() {
        // Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        Map<String,Double> tempList = weatherForecast.calculateForecast();
        double tempAverage;
        double tempSum = 0.0;
        for(Map.Entry<String,Double> temperature: tempList.entrySet()) {
            tempSum += temperature.getValue();
        }
        tempAverage = tempSum/tempList.size();
        // Then
        Assertions.assertEquals(25.56, tempAverage);

    }
    @Test
    void testTempMedian() {
//        Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
//        When
        Map<String,Double> medianList = weatherForecast.calculateForecast();
        Set<Map.Entry<String, Double>> entrySet = temperaturesMap.entrySet();
        List<Map.Entry<String, Double>> sortedList = new ArrayList<Map.Entry<String, Double>>(medianList.entrySet());
        Collections.sort(sortedList, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2)
            {
                return 0;
            }
        });
        System.out.println(sortedList);
        double medianTemp = sortedList.get(2).getValue();
//        Then
        Assertions.assertEquals(25.5, medianTemp);


    }
}