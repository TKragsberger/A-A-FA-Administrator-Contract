/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto.ship;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Thomas
 */
public abstract class ShipDetail extends ShipIdentifier{
    private int passengerCapacity;
    private String name;
    private Date lastMaintenance;

    public ShipDetail(long shipId, int passengerCapacity, String name, Date lastMaintenance) {
        super(shipId);
        this.passengerCapacity = passengerCapacity;
        this.name = name;
        this.lastMaintenance = lastMaintenance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int PassengerCapacity) {
        this.passengerCapacity = PassengerCapacity;
    }

    public Date getLastMaintenance() {
        return lastMaintenance;
    }

    public void setLastMaintenance(Date lastMaintenance) {
        this.lastMaintenance = lastMaintenance;
    }
    
    public abstract String getShipDescription();
}
