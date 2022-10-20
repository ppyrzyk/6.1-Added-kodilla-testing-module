package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
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

    private static int testCounter = 0;

    @BeforeAll
    public static void before() {
        System.out.println("Weather forecast testing is starting!");
    }
    @AfterAll
    public static void after() {
        System.out.println("Weather forecast testing has finished");
    }




        @BeforeEach
    void setup() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        temperaturesMap.put("Torun", 27.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        testCounter++;
        System.out.println("Test #" + testCounter + " is starting");
    }
    @DisplayName("Testing calculating weather forecast with Mock")
    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(6, quantityOfSensors);
    }
    @DisplayName("Testing calculating temperature average")
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
        Assertions.assertEquals(25.816666666666666, tempAverage);

    }
    @DisplayName("Testing calculating the median of the temperatures")
    @Test
    void testTempMedian() {
//        Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
//        When
        Map<String, Double> list = weatherForecast.calculateForecast();
        List<Double> tempList = new ArrayList<>();
        for (Map.Entry<String, Double>
                entry : temperaturesMap.entrySet()) {
            tempList.add(entry.getValue());
        }
        Collections.sort(tempList);
//        System.out.println(tempList);
        double medianTemp;

        {
                    if (tempList.size() % 2 != 0) {
                        medianTemp = tempList.get(tempList.size() / 2);
//                        System.out.println(medianTemp);
                    } else {
                        medianTemp = (tempList.get(tempList.size() / 2) + tempList.get(tempList.size() / 2 - 1)) /2;
//                        System.out.println(medianTemp + " " + "nie parzyste");
                    }
                }

//        Then
        Assertions.assertEquals(25.8, medianTemp);
    }
}
