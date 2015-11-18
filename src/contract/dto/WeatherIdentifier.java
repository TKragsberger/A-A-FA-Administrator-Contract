/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Thomas
 */
public class WeatherIdentifier implements Serializable{
    private final Date date;

    public WeatherIdentifier(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
