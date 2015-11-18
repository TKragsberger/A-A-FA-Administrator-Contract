/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto;


public class ScheduleSummary extends ScheduleIdentifier{
    private int routeId;
    private int capacity;
    private int passengers;
    private int shipId;

    public ScheduleSummary(long id, int routeId, int capacity, int passengers, int shipId) {
        super(id);
        this.routeId = routeId;
        this.capacity = capacity;
        this.passengers = passengers;
        this.shipId = shipId;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getRouteId() {
        return routeId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getShipId() {
        return shipId;
    }

}
