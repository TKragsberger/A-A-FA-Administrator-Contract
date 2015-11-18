/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto.ship;

import java.util.Date;

/**
 *
 * @author Thomas
 */
public class LargeShipDetail extends ShipDetail{
    
    private String currentDeckPosition;
    private int carCapacity;
    private int largeVehicleCapacity;

    public LargeShipDetail(long shipId, int passengerCapacity, String name, Date lastMaintenace, String currentDeckPosition, int carCapacity, int largeVehicleCapacity) {
        super(shipId, passengerCapacity, name, lastMaintenace);
        this.currentDeckPosition = currentDeckPosition;
        this.carCapacity = carCapacity;
        this.largeVehicleCapacity = largeVehicleCapacity;
    }

    @Override
    public String getShipDescription() {
        return "Walking passengers, Small cars, Large vehicles, Changeable deck";
    }
    
    public String changeDeck(String newPosition){
        if(!currentDeckPosition.equals(newPosition)){
            currentDeckPosition = newPosition;
            return currentDeckPosition;
        } else {
            return "Deck not changed";
        }
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    public int getLargeVehicleCapacity() {
        return largeVehicleCapacity;
    }

    public void setLargeVehicleCapacity(int largeVehicleCapacity) {
        this.largeVehicleCapacity = largeVehicleCapacity;
    }

    public String getCurrentDeckPosition() {
        return currentDeckPosition;
    }
}
