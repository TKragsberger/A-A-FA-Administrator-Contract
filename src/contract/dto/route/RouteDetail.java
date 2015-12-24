/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract.dto.route;

/**
 *
 * @author Thomas
 */
public class RouteDetail extends RouteIdentifier{
    private String startDestination;
    private String endDesitination;
    private double price;
    private int travelTime;

    public RouteDetail(long id, String startDestination, String endDesitination, double price, int travelTime) {
        super(id);
        this.startDestination = startDestination;
        this.endDesitination = endDesitination;
        this.price = price;
        this.travelTime = travelTime;
    }

    public String getStartDestination() {
        return startDestination;
    }

    public void setStartDestination(String startDestination) {
        this.startDestination = startDestination;
    }

    public String getEndDesitination() {
        return endDesitination;
    }

    public void setEndDesitination(String endDesitination) {
        this.endDesitination = endDesitination;
    }
    
    public double getPrice(){
        return price;
    } 
    
    public void setPrice(double price){
        this.price = price;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
}
