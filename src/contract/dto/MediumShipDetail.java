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
public class MediumShipDetail extends ShipDetail{
    
    private int carCapacity;

    public MediumShipDetail(long shipId, int passengerCapacity, String name, Date lastMaintenance, int carCapacity) {
        super(shipId, passengerCapacity, name, lastMaintenance);
        this.carCapacity = carCapacity;
    }

    @Override
    public String getShipDescription() {
        return "Walking passengers, Small cars";
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }
}
