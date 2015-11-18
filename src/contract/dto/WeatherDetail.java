/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto;

import java.util.Date;

/**
 *
 * @author Thomas
 */
public class WeatherDetail extends WeatherIdentifier{
    private String weather;

    public WeatherDetail(Date date, String weather) {
        super(date);
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
