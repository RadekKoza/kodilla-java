package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
     private Map<String, Double> generateTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();
        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Krakow", 26.2);
        stubResult.put("Wroclaw", 24.8);
        stubResult.put("Warszawa", 25.2);
        stubResult.put("Gdansk", 26.1);
        return stubResult;
    }
    Map<String, Double> temperaturesMap = generateTemperatures();

    @Mock
    private Temperatures temperaturesMock;
    @DisplayName("Forecast test")
    @Test
    void testCalculateForecastWithMock()
    {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @DisplayName("Mean temperature calculation test")
    @Test
    void testCalculateMeanTemperature()
    {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double meanTemperature = weatherForecast.calculateMeanTemperature();
        //Then
        Assertions.assertEquals(25.56, meanTemperature);
    }
    @DisplayName("Median temperature calculation test")
    @Test
    void testCalculateMedianTemperature()
    {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double medianTemperature = weatherForecast.calculateMedianTemperature();
        //Then
        Assertions.assertEquals(25.5, medianTemperature);
    }
}