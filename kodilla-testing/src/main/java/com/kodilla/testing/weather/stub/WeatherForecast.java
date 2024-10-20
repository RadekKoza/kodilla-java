package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public Double calculateMeanTemperature() {
        double meanTemperature = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            meanTemperature += temperature.getValue();
        }
        meanTemperature /= temperatures.getTemperatures().size();
        return meanTemperature;
    }
    public Double calculateMedianTemperature() {
        double medianTemperature = 0;
        List<Double> temperaturesList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);
        if (temperaturesList.size()%2 == 1)
            medianTemperature = temperaturesList.get(temperaturesList.size()/2);
        else
            medianTemperature = (temperaturesList.get(temperaturesList.size()/2) - temperaturesList.get(temperaturesList.size()/2-1)) / 2;
        return medianTemperature;
    }
}