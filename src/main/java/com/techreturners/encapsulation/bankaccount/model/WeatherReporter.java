package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    static final int TEMP_MAX_COMFORTABLE = 30;
    static final int TEMP_MIN_COMFORTABLE = 10;

    private final String location;
    private final double temperature;
    private final WeatherType weatherType;

    public WeatherReporter(String location, WeatherType weatherType, double temperature) {
        if( location==null || location.isBlank() )
            throw new IllegalArgumentException("WeatherReporter(): null or empty location string passed");

        this.location = location;
        this.temperature = temperature;
        this.weatherType = weatherType;
    }

    public String getLocation() { return location; };
    public double getTemperature() { return temperature; };

    public boolean locationIs(String location) {
        return this.location.equals(location);
    }

    public String getWeatherIcon() {
        String weatherIcon;
        switch (weatherType) {

            case RAIN:
                weatherIcon = "☔";
                break;

            case SNOW:
                weatherIcon = "⛄";
                break;

            case CLOUDY:
                weatherIcon = "☁";
                break;

            case SUNNY:
                weatherIcon = "\uD83C\uDF1E";
                break;

            case SUNNY_INTERVALS:
                weatherIcon = "⛅";
                break;

            default:
                weatherIcon = null;
        }

        return weatherIcon;
    }


    public String describeTemperature() {
        if (temperature > TEMP_MAX_COMFORTABLE) {

            return "It's too hot 🥵!";

        } else if (temperature < TEMP_MIN_COMFORTABLE) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
