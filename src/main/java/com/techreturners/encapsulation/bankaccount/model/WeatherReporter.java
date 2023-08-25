package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    static final int TEMP_MAX_COMFORTABLE = 30;
    static final int TEMP_MIN_COMFORTABLE = 10;

    private final String location;
    private final double temperature;

    public WeatherReporter(String location, WeatherType weatherType, double temperature) {
        if( location==null || location.isBlank() )
            throw new IllegalArgumentException("WeatherReporter(): null or empty location string passed");

        this.location = location;
        this.temperature = temperature;
    }

    String getLocation() { return location; };
    double getTemperature() { return temperature; };

    boolean locationIs(String location) {
        return this.location.equals(location);
    }

    public String getWeatherIcon(WeatherType weatherType) {
        switch (weatherType) {
            case RAIN -> {
                return "☔";
            }
            case SNOW -> {
                return "⛄";
            }
            case CLOUDY -> {
                return "☁";
            }
            case SUNNY -> {
                return "\uD83C\uDF1E";
            }
            case SUNNY_INTERVALS -> {
                return "⛅";
            }
            default -> {
                return null;
            }
        }
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
