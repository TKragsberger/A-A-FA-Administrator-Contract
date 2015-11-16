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
public class WeatherDetail {
    private String weather;
    private Date date;

    public WeatherDetail(String weather, Date date) {
        this.weather = weather;
        this.date = date;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
